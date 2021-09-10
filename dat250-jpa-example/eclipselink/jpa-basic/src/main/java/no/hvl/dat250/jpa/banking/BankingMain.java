package no.hvl.dat250.jpa.banking;

import no.hvl.dat250.jpa.banking.entities.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class BankingMain {
    private static EntityManagerFactory factory;
    private static final String PERSISTENCE_NAME = "banking";

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Address a = new Address();
        a.setStreet("Møllendalsveien");
        a.setNumber(68);
        em.persist(a);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Person p = new Person();
        p.setName("Oscar");
        em.persist(p);
        em.getTransaction().commit();

        em.getTransaction().begin();
        CreditCard c = new CreditCard();
        c.setBalance(100);
        c.setLimit(1000);
        c.setNumber(2);
        em.persist(c);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Bank b = new Bank();
        b.setName("sbm");
        em.persist(b);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Pincode pin = new Pincode();
        pin.setCount(2);
        pin.setPincode("1234");
        em.persist(pin);
        em.getTransaction().commit();

        em.close();
    }
}
