package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for verifying the promotion conditions.
 *
 * @author Guilherme Silva
 */
public class PromotionChecker {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        int clientAge = 33;
        int orderId = 4;
        boolean isEligibleForFreeShipping = clientAge >= 60;
        boolean isEligibleForDiscount = orderId % 2 == 0;

        System.out.printf("Pedido %d - Cliente tem %d anos. Frete Grátis: %b | Cupom Desconto: %b%n", orderId, clientAge, isEligibleForFreeShipping, isEligibleForDiscount);
    }
}
