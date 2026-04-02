package br.com.nerdstore.test;

import br.com.nerdstore.domain.StockCalculator;

public class StockCalculatorTest {
    public static void main(String[] args) {
        StockCalculator calculator = new StockCalculator();

        calculator.displayStockMessage();
        calculator.sumItems();
    }
}
