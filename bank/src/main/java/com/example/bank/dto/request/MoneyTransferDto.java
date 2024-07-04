package com.example.bank.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoneyTransferDto {

    private int userId;
    private double balance;
}
