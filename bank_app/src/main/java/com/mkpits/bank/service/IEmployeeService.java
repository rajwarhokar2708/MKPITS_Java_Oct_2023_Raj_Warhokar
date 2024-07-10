package com.mkpits.bank.service;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.responce.EmployeeResponseDto;

import java.util.List;

public interface IEmployeeService {
    public List<EmployeeResponseDto> getAllEmployees();

    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

}
