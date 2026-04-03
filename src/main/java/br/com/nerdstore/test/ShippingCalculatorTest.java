package br.com.nerdstore.test;

import br.com.nerdstore.domain.ShippingCalculator;

import java.util.Locale;

public class ShippingCalculatorTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        ShippingCalculator shippingCalculator = new ShippingCalculator();

        shippingCalculator.calculateShipping(50.0, false);
        shippingCalculator.calculateShipping(200.0, true);
    }
}
