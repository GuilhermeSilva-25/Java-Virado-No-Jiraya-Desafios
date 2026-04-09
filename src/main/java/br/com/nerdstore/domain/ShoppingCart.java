package br.com.nerdstore.domain;

public class ShoppingCart {
    public void calculateTotal(String customerName, double... prices) {
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        System.out.printf("Cliente: %s | Total da Compra: R$ %.2f%n", customerName, total);
    }
}
