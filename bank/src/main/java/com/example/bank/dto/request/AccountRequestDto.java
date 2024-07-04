package com.example.bank.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class AccountRequestDto {

    private Integer id;
    private Integer userId;
//    private Integer username;
    private String accType;
    private Float rateOfInterest;
    private Double balance;
}
