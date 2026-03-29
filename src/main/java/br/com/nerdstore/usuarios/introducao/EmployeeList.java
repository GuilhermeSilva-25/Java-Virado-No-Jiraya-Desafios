package br.com.nerdstore.usuarios.introducao;

/**
 * Class responsible for keeping track of employee names
 *
 * @author Guilherme Silva
 */
public class EmployeeList {
    public static void main(String[] args) {
        String[] employees = new String[4];

        employees[0] = "João";
        employees[1] = "Maria";
        employees[2] = "José";

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Funcionário %d: %s%n", i, employees[i]);
        }
    }
}
