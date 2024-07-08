package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.responce.EmployeeResponceDto;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeResponceDto> getAllEmployees();

    public EmployeeResponceDto createEmployee(EmployeeRequestDto employeeRequestDto);

}
