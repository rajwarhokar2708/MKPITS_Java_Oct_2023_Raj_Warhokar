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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mobile_number")
    private String mobile;
    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private Character gender;
//    @Column(name = "date_of_birth")
//    private LocalDate dateOfBirth;
    @Column(name = "cin")
    private String cin;

    @Column(name = "adhaar_card")
    private String aadharCard;
}
