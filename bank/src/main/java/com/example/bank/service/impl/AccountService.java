package com.example.bank.service.impl;

import com.example.bank.dto.request.AccountRequestDto;
import com.example.bank.dto.request.MoneyTransferDto;
import com.example.bank.dto.responce.AccountGetResponceDto;
import com.example.bank.dto.responce.AccountPostResponceDto;
import com.example.bank.dto.responce.AccountPutResponceDto;
import com.example.bank.dto.responce.UserGetResponceDto;
import com.example.bank.mysql.model.Account;
import com.example.bank.mysql.model.User;
import com.example.bank.repository.AccountRepository;
import com.example.bank.service.IAccountService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AccountService implements IAccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountGetResponceDto getAccount(Integer id) {
        Optional<Account> optionalAccount =accountRepository.findById(id);
        AccountGetResponceDto responceDto = new AccountGetResponceDto();
        if (optionalAccount.isPresent()){
            responceDto = convertAccountModelToAccountDto(optionalAccount.get());
        }
        return responceDto;
    }

    @Override
    public List<AccountGetResponceDto> getAllAccounts() {
        List<Account>  accountList = (List<Account>) accountRepository.findAll();
         List<AccountGetResponceDto> getResponceDtoList =new ArrayList<>();
         for (Account account: accountList){
             AccountGetResponceDto getResponceDto = convertAccountModelToAccountDto(account);
             getResponceDtoList.add(getResponceDto);
         }
        return getResponceDtoList;
    }

    @Override
    public MoneyTransferDto moneyTransfer(MoneyTransferDto moneyTransferDto) {
            Optional<Account> userOptional = accountRepository.findById(moneyTransferDto.getUserId());
            if (userOptional.isEmpty()){
                System.out.println("Id not Found");
            }else {
               Integer toUserId=userOptional.get().getUserId();
               Double amount = userOptional.get().getBalance();
                System.out.println("User Id : "+toUserId+" Balance"+amount);
                
            }
        return null;
    }

    @Override
    public AccountPutResponceDto updateAccount(AccountRequestDto accountRequestDto) {
        Optional<Account> optionalAccount = accountRepository.findById(accountRequestDto.getId());
        if (optionalAccount.isEmpty()){
            System.out.println("User data with id: " + accountRequestDto.getId() + " not found");
        }else {
            Account account = convertAccountDtoToAccountModel(accountRequestDto,optionalAccount.get());
            account.setId(accountRequestDto.getId());
            account = accountRepository.save(account);
            return convertAccountModelToAccountPutResponceDto(account);
        }
        AccountPutResponceDto putResponceDto = new AccountPutResponceDto();
        return putResponceDto;
    }

    @Override
    public AccountPutResponceDto updatePartialAccount(AccountRequestDto accountRequestDto) {
        Optional<Account> optionalAccount = accountRepository.findById(accountRequestDto.getId());
        if (optionalAccount.isEmpty()){
            System.out.println("User data with id: " + accountRequestDto.getId() + " not found");
        }else {
            Account account = optionalAccount.get();
            account.setAccType(accountRequestDto.getAccType() != null && !accountRequestDto.getAccType()
                    .equals(account.getAccType()) ? accountRequestDto.getAccType() : account.getAccType());

            account.setRateOfInterest(accountRequestDto.getRateOfInterest() != null && !accountRequestDto.getRateOfInterest()
                    .equals(account.getRateOfInterest()) ? accountRequestDto.getRateOfInterest() : account.getRateOfInterest());

            account.setBalance(accountRequestDto.getBalance() != null && !accountRequestDto.getBalance()
                    .equals(account.getBalance()) ? accountRequestDto.getBalance() : account.getBalance());
            accountRepository.save(account);

            return convertAccountModelToAccountPutResponceDto(account);
        }
        AccountPutResponceDto putResponceDto = new AccountPutResponceDto();
        return putResponceDto;
    }




    private AccountPutResponceDto convertAccountModelToAccountPutResponceDto(Account account) {
        AccountPutResponceDto putResponceDto = AccountPutResponceDto.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .accType(account.getAccType())
                .rateOfInterest(account.getRateOfInterest())
                .balance(account.getBalance())
                .build();
        return putResponceDto;
    }


    private Account convertAccountDtoToAccountModel(AccountRequestDto accountRequestDto, Account account) {
        account = Account.builder()
                .accType(accountRequestDto.getAccType())
                .rateOfInterest(accountRequestDto.getRateOfInterest())
                .balance(accountRequestDto.getBalance())
                .updatedBy(accountRequestDto.getId())
                .updatedAt(LocalDateTime.now())
                .build();
        return account;
    }


    private AccountGetResponceDto convertAccountModelToAccountDto(Account account){
        AccountGetResponceDto getResponceDto = AccountGetResponceDto.builder()
                .userId(account.getUserId())
                .accType(account.getAccType())
                .rateOfInterest(account.getRateOfInterest())
                .balance(account.getBalance())
                .build();
        return getResponceDto;
    }
}
