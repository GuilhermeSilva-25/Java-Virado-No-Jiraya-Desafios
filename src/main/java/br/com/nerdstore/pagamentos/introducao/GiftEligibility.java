package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for verifying if the customer is entitled to the gift.
 *
 * @author Guilherme Silva
 */
public class GiftEligibility {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        boolean isPremiumCustomer = true;
        double totalPurchaseValue = 100.0;
        boolean isEligibleForGift = isPremiumCustomer || (totalPurchaseValue >= 500.0);

        System.out.printf("Cliente Premium: %b | Valor Compra: %.2f. Ganhou Brinde: %b%n", isPremiumCustomer, totalPurchaseValue, isEligibleForGift);
    }
}
