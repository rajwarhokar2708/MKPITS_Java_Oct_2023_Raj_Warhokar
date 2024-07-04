package com.example.bank.service.impl;

import com.example.bank.dto.request.UserRequestDto;
import com.example.bank.dto.responce.UserGetResponceDto;
import com.example.bank.dto.responce.UserPostResoponceDto;
import com.example.bank.dto.responce.UserPutResponceDto;
import com.example.bank.mysql.model.Account;
import com.example.bank.mysql.model.User;
import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.UserRepository;
import com.example.bank.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserGetResponceDto getUser(Integer id) {
        //optional type used beacuse we want to avoid null-pointer-exception
        //optional may not return null value it return either value or return empty optional that reason we avoid null-pointer-exception
        Optional<User> user;
        user = userRepository.findById(id);
        UserGetResponceDto getResponceDto = new UserGetResponceDto();
        if (user.isPresent()) {
            getResponceDto = convertUserModelToUserGetResponceDto(user.get());
        }
        return getResponceDto;
    }

    @Override
    public List<UserGetResponceDto> getAllUers() {
        List<User> userList = (List<User>) userRepository.findAll();
        List<UserGetResponceDto> dtoResponceList = new ArrayList<>();
        for (User user : userList) {
            UserGetResponceDto getResponceDtoDto = convertUserModelToUserGetResponceDto(user);
            dtoResponceList.add(getResponceDtoDto);
        }
        return dtoResponceList;
    }

    @Override
    @Transactional
    //We use transactional because if any transaction is failed to store data then the transaction will roll back
    //Transaction will help to not store half data or missing data in database
    public UserPostResoponceDto createUser(UserRequestDto userRequestDto) {
        User user = new User();
        user = convertUserRequestDtoToUserModel(userRequestDto, user);
        System.out.println(user.getId());
        user.setCreatedBy(user.getId() );
        user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);

        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccType(userRequestDto.getAccType());
        account.setRateOfInterest(8.0f);
        account.setBalance(userRequestDto.getBalance());
        account.setCreatedBy(user.getId());
        account.setCreatedAt(LocalDateTime.now());
        accountRepository.save(account);

        UserPostResoponceDto userPostResoponceDto = UserPostResoponceDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .accType(userRequestDto.getAccType())
                .balance(userRequestDto.getBalance())
                .build();
        return userPostResoponceDto;
    }

    @Override
    public UserPutResponceDto updateUser(UserRequestDto userRequestDto) {
        Optional<User> userOptional = userRepository.findById(userRequestDto.getId());
        if (userOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            User user = convertUserDtoToUserModel(userRequestDto, userOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUserModelToUserPutRsponceDto(user);
        }
        UserPutResponceDto putResponceDto = new UserPutResponceDto();
        return putResponceDto;
    }

    public UserPutResponceDto updatePartialUser(UserRequestDto userRequestDto) {
        Optional<User> userOptional = userRepository.findById(userRequestDto.getId());
//        System.out.println(userRequestDto.getId());
        if (userOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            User user = userOptional.get();
            user.setFullName(userRequestDto.getFullName() != null && !userRequestDto.getFullName()
                    .equals(user.getFullName()) ? userRequestDto.getFullName() : user.getFullName());
            user.setGender(userRequestDto.getGender() != null && !userRequestDto.getGender()
                    .equals(user.getGender()) ? userRequestDto.getGender() : user.getGender());
            user.setDob(userRequestDto.getDob() != null && !userRequestDto.getDob()
                    .equals(user.getDob()) ? userRequestDto.getDob() : user.getDob());

            userRepository.save(user);
            return convertUserModelToUserPutRsponceDto(user);
        }
        UserPutResponceDto putResponceDto = new UserPutResponceDto();
        return putResponceDto;
    }

    @Override
    public UserGetResponceDto deleteUser(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
//        AccountRequestDto accountRequestDto = new AccountRequestDto();
//        Integer getUserid = userRequestDto.getUserId();
//        System.out.println(getUserid);
        if (userOptional.isEmpty()) {
            System.out.println("User data with id : " + id + " not found");
            return null;
        } else {
            userRepository.deleteById(id);
//            accountRepository.deleteById(getUserid);
            System.out.println("User data with id : " + id + " delete successfully");
            return convertUserModelToUserGetResponceDto(userOptional.get());
        }
    }



    private User convertUserDtoToUserModel(UserRequestDto getRequestDto, User user) {

        user = User.builder()
                .fullName(getRequestDto.getFullName())
                .gender(getRequestDto.getGender())
                .dob(getRequestDto.getDob())
                .updatedBy(1)
                .updatedAt(LocalDateTime.now())
                .createdBy(1)
                .createdAt(LocalDateTime.now())
                .build();
        return user;
    }

    private UserGetResponceDto convertUserModelToUserGetResponceDto(User user) {
        UserGetResponceDto getResponceDto = UserGetResponceDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .gender(user.getGender())
                .dob(user.getDob())
                .build();
        return getResponceDto;
    }


    private User convertUserRequestDtoToUserModel(UserRequestDto userRequestDto, User user) {
        user = User.builder()
                .fullName(userRequestDto.getFullName())
                .gender(userRequestDto.getGender())
                .dob(userRequestDto.getDob())
                .build();
        return user;
    }


    private UserPutResponceDto convertUserModelToUserPutRsponceDto(User user) {
        UserPutResponceDto putResponceDto = UserPutResponceDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .gender(user.getGender())
                .dob(user.getDob())
                .build();
        return putResponceDto;

    }

}
