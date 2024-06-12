package com.example.demo.service;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserResponseDto;

import java.util.List;

public interface IUserService {

    public List<UserRequestDto> getAllUsers();

    UserRequestDto getUserById(Integer id);

    public UserResponseDto createUser(UserRequestDto userRequestDto);

    public UserRequestDto updateUser(UserRequestDto managementDto);

    UserRequestDto updatePartialUser(UserRequestDto userRequestDto);

    UserRequestDto deleteUser(Integer id);
}
