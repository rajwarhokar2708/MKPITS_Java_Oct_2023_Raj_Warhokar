package com.mkpits.bank.dto.responce;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeResponceDto {
    private Integer id;
    private String fullName;
    private String mobile;
    private String email;
    private String gender;
    private LocalDate dateofbirth;
    private String aadharNo;
    private String address;
    private String state;
    private String city;

}
