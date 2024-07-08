package com.mkpits.bank.dto.responce;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCredentialResponceDto {
    private Integer id;
    private Integer userId;
    private String userName;
    private String password;
    private String passwordSalt;
    private String userRole;
    private String loginDateTime;
    private LocalDateTime createdAt;
    private Integer createdBy;
    private LocalDateTime updatedAt;
    private Integer updatedBy;
}
