package com.mkpits.bank.dto.responce;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponceDto {
    private Integer id;
    private Integer userId;
    private String address;
    private String pinCode;
    private Integer cityId;
    private Integer districtId;
    private Integer stateId;
    private LocalDateTime createdAt;
    private Integer createdBy;
    private LocalDateTime updatedAt;
    private Integer updatedBy;
}
