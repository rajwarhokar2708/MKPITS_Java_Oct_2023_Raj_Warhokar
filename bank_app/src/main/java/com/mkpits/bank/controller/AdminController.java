package com.mkpits.bank.controller;

import com.mkpits.bank.dto.AccountResponseDto;
import com.mkpits.bank.dto.UserResponseDto;
import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.service.IAccountService;
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

    @GetMapping("/admin/dashboard/employeemanagement")
    public String adminEmployeeManagement() {
        return "/admin/employeeManagement";
    }

    @GetMapping("/admin/dashboard/customerdetails/{userId}")
    public String adminCustomerAccounts(@PathVariable("userId") Integer userId, Model model) {
        UserResponseDto userResponseDto = iUserService.getUserByIdUser(userId);
        List<AccountResponseDto> accountResponceDto = iAccountService.getAllUserAccounts(userId);
        model.addAttribute("customerDetalis", userResponseDto);
        model.addAttribute("customerDetailsFromAccount", accountResponceDto);
        return "admin/customer-accounts";
    }

    @GetMapping("/admin/dashboard/employeemanagement/registrationform")
    public String userRegistrationForm() {
        return "customers/registration";
    }


    @PostMapping("/admin/dashboard/employeemanagement/register")
    public String registerUser(@ModelAttribute UserRequestDto userRequestDto, Model model) {

        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);

        model.addAttribute("user", userResponseDto);
        return "admin/userManagement"; // The view name of the success page
    }
}


