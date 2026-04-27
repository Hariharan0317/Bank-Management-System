# Bank Management System

## Description
A REST API built using Spring Boot to manage bank accounts.

## Features
- Create Account
- Deposit Money
- Withdraw Money
- Check Balance

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Postman

## API Endpoints

### Create Account (POST)
http://localhost:8080/bank/create

### Deposit (GET)
http://localhost:8080/bank/deposit?accNo=1001&amount=500

### Withdraw (GET)
http://localhost:8080/bank/withdraw?accNo=1001&amount=200

### Check Balance (GET)
http://localhost:8080/bank/balance?accNo=1001
