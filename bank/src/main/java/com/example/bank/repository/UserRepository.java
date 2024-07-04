package com.example.bank.repository;

import com.example.bank.mysql.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer> {

}
