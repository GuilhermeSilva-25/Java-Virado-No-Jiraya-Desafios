package br.com.nerdstore.domain;

public class DiscountCalculator {
    public void applyDiscount(double originalPrice, double percentage) {
        originalPrice = originalPrice - (originalPrice * (percentage / 100));
        System.out.printf("Preço com desconto dentro do método: R$ %.2f%n", originalPrice);
    }
}
