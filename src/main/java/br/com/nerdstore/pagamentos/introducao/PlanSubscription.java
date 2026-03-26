package br.com.nerdstore.pagamentos.introducao;

public class PlanSubscription {
    public static void main(String[] args) {
        int planCode = 3;

        switch (planCode) {
            case 1:
                System.out.println("Plano \"BASIC\" - Acesso a 10 cursos.");
                break;
            case 2:
                System.out.println("Plano \"SILVER\" - Acesso a 50 cursos.");
                break;
            case 3:
                System.out.println("Plano \"GOLD\" - Acesso ilimitado.");
                break;
            default:
                System.out.println("Plano Inválido");
        }
    }
}
