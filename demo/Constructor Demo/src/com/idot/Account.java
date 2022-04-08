package com.idot;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        this("56789", 0.0, "default", "null", "000000");
        System.out.println("empty constructor called.");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        System.out.println("constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("9999", 100.50, customerName, customerEmail, customerPhoneNumber);

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit of "+depositAmount + " processed. New balance is "+this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(withdrawalAmount > this.balance){
            System.out.println("Only "+ this.balance + " available. Withdrawal not processed.");
        }
        else{
            this.balance-=withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount + " processed. Remaining Balance is "+ this.balance);
        }

    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
