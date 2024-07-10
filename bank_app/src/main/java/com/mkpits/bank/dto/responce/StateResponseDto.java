package com.mkpits.bank.dto.responce;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateResponseDto {
    private Integer id;
    private String stateName;
}
