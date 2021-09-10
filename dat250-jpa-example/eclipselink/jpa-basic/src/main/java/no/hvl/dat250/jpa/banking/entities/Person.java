package no.hvl.dat250.jpa.banking.entities;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

    @OneToOne
    @JoinColumn(name = "CreditCard")
    private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Long getId() {return id;}

    public String getName() { return name;}

    public void setName(String name) {this.name = name;}

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", creditCard=" + creditCard +
                '}';
    }
}
