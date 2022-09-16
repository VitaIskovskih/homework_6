package ru.netology.stats;
public class StatsService {
    public int getSalesAmount(int[] sales) {
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        return sumMonth;
    }

    public int getAverageAmountOfSalesPerMonth(int[] sales) {
        int averageMonth = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            averageMonth = sum / sales.length;
        }
        return averageMonth;
    }

    public int getPeakSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinMonthOfSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getBelowAverage(int[] sales) {
        int averageMonth = getAverageAmountOfSalesPerMonth(sales);
        int numberOfMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonth) {
                numberOfMonth = numberOfMonth + 1;
            }
        }

        return numberOfMonth;
    }

    public int getAboveAverage(int[] sales) {
        int averageMonth = getAverageAmountOfSalesPerMonth(sales);
        int quantityMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonth) {
                quantityMonth = quantityMonth + 1;
            }
        }

        return quantityMonth;
    }
}
