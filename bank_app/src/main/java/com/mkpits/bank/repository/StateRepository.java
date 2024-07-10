package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StateRepository extends JpaRepository<State,Integer> {
    @Query("SELECT s FROM State e WHERE s.name = :name")
    public State findStateByName(String name);
}
