package com.example.bank.controller;

import com.example.bank.dto.request.AccountRequestDto;
import com.example.bank.dto.request.MoneyTransferDto;
import com.example.bank.dto.request.UserRequestDto;
import com.example.bank.dto.responce.*;
import com.example.bank.mysql.model.User;
import com.example.bank.service.IAccountService;
import com.example.bank.service.IUserService;
import com.example.bank.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    //Autowired Annotation provide dependency for our code wants
    //At the place of autowired annotation we use also a constructor injection or setter injection or we use bean also
    @Autowired
    IUserService userService;

    @Autowired
    IAccountService iAccountService;
    //--Get , Post ,Patch ,Put is  called method and verbs
    //--and path is called noun or resource

    //Responce Entity represent whole http responce
    @GetMapping(path = "/api/v1/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Integer id) {
        System.out.println("ho raha hai ");
        UserGetResponceDto getResponceDto = userService.getUser(id);
        return ResponseEntity.ok(getResponceDto);
    }

    @GetMapping(path = "/api/v1/users")
    public ResponseEntity<Object> getAllUsers() {
        List<UserGetResponceDto> getResponceDtos = userService.getAllUers();
        return ResponseEntity.ok(getResponceDtos);
    }

    @PostMapping(path = "/api/v1/users")
    public ResponseEntity<Object> createUser(@RequestBody UserRequestDto userRequestDto) {
        UserPostResoponceDto userPostResoponceDto = userService.createUser(userRequestDto);
        return ResponseEntity.created(URI.create("/api/v1/users" + userPostResoponceDto.getId())).body(userPostResoponceDto);
    }

    @PutMapping(path = "/api/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
//        System.out.println(userRequestDto.getId());
        UserPutResponceDto putResponceDto = userService.updateUser(userRequestDto);
        return ResponseEntity.ok(putResponceDto);
    }

    @PatchMapping(path = "/api/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id, @RequestBody UserRequestDto userRequestDto) {
        userRequestDto.setId(id);
        UserPutResponceDto putResponceDto = userService.updatePartialUser(userRequestDto);
        return ResponseEntity.ok(putResponceDto);
    }

    @DeleteMapping(path = "/api/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id) {
        UserGetResponceDto responceDto = userService.deleteUser(id);
        if (responceDto != null) {
            return new ResponseEntity<>("User with Id " + id + " delete sucessfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with id " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }


    // Below methods for Accounts
    @GetMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> getAccount(@PathVariable("userId") Integer id) {
        AccountGetResponceDto responceDto = iAccountService.getAccount(id);
        return ResponseEntity.ok(responceDto);
    }

    @GetMapping(path = "/api/v1/accounts/users")
    public ResponseEntity<Object> getAllAccounts() {
        List<AccountGetResponceDto> getResponceDtos = iAccountService.getAllAccounts();
        return ResponseEntity.ok(getResponceDtos);
    }

    @PutMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> updateAccount(@PathVariable("userId") Integer id, @RequestBody AccountRequestDto accountRequestDto) {
        accountRequestDto.setId(id);
        AccountPutResponceDto putResponceDto = iAccountService.updateAccount(accountRequestDto);
        return ResponseEntity.ok(putResponceDto);
    }

    @PatchMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> updatePartialAccount(@PathVariable("userId") Integer id, @RequestBody AccountRequestDto accountRequestDto) {
        accountRequestDto.setId(id);
        AccountPutResponceDto putResponceDto = iAccountService.updatePartialAccount(accountRequestDto);
        return ResponseEntity.ok(putResponceDto);
    }
    @PostMapping(path = "/api/v1/accounts/users/{userId}")
    public ResponseEntity<Object> moneyTransfer(@PathVariable("userId") Integer id, @RequestBody MoneyTransferDto moneyTransferDto) {
        moneyTransferDto.setUserId(id);
        MoneyTransferDto moneyTransferDtoReturn = iAccountService.moneyTransfer(moneyTransferDto);
        return ResponseEntity.ok(moneyTransferDtoReturn);
    }

}
