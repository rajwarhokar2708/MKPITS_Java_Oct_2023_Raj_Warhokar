package com.example.bank.dto.responce;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPutResponceDto {
    private int id;
//    private String username;
    private String fullName;
    private Character gender;
    private LocalDate dob;
}
