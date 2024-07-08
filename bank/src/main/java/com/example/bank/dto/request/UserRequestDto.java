package com.example.bank.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

    private Integer id;
//    private String username;
    @NotBlank(message = "Name is mandatory")
    private String fullName;

    @NotBlank(message = "gender is mandatory")
    private Character gender;
    private LocalDate dob;
    private Integer userId;
    private String accType;
    private Float rateOfInterest;
    private Double balance;

    private Integer createdBy;
    private LocalDateTime createdAt;
    private Integer updatedBy;
    private LocalDateTime updatedAt;

}
