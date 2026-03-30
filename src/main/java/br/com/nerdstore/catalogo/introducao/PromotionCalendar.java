package br.com.nerdstore.catalogo.introducao;

/**
 *Class responsible for keeping track of the days when there will be a promotion.
 *
 * @author Guilherme Silva
 */
public class PromotionCalendar {
    public static void main(String[] args) {
        int[][] days = new int[3][2];

        days[0][0] = 10;
        days[0][1] = 20;
        days[1][0] = 5;
        days[1][1] = 20;
        days[2][0] = 2;
        days[2][1] = 25;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.printf("Mês %d, Promoção no dia %d%n", i +1, days[i][j]);
            }
        }
    }
}
