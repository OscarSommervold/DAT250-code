package no.hvl.dat250.jpa.banking.entities;

import javax.persistence.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "CreditCard")
    private CreditCard creditcard;

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }

    public CreditCard getCreditcard() {
        return creditcard;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditCard=" + creditcard +
                '}';
    }
}