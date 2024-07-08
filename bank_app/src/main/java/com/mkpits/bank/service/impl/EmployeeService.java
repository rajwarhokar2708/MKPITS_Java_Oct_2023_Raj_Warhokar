package com.mkpits.bank.service.impl;

import com.mkpits.bank.dto.request.EmployeeRequestDto;
import com.mkpits.bank.dto.responce.EmployeeResponceDto;
import com.mkpits.bank.model.sql.Employee;
import com.mkpits.bank.model.sql.EmployeeCredential;
import com.mkpits.bank.repository.EmployeeCredentialRepository;
import com.mkpits.bank.repository.EmployeeRepository;
import com.mkpits.bank.service.IEmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    EmployeeCredentialRepository employeeCredentialRepository;


    @Override
    public List<EmployeeResponceDto> getAllEmployees() {

        List<Employee> employeeList = (List<Employee>) employeeRepo.findAll();
        List<EmployeeResponceDto> employeeResponceDtoArrayList = new ArrayList<>();
        for (Employee employee : employeeList){
            EmployeeResponceDto getEmployeeResponceDto =  convertEmployeeModelToEmployeeDto(employee);
            employeeResponceDtoArrayList.add(getEmployeeResponceDto);
        }
        return employeeResponceDtoArrayList;
    }

    @Transactional
    @Override
    public EmployeeResponceDto createEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = convertEmployeeRequestDtoToEmployee(employeeRequestDto);
        employee.setCreatedBy(1);
        employee.setCreatedAt(LocalDateTime.now());
        employee = employeeRepo.save(employee);

        EmployeeCredential employeeCredential = new EmployeeCredential();
//        System.out.println(employee.getId());
        employeeCredential.setEmpId(employee.getId());
        employeeCredential.setUsername(employeeRequestDto.getUsername());
        employeeCredential.setPassword(employeeRequestDto.getPassword());
        employeeCredential.setCreatedAt(LocalDateTime.now());
        employeeCredential.setCreatedBy(employee.getId());
        employeeCredentialRepository.save(employeeCredential);
        return convertEmployeeToEmployeeResponceDto(employee);
    }

    private EmployeeResponceDto convertEmployeeToEmployeeResponceDto(Employee employee) {
        return EmployeeResponceDto.builder()
                .fullName(employee.getFullName())
                .id(employee.getId())
                .email(employee.getEmail())
                .mobile(employee.getMobile())
                .aadharNo(employee.getAadharNo())
                .gender(employee.getGender())
                .build();
    }


    private Employee convertEmployeeRequestDtoToEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = Employee.builder()
                .fullName(employeeRequestDto.getFullName())
                .email(employeeRequestDto.getEmail())
                .dateofbirth(employeeRequestDto.getDateOfBirth())
                .address(employeeRequestDto.getAddress()+employeeRequestDto.getPinCode())
                .city(employeeRequestDto.getCity())
                .state(employeeRequestDto.getState())
                .gender(employeeRequestDto.getGender())
                .mobile(employeeRequestDto.getMobile())
                .aadharNo(employeeRequestDto.getAadharNo())
                .build();
        return employee;
    }


    private EmployeeResponceDto convertEmployeeModelToEmployeeDto(Employee employee) {
        EmployeeResponceDto getEmployeeResponceDto = EmployeeResponceDto.builder()
                .id(employee.getId())
                .fullName(employee.getFullName())
                .email(employee.getEmail())
                .gender(employee.getGender())
                .mobile(employee.getMobile())
                .aadharNo(employee.getAadharNo())
//                .dateofbirth(employee.getDateofbirth())
//                .state(employee.getState())
//                .city(employee.getCity())
//                .address(employee.getAddress())
                .build();

        return getEmployeeResponceDto;
}

}
