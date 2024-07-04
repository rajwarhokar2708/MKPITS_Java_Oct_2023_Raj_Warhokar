package com.mkpits.bank.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {
    private Integer id;
//    private String firstName;
//    private String middleName;
//    private String lastName;
//    private String mobile;
//    private String email;
//    private Character gender;
//    private LocalDate dateOfBirth;
//    private String cin;
    private String adhaarCard;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String cin;
}
