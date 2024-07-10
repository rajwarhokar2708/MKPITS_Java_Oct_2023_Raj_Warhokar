package com.mkpits.bank.dto.responce;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchResponseDto {
    private Integer id;
    private String branchName;
    private Integer branchCode;
    private String ifscCode;
    private Integer cityId;
}
