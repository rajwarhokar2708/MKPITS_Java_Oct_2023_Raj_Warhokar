package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District,Integer> {
    District findByName(String name);
}
