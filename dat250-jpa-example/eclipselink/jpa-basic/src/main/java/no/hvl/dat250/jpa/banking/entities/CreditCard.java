package no.hvl.dat250.jpa.banking.entities;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue
    private Long id;
    private int number;
    private int limit;
    private int balance;


    @OneToOne
    @JoinColumn(name = "bank")
    private Bank bank;

    @OneToOne
    @JoinColumn(name = "pin")
    private Pincode pincode;

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public int getLimit() {
        return limit;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", number=" + number +
                ", limit=" + limit +
                ", balance=" + balance +
                ", bank=" + bank +
                '}';
    }
}