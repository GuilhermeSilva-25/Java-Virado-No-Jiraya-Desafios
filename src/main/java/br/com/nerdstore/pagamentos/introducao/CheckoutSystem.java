package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for recording purchase values.
 *
 * @author Guilherme Silva
 */
public class CheckoutSystem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double item1Price = 15.0;
        double item2Price = 20.0;
        double shippingCost = 10.0;
        double totalPrice = item1Price + item2Price + shippingCost;
        double dividedPrice = totalPrice / 2;
        System.out.printf("Total com 10 reais de desconto: R$ %.2f%n", (totalPrice - 10));
        System.out.printf("Total dividido para 2 pessoas: R$ %.2f%n", dividedPrice);
    }
}
