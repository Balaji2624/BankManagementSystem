package com.Technosignia.BankManagmentSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankManagmentSystem.entity.Employee;
@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {

}
