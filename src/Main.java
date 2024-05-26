//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        double total = 0;
        double deposite = 15000;
        double percentPerMonth = 1.01;
        int i = 1;
        while (total < 2_459_000) {
            total = (total + deposite) * percentPerMonth;
            System.out.printf("«Месяц %s, сумма накоплений равна %.2f рублей.»%n", i, total);
            i++;
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        for (counter = 10; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.printf("Год %s, численность населения составляет %s.%n", year, population);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4 and task 5");
        double vasiliyPercent = 1.07;
        double vasiliyDeposite = 15000;
        int vasiliyMonth = 1;
        while (vasiliyDeposite < 12_000_000) {
            vasiliyDeposite *= vasiliyPercent;
            if (vasiliyMonth % 6 == 0) {
                System.out.printf("Месяц %s, накопления составляют %.2f рублей.%n", vasiliyMonth, vasiliyDeposite);
            }
            vasiliyMonth++;
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 6");
        vasiliyDeposite = 15000;
        int targetMonthAmount = 9 * 12;
        for (int j = 1; j <= targetMonthAmount; j++) {
            vasiliyDeposite *= vasiliyPercent;
            if (j % 6 == 0) {
                System.out.printf("Месяц %s, накопления составляют %.2f рублей.%n", j, vasiliyDeposite);
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 7");
        int firstFriday = 2;
        for (int j = firstFriday; j < 31; j += 7) {
            System.out.printf("«Сегодня пятница, %s-е число. Необходимо подготовить отчет.»%n", j);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 8");
        int period = 79;
        int currentYear = 2024;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        for (int j = yearBefore; j < yearAfter; j++) {
            if (j % period == 0) {
                System.out.println(j);
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
