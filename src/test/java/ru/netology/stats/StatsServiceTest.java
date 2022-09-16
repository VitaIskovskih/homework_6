package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatsServiceTest {
    @Test//1 пункт
    public void mustFindAmountOfSales() {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 0, 7, 14, 14, 18};
        int expected = 160;
        int actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test//2 пункт
    public void mustFindAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();

        int [] sales = {0, 15, 13, 15, 17, 20, 19, 20, - 7, 14, 10, 11};
        int expected = 12;
        int actual = service.getAverageAmountOfSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test//3 пункт
    public void mustFindMinMonthSale() {
        StatsService service = new StatsService();

        int [] sales = {20, 9, 15, 5, 7, 14, 19, 10, 8, 17, 12, 9};
        int expected = 1;
        int actual = service.getPeakSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test//4 пункт
    public void mustFindMaxMonthSale() {
        StatsService service = new StatsService();

        int [] sales = {10, 15, 12, 10, 7, 14, 10, 6, 13, 14, 11, 5};
        int expected = 12;
        int actual = service.getMinMonthOfSale(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test//5 пункт
    public void mustFindSelloutLessThanAverage() {
        StatsService service = new StatsService();

        int [] sales = {10, 12, 13, 21, 17, 20, 19, 20, 6, 14, 10, 11};
        int expected = 6;
        int actual = service.getBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test//6 пункт
    public void mustFindSalesAboveAverage() {
        StatsService service = new StatsService();

        int [] sales = {10, 12, 13, 21, 17, 20, 19, 20, 6, 14, 10, 0};
        int expected = 5;
        int actual = service.getAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
