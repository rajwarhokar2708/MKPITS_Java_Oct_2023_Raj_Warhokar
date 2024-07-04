package com.mkpits.bank.controller;

import com.mkpits.bank.dto.UserDto;
import com.mkpits.bank.model.sql.User;
import com.mkpits.bank.service.impl.IUserService;
import com.mkpits.bank.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "/admin/index";
    }

    @GetMapping("/admin/dashboard/usermanagement")
    public String adminUserManagement(Model model) {
        List<UserDto> users = iUserService.getAllUsers();
        model.addAttribute("userManagement", users);
        return "admin/userManagement";
    }

    @GetMapping("/admin/dashboard/employeemanagement")
    public String adminEmployeeManagement() {
        return "/admin/employeeManagement";
    }
}
