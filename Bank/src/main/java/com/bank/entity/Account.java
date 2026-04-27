package com.bank.entity;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String accountNumber;

    private double balance;

    public Account() {}

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void setName(String name) { this.name = name; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
}