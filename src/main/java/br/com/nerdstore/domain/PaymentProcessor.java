package br.com.nerdstore.domain;

public class PaymentProcessor {
    public void processPayment(String gameName, double price, boolean isCreditCardApproved) {
        if (!isCreditCardApproved) {
            System.out.printf("Pagamento recusado para o jogo: %s%n", gameName);
            return;
        }
        System.out.printf("Pagamento aprovado. Gerando nota fiscal no valor de R$ %.2f%n", price);
    }
}
