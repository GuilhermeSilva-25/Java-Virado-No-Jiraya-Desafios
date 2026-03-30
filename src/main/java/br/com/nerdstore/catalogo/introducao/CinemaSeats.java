package br.com.nerdstore.catalogo.introducao;

/**
 * Class responsible for storing the number of chairs per row.
 *
 * @author Guilherme Silva
 */
public class CinemaSeats {
    public static void main(String[] args) {
        int[][] seats = {
                {1, 1},
                {1, 0, 0, 1},
                {0, 0, 0}
        };

        for (int[] row : seats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
