package com.Technosignia.BankManagmentSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankManagmentSystem.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
