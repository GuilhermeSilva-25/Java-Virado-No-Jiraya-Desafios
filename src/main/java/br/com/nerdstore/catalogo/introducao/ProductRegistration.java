package br.com.nerdstore.catalogo.introducao;

import java.util.Locale;

/**
 * Class responsible for recording product information.
 *
 * @author Guilherme Silva
 */
public class ProductRegistration {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        long productBarcode = 987654321098L;
        double productValue = 2_500.99;
        int quantityInStock = 500;
        boolean isAvailableForSale = true;
        char productCategory = 'A';

        System.out.printf("Produto de código %d%nCategoria: %c%nQuantidade em estoque: %d%nValor: R$ %.2f%nDisponível: %b%n", productBarcode, productCategory, quantityInStock, productValue, isAvailableForSale);
    }
}
