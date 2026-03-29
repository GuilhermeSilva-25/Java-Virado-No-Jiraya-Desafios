package br.com.nerdstore.catalogo.introducao;

import java.util.Locale;

/**
 * Class responsible for keeping track of prices of products on sale.
 *
 * @author Guilherme Silva
 */
public class PromotionPrices {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double[] prices = {33.33, 44.44, 55.55, 77.77, 88.88};

        for (double price: prices) {
            System.out.printf("Preço promocional: R$ %.2f%n", price);
        }
    }
}
