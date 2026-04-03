package br.com.nerdstore.domain;

public class ShippingCalculator {
    public void calculateShipping(double distance, boolean isVip) {
        if (isVip) {
            System.out.println("Frete VIP: R$ 0,00");
        } else {
            double shippingCostCalculated = 2 * distance;
            System.out.printf("Frete: R$ %.2f%n", shippingCostCalculated);
        }
    }
}
