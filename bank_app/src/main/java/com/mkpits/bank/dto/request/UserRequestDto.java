package com.mkpits.bank.dto.request;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {
//    private Integer id;
//    private String firstName;
//    private String middleName;
//    private String lastName;
//    private String mobile;
//    private String email;
//    private Character gender;
//    private LocalDate dateOfBirth;
//    private String cin;
//    private String aadharNo;

    private String firstName;
    private String middleName;
    private String lastName;
    private String mobile;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String adhaarCard;
}
