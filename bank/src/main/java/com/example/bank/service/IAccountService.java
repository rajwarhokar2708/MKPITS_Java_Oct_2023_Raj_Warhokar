package com.example.bank.service;

import com.example.bank.dto.request.AccountRequestDto;
import com.example.bank.dto.request.MoneyTransferDto;
import com.example.bank.dto.responce.AccountGetResponceDto;
import com.example.bank.dto.responce.AccountPostResponceDto;
import com.example.bank.dto.responce.AccountPutResponceDto;

import java.util.List;

public interface IAccountService {
    public AccountGetResponceDto getAccount(Integer id);

    public AccountPutResponceDto updateAccount(AccountRequestDto accountRequestDto);

    public AccountPutResponceDto updatePartialAccount(AccountRequestDto accountRequestDto);

    public List<AccountGetResponceDto> getAllAccounts();


    MoneyTransferDto moneyTransfer(MoneyTransferDto moneyTransferDto);
}
