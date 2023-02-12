import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;



public class StatsServiceTest {
    @Test
    public void shouldMinSale(){
    StatsService service = new StatsService();
    long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedSale = 7;
    int actualSale = service.minSales(sale);
        Assertions.assertEquals(expectedSale, actualSale);
        System.out.println(StatsService.minSales(sale));
    }
    @Test
    public void sumSale(){
        StatsService service = new StatsService();
        long [] sale = new long[]{-8, -10_000, -13, 30, -17, -16, 0, 20_000, 7, 7, -10_000, 90};
        System.out.println(service.sum(sale));
    }
    @Test
    public void shouldMaxSale(){
        StatsService service = new StatsService();
        long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 20;
        int actualSale = service.maxSales(sale);
        Assertions.assertEquals(expectedSale, actualSale);
        System.out.println(StatsService.maxSales(sale));
    }

    @Test
    public void shouldAverageSale(){
        long [] sale = new long[]{8, -15, 13, 15, 300, 11820, 19, 20, 7, 14, 14, 18};
        System.out.println(StatsService.averageSale(sale));
    }

    @Test
    public void shouldMinSalesMonth (){
        long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(StatsService.minSalesMonth(sale));
    }

    @Test
    public void shouldMaxSalesMonth (){
        long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(StatsService.maxSalesMonth(sale));
    }

    @Test
    public void saleBelowAverage() {
        long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(StatsService.saleBelowAverage(sale));
    }

    @Test
    public void saleAboveAverage() {
        long [] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(StatsService.saleAboveAverage(sale));
    }

}


