package ru.netology.stats;
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Сумма всех продаж!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class StatsService {
    public static int sum(long[] sales) {
        // Объявляем переменную для хранения суммы элементов
        int sum = 0;
        // Проходим по элементам массива и каждый к сумме
        for (long number : sales) {
            sum += number;
        }
        return sum;
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Минимальная продажа в денежном выражении!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static int minSales(long[] sales) {

        long minSale = sales[0];
        for (long s : sales) {
            if (s < minSale) {
                minSale = s;
            }
        }
        return (int) minSale;
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Максимальная продажа в денежном выражении!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static int maxSales(long[] sales) {

        long maxSale = sales[0];
        for (long s : sales) {
            if (s > maxSale) {
                maxSale = s;
            }
        }
        return (int) maxSale;
    }

    // !!!!!!!!!!!!!!!!Средняя сумму продаж в месяц!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public static int averageSale(long[] sales) {

        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return (int) average;
    }

    //!!!!!!!!Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму!!!!!!!!!!!!!!!!
    public static int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //!!!!!!!!!!Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму!!!!!!!!!!!!!
    //!!!!!!!!!!!!!!!Чтобы находил первый месяц достаточно убрать равно в if (sale > sales[maxMounts]) {!!!!!!!!!!!!!!
    public static int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

// !!!!!!!!!!!!!!!!!Количество месяцев, в которых продажи были ниже среднего!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static int saleBelowAverage(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < StatsService.averageSale(sales))
                count++;
        }
        return count;
    }

// !!!!!!!!!!!!!!!!!!Количество месяцев, в которых продажи были выше среднего!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static int saleAboveAverage(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > StatsService.averageSale(sales))
                count++;
        }
        return count;
    }

}










