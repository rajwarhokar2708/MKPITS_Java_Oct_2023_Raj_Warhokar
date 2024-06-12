package com.example.demo.controller;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.ErrorResponseDto;
import com.example.demo.dto.response.UserResponseDto;
import com.example.demo.service.IUserService;
import com.example.demo.validator.UserValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//We use RestController Anotation for show it is Controller Class
@RestController
public class UserManagementController {

    @Autowired
    IUserService userService;

    @Autowired
    UserValidator userValidator;

    //Get , Post ,Patch ,Put is also called method and verbs
    // and path is called noun or resource

    //Get is use for to get data from Database
    @GetMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Integer id){
        UserRequestDto  userRequestDto=userService.getUserById(id);
    return ResponseEntity.ok(userRequestDto);
    }

    @GetMapping(path = "/v1/users")
    public ResponseEntity<Object> getAllUser(){
        List<UserRequestDto> userRequestDtoList= userService.getAllUsers();
        return ResponseEntity.ok(userRequestDtoList);
    }

    //Post is for to save new data in database
    @PostMapping(path = "/v1/users")
//    public ResponseEntity<Object> createUser(@PathVariable("id") Integer id,@RequestBody UserRequestDto userRequestDto ){
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        boolean isValidAge = userValidator.validateAge(userRequestDto.getDateOfBirth());
        if(!isValidAge) {
            ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                    .errorMessage("Age should be greated than 18 yrs")
                    .httStatusCode(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(errorResponseDto);
        }
//        userRequestDto.setId(id);
        UserResponseDto userResponseDto = userService.createUser(userRequestDto);
        return ResponseEntity.ok(userResponseDto);
    }

    //Put is for to update or rename data in database
    @PutMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable("id") Integer id,@RequestBody UserRequestDto userRequestDto){
        userRequestDto.setId(id);
        UserRequestDto userRequestDtoReturn = userService.updateUser(userRequestDto);
        return  ResponseEntity.ok(userRequestDtoReturn);
    }

    //Patch is for to update or rename 1 single data in database
    @PatchMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> updatePartialUser(@PathVariable("id") Integer id,@RequestBody UserRequestDto userRequestDto){
    userRequestDto.setId(id);
    UserRequestDto userRequestDtoReturn = userService.updatePartialUser(userRequestDto);
    return ResponseEntity.ok(userRequestDtoReturn);
    }

    @DeleteMapping(path = "/v1/users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") Integer id){
        UserRequestDto userRequestDto=userService.deleteUser(id);
        if(userRequestDto != null){
            return new ResponseEntity<>("User with Id "+id+" delete sucessfully",HttpStatus.OK);
        }else {
            return new ResponseEntity<>("User with id "+id+" not found",HttpStatus.NOT_FOUND);
        }
    }
}
