package br.com.nerdstore.pagamentos.introducao;

/**
 * Class responsible for printing the customer receipt.
 *
 * @author Guilherme Silva
 */
public class CustomerReceipt {
    public static void main(String[] args) {
        int customerAge = 33;
        // TODO: Future refactoring - Use BigDecimal instead of double for financial values.
        double creditApproved = 2_500.00;
        System.out.println("O cliente tem " + customerAge + " anos e um limite de crédito de R$ " + creditApproved + " aprovado.");
    }
}
