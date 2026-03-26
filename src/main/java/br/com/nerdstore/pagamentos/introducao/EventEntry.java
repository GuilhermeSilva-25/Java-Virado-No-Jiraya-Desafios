package br.com.nerdstore.pagamentos.introducao;

/**
 * The class responsible for validating whether a person can enter an exclusive event.
 *
 * @author Guilherme Silva
 */
public class EventEntry {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = false;

        if (age >= 18) {
            System.out.println("Ingresso validado. Divirta-se!");
        }

        if (!hasTicket) {
            System.out.println("Por favor, compre seu ingresso na bilheteria.");
        }
    }
}
