package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * class responsible for defining the discount value based on the purchase amount.
 *
 * @author Guilherme Silva
 */
public class DiscountCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double purchaseValue = 3_333.3;
        double discountPercentage = 0;

        if (purchaseValue >= 3_000) {
            discountPercentage = 15;
        } else if (purchaseValue >= 2_000) {
            discountPercentage = 10;
        } else if (purchaseValue >= 1_000) {
            discountPercentage = 5;
        }

        double discount = (discountPercentage / 100) * purchaseValue;
        double finalValue = purchaseValue - discount;

        System.out.printf("Valor original: R$ %.2f | Desconto aplicado: %.0f%% (R$ %.2f) | Valor final: R$ %.2f", purchaseValue, discountPercentage, discount, finalValue);
    }
}
