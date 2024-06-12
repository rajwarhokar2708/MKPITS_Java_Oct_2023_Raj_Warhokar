//package com.example.demo.controller;
//
//import com.example.demo.dto.UserDto;
//import com.example.demo.service.impl.UserService1;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController2 {
//    @Autowired
//    UserService1 userService1;
//    @RequestMapping("/v1/users1")
//    public ResponseEntity<Object> getUser(){
//        UserDto userDto = userService1.getAllUser();
//        return  ResponseEntity.ok(userDto);
//    }
//}
