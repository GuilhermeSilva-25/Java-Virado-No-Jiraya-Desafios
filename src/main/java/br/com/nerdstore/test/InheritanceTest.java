package br.com.nerdstore.test;

import br.com.nerdstore.domain.users.Customer;
import br.com.nerdstore.domain.users.Manager;

public class InheritanceTest {
    public static void main(String[] args) {
        var customer = new Customer();

        customer.setName("Fulano");
        customer.setEmail("fulano@email.com");
        customer.setPaymentMethod("PIX");

        var manager = new Manager();

        manager.setName("Ciclano");
        manager.setEmail("ciclano@email.com");
        manager.setSalary(6_000.0);

        customer.printInfo();
        manager.printInfo();
    }
}
