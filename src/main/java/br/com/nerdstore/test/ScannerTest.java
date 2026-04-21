package br.com.nerdstore.test;

import br.com.nerdstore.domain.Customer;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            var customer = new Customer();

            System.out.println("--- Cadastro NerdStore ---");
            System.out.println("Digite o nome completo do cliente: ");
            customer.setName(input.nextLine());
            System.out.println("Digite a idade do cliente: ");
            customer.setAge(input.nextInt());
            System.out.println("Digite o sexo (M/F): ");
            customer.setGender(input.next().charAt(0));

            customer.printInfo();
        }
    }
}
