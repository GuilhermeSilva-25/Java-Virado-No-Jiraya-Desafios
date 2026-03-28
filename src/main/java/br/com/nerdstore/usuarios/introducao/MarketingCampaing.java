package br.com.nerdstore.usuarios.introducao;

public class MarketingCampaing {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) {
                continue;
            }

            System.out.printf("E-mail enviado com sucesso para ID: %d%n", i);
        }
    }
}
