package com.example.bank.repository;

import com.example.bank.mysql.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository  extends CrudRepository<Account,Integer> {

}
