package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.Employee;
import com.mkpits.bank.model.sql.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialRepository extends JpaRepository<UserCredential,Integer> {
}
