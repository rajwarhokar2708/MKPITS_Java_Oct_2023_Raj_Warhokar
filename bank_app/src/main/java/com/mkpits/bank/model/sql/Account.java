package com.mkpits.bank.model.sql;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "account_type")
    private String accType;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "account_number")
    private String accNo;
    @Column(name = "rate_of_interest")
    private Double rateOfInterest;
    @Column(name = "branch_id")
    private Integer branchId;
    @Column(name = "opening_date")
    private LocalDate openingDate;
    //    @Column(name = "closing_date")
//    private LocalDate closeingDate;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "updated_by")
    private Integer updatedBy;
}
