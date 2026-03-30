package br.com.nerdstore.test;

import br.com.nerdstore.domain.DeliveryCar;

public class DeliveryCarTest {
    public static void main(String[] args) {
        DeliveryCar car1 = new DeliveryCar();

        System.out.println(car1.model);
        System.out.println(car1.year);

        DeliveryCar car2 = new DeliveryCar();

        car2.model = "Kombi";
        car2.year = 2010;

        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
