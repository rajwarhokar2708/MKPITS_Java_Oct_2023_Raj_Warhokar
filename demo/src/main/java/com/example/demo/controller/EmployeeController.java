package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping("/employees")
    public ResponseEntity<Object> getEmployee(){

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName("Raj warhokar");
        employeeDto.setDepartment("CS");
        employeeDto.setDesignation("Java Developer");

        AddressDto[] addressDto = new AddressDto[2];
        addressDto[0] = new AddressDto();
        addressDto[0].setAddressType('x');
        addressDto[0].setStreet("Godhani");
        addressDto[0].setCity("Nagpur");
        addressDto[0].setState("Maharashtra");
        addressDto[0].setCountry("India");

        addressDto[1] = new AddressDto();
        addressDto[1].setAddressType('y');
        addressDto[1].setStreet("dagdu shet mandir");
        addressDto[1].setCity("Pune");
        addressDto[1].setState("Maharashtra");
        addressDto[1].setCountry("India");

        addressDto[2] =new AddressDto();
        addressDto[2].setAddressType('z');
        addressDto[2].setStreet("Taj Hotel");
        addressDto[2].setCity("Mumbai");
        addressDto[2].setState("Maharashtra");
        addressDto[2].setCountry("India");  

        employeeDto.setAddressDto(addressDto);
        return ResponseEntity.ok(employeeDto);
}
}
