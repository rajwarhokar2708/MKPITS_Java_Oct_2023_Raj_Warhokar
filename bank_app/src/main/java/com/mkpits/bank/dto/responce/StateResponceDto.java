package com.mkpits.bank.dto.responce;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateResponceDto {
    private Integer id;
    private String stateName;
    private String stateCode;
}
