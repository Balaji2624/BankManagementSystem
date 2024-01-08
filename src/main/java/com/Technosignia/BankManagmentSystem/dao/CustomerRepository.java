package com.Technosignia.BankManagmentSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankManagmentSystem.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
