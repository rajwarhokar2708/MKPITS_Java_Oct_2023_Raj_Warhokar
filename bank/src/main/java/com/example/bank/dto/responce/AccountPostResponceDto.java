package com.example.bank.dto.responce;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountPostResponceDto {
    private Integer id;
    private Integer userId;
    private String accType;
    private Float rateOfInterest;
    private Double balance;
}
