package com.bank.service;

import com.bank.entity.Account;
import com.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repo;

    public Account createAccount(Account account) {
        return repo.save(account);
    }

    public Account deposit(String accNo, double amount) {
        Account acc = repo.findByAccountNumber(accNo).orElseThrow();
        acc.setBalance(acc.getBalance() + amount);
        return repo.save(acc);
    }

    public Account withdraw(String accNo, double amount) {
        Account acc = repo.findByAccountNumber(accNo).orElseThrow();

        if (acc.getBalance() < amount) {
            throw new RuntimeException("Insufficient Balance");
        }

        acc.setBalance(acc.getBalance() - amount);
        return repo.save(acc);
    }

    public double getBalance(String accNo) {
        return repo.findByAccountNumber(accNo).orElseThrow().getBalance();
    }
}