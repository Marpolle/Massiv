package ru.netology.stats;


public class StatsService {
    //Сумма всех продаж

    public int SumOfAllSales(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    // средняя сумма продаж в месяц
    public int AverageSalesMonth(int[] sales) {
        int summa = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa = summa / sales.length;
    }

    //номер месяца, в котором был пик продаж
    public int MaxSales(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int SalesBelowAverage(int[] sales) {
        int SumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageSalesMonth(sales)) {
                SumMonth = SumMonth + 1;
            }
        }
        return SumMonth;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int SalesHigherAverage(int[] sales) {
        int SumMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageSalesMonth(sales)) {
                SumMonths = SumMonths + 1;
            }
        }
        return SumMonths;
    }
}
