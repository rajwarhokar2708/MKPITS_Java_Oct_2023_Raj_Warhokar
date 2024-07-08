package com.mkpits.bank.repository;

import com.mkpits.bank.model.sql.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
