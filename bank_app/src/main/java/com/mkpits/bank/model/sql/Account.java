package com.mkpits.bank.model.sql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
}
