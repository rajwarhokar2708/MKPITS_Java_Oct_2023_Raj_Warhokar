package com.mkpits.bank.dto.responce;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {
    private Integer id;
    private String adhaarCard;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String cin;
    private String address;
    private String pinCode;
    private String userName;
    private String accType;
}
