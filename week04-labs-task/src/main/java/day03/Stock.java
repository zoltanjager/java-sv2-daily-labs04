package day03;

import java.util.*;

public class Stock {
    private List<Double> prices = new ArrayList<>();

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit2() {
        Double[] sortedPrices = new Double[prices.size()];
        prices.toArray(sortedPrices);

        Arrays.sort(sortedPrices);

        double maxPrice = sortedPrices[sortedPrices.length-1];
        if (maxPrice == prices.get(0)){
            maxPrice = sortedPrices[sortedPrices.length-2];
        }
        double minPrice = sortedPrices[0];
        return maxPrice-minPrice;
    }


    public double maxProfit() {
        double maxPrice = prices.get(0);
        double minPrice = prices.get(0);

        for (Double price: prices
             ) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        if (maxPrice == prices.get(0)) {
            maxPrice = prices.get(1);
            for (int i = 1; i < prices.size(); i++) {
                if (prices.get(i) > maxPrice) {
                    maxPrice = prices.get(i);
                }
            }
        }

        for (Double price: prices
             ) {
            if (price < minPrice) {
                minPrice = price;
            }
        }

        return maxPrice-minPrice;
    }
}
