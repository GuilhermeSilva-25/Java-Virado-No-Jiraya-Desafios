package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for verifying if the total purchase amount qualifies for "Express Shipping".
 *
 * @author Guilherme Silva
 */
public class ShippingStatus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double purchaseAmount = 333.0;
        String shippingType = purchaseAmount >= 300 ? "EXPRESSO" : "NORMAL";

        System.out.printf("Valor da compra: %.2f | Tipo de Frete: %s%n", purchaseAmount, shippingType);
    }
}
