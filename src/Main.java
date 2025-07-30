//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ЗАДАЧА 1
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2024));
    }

    public static String checkLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год високосный ";
        } else {
            return i + " год не високосный ";

        }
    }

    // ЗАДАЧА 2
    public static void main1(String[] args) {
        System.out.println(calculateDeviceVersion(2010));
    }

    public static String calculateDeviceVersion(int i, int i1) {
        if (i1 == 1) {
            if (i <= 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (i <= 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }

        }
    }
}







