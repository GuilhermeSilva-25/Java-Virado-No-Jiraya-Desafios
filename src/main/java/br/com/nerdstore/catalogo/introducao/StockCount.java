package br.com.nerdstore.catalogo.introducao;

/**
 * Class responsible for counting the products in stock.
 *
 * @author Guilherme Silva
 */
public class StockCount {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Prateleira número: %d%n", i);
        }

        int counter = 5;

        while (counter >= 0) {
            System.out.printf("Iniciando conferência em %d%n", counter);
            counter--;
        }

        System.out.println("Conferência iniciada!");
    }
}
