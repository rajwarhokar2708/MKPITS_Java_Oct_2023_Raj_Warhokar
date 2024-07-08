package com.mkpits.bank.controller;

import com.mkpits.bank.dto.request.UserRequestDto;
import com.mkpits.bank.dto.responce.UserResponseDto;
import com.mkpits.bank.service.IEmployeeService;
import com.mkpits.bank.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    IUserService iUserService;

    IEmployeeService iEmployeeService;

    @GetMapping("/employee/dashboard")
    public String employeeDashboard() {
        return "/employee/index";
    }

    //showing user details form employee dashboard
    @GetMapping("/employee/dashboard/usermanagement")
    public String employeeUserManagement(Model model) {
        List<UserResponseDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "/employee/userManagement";
    }

    @GetMapping("/employee/dashboard/employeemanagement/registrationform")
    public String userRegistrationForm() {
        return "employee/employeetouserregistration";
    }

    @PostMapping("/employee/dashboard/employeemanagement/register")
    public String registerUser(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        UserResponseDto userResponseDto = iUserService.createUser(userRequestDto);
        List<UserResponseDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "/employee/userManagement";
    }



    @GetMapping("/employee/dashboard/employeemanagement")
    public String adminEmployeeManagement() {
//        List<EmployeeDto> employeeGetResponseDtoList =  iEmployeeService.getAllEmployees();
//        model.addAttribute("employeeManagement",employeeGetResponseDtoList);
        return "/admin/employeeManagement";
    }
}
