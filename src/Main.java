public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("______Задача 1______");
        int clientOS;
        clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("На ваше ПО нет приложения и не будет!");
        }
    }

    public static void task2() {
        System.out.println("______Задача 2______");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректные данные");
        }
    }

    public static void task3() {
        System.out.println("______Задача 3______");
        int year = 2022;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("______Задача 4______");
        int dayForDelivery = 1;
        int deliveryDistance = 20;
        boolean disTo20 = (deliveryDistance < 20);
        boolean dis20to60 = (deliveryDistance >= 20 && deliveryDistance < 60);
        boolean dis60to100 = (deliveryDistance >= 60 && deliveryDistance <= 100);
        //boolean moreThen100 = (deliveryDistance > 100);
        if (deliveryDistance <= 100) {
            System.out.println("Спасибо за заказ карты. Мы Вам её доставим на дом");
            if (disTo20) System.out.println("Потребуется дней: " + dayForDelivery);
            else if (dis20to60) System.out.println("Потребуется дней: " + (dayForDelivery + 1));
            else if (dis60to100) System.out.println("Потребуется дней: " + (dayForDelivery + 2));
        } else System.out.println("Доставки нет!");
    }

    public static void task5() {
        System.out.println("______Задача 5______");
        int monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит осени");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }

}