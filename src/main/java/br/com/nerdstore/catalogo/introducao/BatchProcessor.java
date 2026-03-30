package br.com.nerdstore.catalogo.introducao;

/**
 * Class responsible for storing product batches and IDs.
 *
 * @author Guilherme Silva
 */
public class BatchProcessor {
    public static void main(String[] args) {
        int[][] batches = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] batch : batches) {
            for (int productId : batch) {
                System.out.printf("Processando Lote - ID do Produto: %d%n", productId);
            }
        }
    }
}
