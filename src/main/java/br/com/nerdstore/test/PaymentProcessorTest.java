package br.com.nerdstore.test;

import br.com.nerdstore.domain.PaymentProcessor;

import java.util.Locale;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("Cyberpunk", 200.0, false);
        paymentProcessor.processPayment("The Witcher", 150.0, true);
    }
}
