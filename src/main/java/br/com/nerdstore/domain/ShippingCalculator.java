package br.com.nerdstore.domain;

public class ShippingCalculator {
    public double calculateShipping(double distance, boolean isVip) {
        if (isVip) {
            return 0.0;
        } else {
            double shippingCostCalculated = 2 * distance;
            return shippingCostCalculated;
        }
    }
}
