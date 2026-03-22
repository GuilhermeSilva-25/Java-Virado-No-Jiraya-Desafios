package br.com.nerdstore.usuarios.introducao;

import java.util.Locale;

/**
 * Class responsible for registering user data
 *
 * @author Guilherme Silva
 */
public class UserProfile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        String fullName = "Guilherme Silva";
        String address = "Rua X, 33";
        int age = 33;
        char gender = 'M';
        double desiredSalary = 2_999.00;

        System.out.printf("Nome completo: %s%nEndereço: %s%nIdade: %d%nGênero: %c%nSalário pretendido: R$ %.2f%n", fullName, address, age, gender, desiredSalary);
    }
}
