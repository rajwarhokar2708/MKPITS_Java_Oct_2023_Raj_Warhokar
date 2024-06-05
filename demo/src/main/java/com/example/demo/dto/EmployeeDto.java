package com.example.demo.dto;

public class EmployeeDto {
    private String name;
    private String department;
    private String designation;
    private AddressDto[] addressDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public AddressDto[] getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto[] addressDto) {
        this.addressDto = addressDto;
    }
}
