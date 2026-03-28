package br.com.nerdstore.pagamentos.introducao;

/**
 * class responsible for processing installments
 *
 * @author Guilherme Silva
 */
public class PaymentProcessorTwo {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i++) {
            System.out.printf("Processando parcela: %d%n", i);
            if (i == 13) {
                System.out.println("ERRO CRÍTICO na parcela 13. Interrompendo processamento...");
                break;
            }
        }
    }
}
