package com.mkpits.bank.service;

import com.mkpits.bank.dto.responce.AccountResponseDto;

import java.util.List;

public interface IAccountService {
    public List<AccountResponseDto> getAllUserAccounts(Integer userId);
}
