package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //Creating the Object for Constructor Injection
    UserService userServiceConstructor=new UserService();

    //Creating the Object for Setter Injection
    UserService userServiceSetter = new UserService();

    //Parameterised Constructor
    public UserController(UserService userServiceConstructor){
        this.userServiceConstructor = userServiceConstructor;
    }

    //Parameterised Setter
    public void setUserServiceSetter(UserService userServiceSetter) {

        this.userServiceSetter = userServiceSetter;
    }


    @RequestMapping("/v1/user/construtor")
    public ResponseEntity<Object> getUserFromConstructor(){
        UserDto userDto = userServiceConstructor.getAllUser();
        System.out.println("Service Construtor : "+userServiceConstructor.hashCode());

        return ResponseEntity.ok(userDto);
    }

    @RequestMapping("/v1/user/setter")
    public ResponseEntity<Object> getUserFromSetter(){

        UserDto userDto2= userServiceSetter.getAllUser();
        System.out.println("Service Setter :"+userServiceSetter.hashCode());

        return ResponseEntity.ok(userDto2);
    }




}
