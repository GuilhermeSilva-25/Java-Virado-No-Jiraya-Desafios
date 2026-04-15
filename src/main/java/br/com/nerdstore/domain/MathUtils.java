package br.com.nerdstore.domain;

public class MathUtils {
    private MathUtils() {}

    public static double calculateDiscount(double price, double percentage) {
        double discount =  price * (percentage / 100);
        return price - discount;
    }
}
