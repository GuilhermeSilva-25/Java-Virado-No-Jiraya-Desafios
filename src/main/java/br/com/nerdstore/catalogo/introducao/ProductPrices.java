package br.com.nerdstore.catalogo.introducao;

import java.util.Locale;

/**
 * Class responsible for keeping track of product prices
 *
 * @author Guilherme Silva
 */
public class ProductPrices {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double[] prices = new double[3];

        prices[0] = 49.90;
        prices[1] = 39.90;
        prices[2] = 33.33;

        System.out.printf("Preço no índice 0: R$ %.2f%n", prices[0]);
        System.out.printf("Preço no índice 1: R$ %.2f%n", prices[1]);
        System.out.printf("Preço no índice 2: R$ %.2f%n", prices[2]);
    }
}
