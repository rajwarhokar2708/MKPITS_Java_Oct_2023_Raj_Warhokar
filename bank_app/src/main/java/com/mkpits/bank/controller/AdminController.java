package com.mkpits.bank.controller;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.responce.AccountResponseDto;
import com.mkpits.bank.dto.responce.EmployeeResponseDto;
import com.mkpits.bank.dto.responce.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.service.IAccountService;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    IUserService iUserService;

    @Autowired
    IEmployeeService iEmployeeService;

    @Autowired
    IAccountService iAccountService;

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "/admin/index";
    }


    @GetMapping("/admin/dashboard/usermanagement")
    public String adminUserManagement(Model model) {
        List<UserResponseDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "admin/userManagement";
    }

    @GetMapping("/admin/dashboard/usermanagement/userdetails/{userId}")
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId, Model model) {
        UserResponseDto userResponseDto = iUserService.getUserByIdUser(userId);
        List<AccountResponseDto> accountResponceDto = iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetalis", userResponseDto);
        model.addAttribute("customerDetailsFromAccount", accountResponceDto);
        return "admin/customer-accounts";
    }

    @GetMapping("/admin/dashboard/usermanagement/registrationform")
    public String userRegistrationForm() {
        return "admin/registration";
    }

    @PostMapping("/admin/dashboard/usermanagement/register")
    public String addregisterUser(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
        List<UserResponseDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "admin/userManagement";
    }

    @GetMapping("/admin/dashboard/employeemanagement")
    public String adminEmployeeManagement(Model model){
        List<EmployeeResponseDto> employeeGetResponseDtoList =  iEmployeeService.getAllEmployees();
        model.addAttribute("employeeManagement",employeeGetResponseDtoList);
        return "admin/employeeManagement"/*ResponseEntity.ok(employeeGetResponseDtoList)*/;
    }

    @GetMapping("/admin/dashboard/employeemanagement/registrationform")
    public String adminEmployeeRegistration() {
        return "admin/employeeregistration";
    }

    @PostMapping("/admin/dashboard/employeemanagement/register")
    public String addregisterEmployee(@ModelAttribute EmployeeRequestDto employeeRequestDto, Model model) {
        EmployeeResponseDto employeeResponseDto = iEmployeeService.createEmployee(employeeRequestDto);
        List<EmployeeResponseDto> employeeGetResponseDtoList =  iEmployeeService.getAllEmployees();
        model.addAttribute("employeeManagement",employeeGetResponseDtoList);
        return "admin/employeeManagement"/*ResponseEntity.ok(employeeGetResponseDtoList)*/;
    }




}


