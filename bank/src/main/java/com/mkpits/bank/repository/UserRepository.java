package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {

}
