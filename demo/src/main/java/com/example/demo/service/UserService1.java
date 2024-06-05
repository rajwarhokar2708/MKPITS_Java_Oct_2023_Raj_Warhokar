package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService1 {
    @Autowired
    UserRepository userRepository;

    public UserDto getAllUser(){
        Optional<UserModel> userModel=userRepository.findById(1);
        UserDto userDto= new UserDto();
        if (userModel.isPresent()){
            userDto = convertUserModelToUserDto(userModel.get());
        }
        return userDto;
    }
    private UserDto convertUserModelToUserDto(UserModel userModel){
        UserDto userDto = new UserDto();
        userDto.setId(userModel.getId());
        userDto.setUsername(userDto.getUsername());
        userDto.setFirstName(userDto.getFirstName());
        userDto.setLastName(userDto.getLastName());
        userDto.setMobile(userDto.getMobile());
        userDto.setEmail(userDto.getEmail());
        return userDto;
    }

}
