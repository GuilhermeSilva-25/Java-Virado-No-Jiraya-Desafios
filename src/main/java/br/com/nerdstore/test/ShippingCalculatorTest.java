package br.com.nerdstore.test;

import br.com.nerdstore.domain.ShippingCalculator;

import java.util.Locale;

public class ShippingCalculatorTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        ShippingCalculator shippingCalculator = new ShippingCalculator();

        double standardShippingCost = shippingCalculator.calculateShipping(50.0, false);
        double vipShippingCost = shippingCalculator.calculateShipping(200.0, true);

        System.out.printf("Frete Normal: R$ %.2f%n", standardShippingCost);
        System.out.printf("Frete VIP: R$ %.2f%n", vipShippingCost);
    }
}
