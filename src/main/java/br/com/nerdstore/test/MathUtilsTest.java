package br.com.nerdstore.test;

import br.com.nerdstore.domain.MathUtils;

import java.util.Locale;

public class MathUtilsTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double finalPrice = MathUtils.calculateDiscount(150.0, 15);
        System.out.printf("Preço final: R$ %.2f%n", finalPrice);
    }
}
