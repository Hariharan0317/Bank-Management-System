package com.bank.controller;

import com.bank.entity.Account;
import com.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) {
        return service.createAccount(account);
    }

    @GetMapping("/deposit")
    public Account deposit(@RequestParam String accNo,
                           @RequestParam double amount) {
        return service.deposit(accNo, amount);
    }

    @GetMapping("/withdraw")
    public Account withdraw(@RequestParam String accNo,
                            @RequestParam double amount) {
        return service.withdraw(accNo, amount);
    }

    @GetMapping("/balance")
    public double getBalance(@RequestParam String accNo) {
        return service.getBalance(accNo);
    }
}