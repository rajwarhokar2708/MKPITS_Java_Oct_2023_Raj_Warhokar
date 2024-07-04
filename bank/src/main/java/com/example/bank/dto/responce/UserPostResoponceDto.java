package com.example.bank.dto.responce;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPostResoponceDto {
    private int id;
//    private String username;
    private String fullName;
    private String accType;
    private Double balance;
}
