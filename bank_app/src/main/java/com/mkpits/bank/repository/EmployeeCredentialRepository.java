package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.EmployeeCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCredentialRepository extends JpaRepository<EmployeeCredential,Integer> {
}