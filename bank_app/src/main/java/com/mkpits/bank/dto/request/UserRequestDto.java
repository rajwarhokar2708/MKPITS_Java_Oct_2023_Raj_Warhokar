package com.mkpits.bank.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String adhaarCard;
    private String address;
    private String state;
    private String district;
    private String city;
    private String pinCode;
    private String userName;
    private String accType;
    private String password;
    private String passwordSalt;
}
