package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.Account;
import com.mkpits.bank.model.sql.Address;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Integer> {
    public Address findAccountsByUserId(Integer userId);
}
