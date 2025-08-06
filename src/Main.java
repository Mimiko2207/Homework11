//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // ЗАДАЧА 1
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2024));
        System.out.println(calculateDeviceVersion(2020, 1));
        int days = calculateDelivery(95);
        System.out.println("Потребуется дней: " + days);


    }

    public static String checkLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год високосный ";
        } else {
            return i + " год не високосный ";
        }
    }
    // ЗАДАЧА 2


    public static String calculateDeviceVersion(int deviceType, int manufactureYear) {
        if (manufactureYear == 1) {
            if (deviceType <= 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (deviceType <= 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
    }

    // Задача 3
        public static int calculateDelivery(int deliveryDistance) {
            int term = 1;
            if (deliveryDistance <= 20) {
                return term;
            } else if (deliveryDistance > 20 && deliveryDistance < 60) {
                term = term + 1;
                return term;
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                term = term + 1 + 1;
                return term;
            } else {
                return -1;
            }
        }
    }







