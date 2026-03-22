package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for processing employee payments.
 *
 * @author Guilherme Silva
 */
public class PaymentProcessor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double exactBonusValue = 1_850.85;
        int acceptedBankValue = (int) exactBonusValue;
        float taxRate = 0.15f;

        System.out.printf("Valor exato R$: %.2f%nValor que o banco aceitou R$: %d%n", exactBonusValue,  acceptedBankValue);
    }
}
