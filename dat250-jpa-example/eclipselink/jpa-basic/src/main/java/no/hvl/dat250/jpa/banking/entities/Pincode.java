package no.hvl.dat250.jpa.banking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pincode {
    @Id
    @GeneratedValue
    private Long id;
    private String pincode;
    private int count;

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Pincode{" +
                "id=" + id +
                ", pincode='" + pincode + '\'' +
                ", count=" + count +
                '}';
    }
}