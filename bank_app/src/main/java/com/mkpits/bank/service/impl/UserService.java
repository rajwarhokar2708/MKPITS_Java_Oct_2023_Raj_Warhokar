package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.responce.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.model.sql.*;
import com.mkpits.bank.repository.AccountRepository;
import com.mkpits.bank.repository.AddressRepository;
import com.mkpits.bank.repository.UserCredentialRepository;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserCredentialRepository userCredentialRepository;

    @Autowired
    AccountRepository accountRepository;

    Address address = new Address();

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> usersList = (List<User>) userRepository.findAll();
        List<UserResponseDto> userResponseDtoArrayList =new ArrayList<>();
        for (User user : usersList){
            UserResponseDto getUserResponseDto =convertUserModelToUserDto(user);
            userResponseDtoArrayList.add(getUserResponseDto);
        }
        return userResponseDtoArrayList;
    }

    @Override
    public UserResponseDto getUserByIdUser(Integer id) {
        Optional<User> userModel = userRepository.findById(id);
//         address = addressRepository.findAccountsByUserId(id);
        UserResponseDto userResponseDto = new UserResponseDto();
        if (userModel.isPresent()){
            userResponseDto.setAddress(address.getAddress());
            userResponseDto = convertUserModelToUserDto(userModel.get());
        }
        return userResponseDto;
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = convertUserRequestDtoToUser(userRequestDto);

        String cinNo= String.valueOf(LocalDateTime.now());
        user.setCin(cinNo.replaceAll("[^0-9]", "").substring(0,cinNo.replaceAll("[^0-9]", "").length()-6));
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy(1);
        user = userRepository.save(user);

        UserCredential userCredential = new UserCredential();
        userCredential.setUserId(user.getId());
//        userCredential.setUserName(userRequestDto.getUserName());
        userCredential.setPassword(userRequestDto.getPassword());
        userCredential=userCredentialRepository.save(userCredential);


        address.setUserId(user.getId());
        address.setAddress(userRequestDto.getAddress());
        address.setPinCode(userRequestDto.getPinCode());
        address = addressRepository.save(address);

        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccType(userRequestDto.getAccType());
        String cityCode = "456";String districtCode="852";String stateCode="624";String remaingAccountNumber = "0123";
        account.setAccNo(stateCode+cityCode+districtCode+remaingAccountNumber);
        account.setOpeningDate(LocalDate.now());
        account.setBalance(0.0);
        account = accountRepository.save(account);

        return convertUserToUserResponseDto(user,userCredential,address,account);
    }

    private UserResponseDto convertUserToUserResponseDto(User user,UserCredential userCredential,Address address,Account account) {

        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .gender(user.getGender())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .adhaarCard(user.getAdhaarCard())
                .dateOfBirth(user.getDateOfBirth())
                .cin(user.getCin())
//                .userName(userCredential.getUserName())
                .address(address.getAddress())
                .accType(account.getAccType())
                .pinCode(address.getPinCode())
                .build();
    }

    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto) {
        return User.builder()
                .firstName(userRequestDto.getFirstName())
                .middleName(userRequestDto.getMiddleName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .gender(userRequestDto.getGender())
                .dateOfBirth(userRequestDto.getDateOfBirth())
                .adhaarCard(userRequestDto.getAdhaarCard())
                .build();
    }


    private UserResponseDto convertUserModelToUserDto(User user) {
        UserResponseDto getUserResponseDto = UserResponseDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .gender(user.getGender())
                .cin(user.getCin())
                .adhaarCard(user.getAdhaarCard())
                .build();
        return getUserResponseDto;
    }
}
