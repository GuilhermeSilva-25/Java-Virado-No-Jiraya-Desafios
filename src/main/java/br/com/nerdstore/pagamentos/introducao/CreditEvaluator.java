package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for deciding whether a customer can purchase a product in installments.
 *
 * @author Guilherme Silva
 */
public class CreditEvaluator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        int age = 31;
        double salary = 3_500.00;
        int monthsOfAccount = 4;
        boolean isCreditApproved = (age > 18) && (salary >= 2_000) && (monthsOfAccount >= 6);

        System.out.printf("Idade: %d | Salário: R$ %.2f | Meses: %d. Crédito Aprovado: %b%n", age, salary, monthsOfAccount, isCreditApproved);
    }

}
