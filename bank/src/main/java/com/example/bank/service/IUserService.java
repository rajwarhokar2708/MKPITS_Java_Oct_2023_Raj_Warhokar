package com.example.bank.service;

import com.example.bank.dto.request.AccountRequestDto;
import com.example.bank.dto.request.UserRequestDto;
import com.example.bank.dto.responce.UserGetResponceDto;
import com.example.bank.dto.responce.UserPostResoponceDto;
import com.example.bank.dto.responce.UserPutResponceDto;
import jakarta.transaction.Transactional;

import java.util.List;

public interface IUserService {
    public UserGetResponceDto getUser(Integer id);

    public List<UserGetResponceDto> getAllUers();

    @Transactional
    public UserPostResoponceDto createUser(UserRequestDto postRequestDto);

    public UserPutResponceDto updateUser(UserRequestDto getRequestDto );

    public UserPutResponceDto updatePartialUser(UserRequestDto userRequestDto);

    public UserGetResponceDto deleteUser(Integer id);
}
