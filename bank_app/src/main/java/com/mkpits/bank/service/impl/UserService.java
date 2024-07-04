package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.model.sql.User;
import com.mkpits.bank.repository.UserRepository;
import com.mkpits.bank.service.IUserService;
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
        UserResponseDto userResponseDto = new UserResponseDto();
        if (userModel.isPresent()){
            userResponseDto = convertUserModelToUserDto(userModel.get());
        }
        return userResponseDto;
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = convertUserRequestDtoToUser(userRequestDto);
        user.setCin("456");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy(1);
//        user.setAadharCard("123456789123");
        user = userRepository.save(user);
        return convertUserToUserResponseDto(user);
    }

    private UserResponseDto convertUserToUserResponseDto(User user) {
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
//    @Override
//    public UserResponseDto createUser(UserRequestDto userRequestDto) {
//        User user = new User();
//        user = convertUserRequestDtoToUser(userRequestDto,user);
//        user.setCin("456");
//        user=  userRepository.save(user);
//        UserResponseDto userResponseDto = new UserResponseDto();
//        userResponseDto = convertUserToUserResponseDto( userResponseDto, user);
//        return userResponseDto;
//    }
//
//    private UserResponseDto convertUserToUserResponseDto(UserResponseDto userResponseDto, User user) {
//        userResponseDto = UserResponseDto.builder()
//                .firstName(user.getFirstName())
//                .middleName(user.getMiddleName())
//                .lastName(user.getLastName())
//                .gender(user.getGender())
//                .mobile(user.getMobile())
//                .email(user.getEmail())
//                .dateOfBirth(user.getDateOfBirth())
//                .cin(user.getCin())
//                .build();
//        return userResponseDto;
//    }
//
//
//    private User convertUserRequestDtoToUser(UserRequestDto userRequestDto, User user) {
//        return user = User.builder()
//                .firstName(userRequestDto.getFirstName())
//                .middleName(userRequestDto.getMiddleName())
//                .lastName(userRequestDto.getLastName())
//                .mobile(userRequestDto.getMobile())
//                .email(userRequestDto.getEmail())
//                .gender(userRequestDto.getGender())
//                .dateOfBirth(userRequestDto.getDateOfBirth())
//                .build();
//    }
//

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
