package br.com.nerdstore.test;

import br.com.nerdstore.domain.DiscountCalculator;

import java.util.Locale;

public class DiscountCalculatorTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double gamePrice = 200.00;
        DiscountCalculator discountCalculator = new DiscountCalculator();

        discountCalculator.applyDiscount(gamePrice, 10.0);

        System.out.printf("Preço original no main: R$ %.2f%n", gamePrice);
    }
}
