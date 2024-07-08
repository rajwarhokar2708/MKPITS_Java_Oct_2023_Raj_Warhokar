package com.mkpits.bank.service;

import com.mkpits.bank.dto.responce.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;

import java.util.List;

public interface IUserService {
    public List<UserResponseDto> getAllUsers();

    public UserResponseDto getUserByIdUser(Integer id);

    public UserResponseDto createUser(UserRequestDto userRequestDto);
}
