package br.com.nerdstore.pagamentos.introducao;

import java.util.Locale;

/**
 * Class responsible for updating employee salaries.
 *
 * @author Guilherme Silva
 */
public class SalaryAdjustment {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        double currentSalary = 2_500.0;
        int adjustmentsCount = 0;
        currentSalary += 500.0;
        adjustmentsCount++;
        currentSalary *= 1.1;
        adjustmentsCount++;

        System.out.printf("Salário após %d ajustes: R$ %.2f%n", adjustmentsCount, currentSalary);
    }
}
