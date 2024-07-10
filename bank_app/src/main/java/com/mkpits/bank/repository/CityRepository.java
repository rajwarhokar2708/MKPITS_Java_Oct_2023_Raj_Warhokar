package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    City findByName(String name);
}
