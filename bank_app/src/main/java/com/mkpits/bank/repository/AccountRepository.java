package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    List<Account> findAccountsByUserId(Integer userId);
}
