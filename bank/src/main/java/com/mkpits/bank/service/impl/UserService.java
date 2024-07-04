package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.UserDto;
import com.mkpits.bank.model.sql.User;
import com.mkpits.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements  IUserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> usersList = (List<User>) userRepository.findAll();
        List<UserDto> userDtoArrayList=new ArrayList<>();
        for (User user : usersList){
            UserDto getUserDto =convertUserModelToUserDto(user);
            userDtoArrayList.add(getUserDto);
        }
        return userDtoArrayList;
    }

    private UserDto convertUserModelToUserDto(User user) {
        UserDto getUserDto =UserDto.builder()
                .firstName(user.getFirstName())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .gender(user.getGender())
                .cin(user.getCin())
                .aadharNo(user.getAadharCard())
                .build();
        return getUserDto;
    }
}
