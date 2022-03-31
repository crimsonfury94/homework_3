package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int clientOsAndroid = 1;
        int clientOsIos = 0;
        if (clientOsAndroid == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
        if (clientOsIos == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2011;
        if (clientDeviceYear >= 2015 && clientOsAndroid == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOsAndroid == 1) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOsIos == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOsIos == 0) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }
        // Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " является високосным годом");
        } else if (year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
        // Задание 4
        int deliveryDistance = 95;
        int deliveryDaysShort = 1;
        int deliveryDaysMiddle = 2;
        int deliveryDaysLong = 3;
        if (deliveryDistance <= 20 && deliveryDaysShort == 1) {
            System.out.println("Для доставки в " + deliveryDistance  + " км" + " потребуется " + deliveryDaysShort + " день");
        } else if ((deliveryDistance >= 20 && deliveryDistance <= 60) && deliveryDaysMiddle == 2) {
            System.out.println("Для доставки в " + deliveryDistance + " км" + " потребуется " + deliveryDaysMiddle + " дня");
        } else if ((deliveryDistance >= 60 && deliveryDistance <= 100) && deliveryDaysLong == 3) {
            System.out.println("Для доставки в " + deliveryDistance + " км" + " потребуется " + deliveryDaysLong + " дня");
        } else {
            System.out.println("Доставка невозможна");
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("Нет такого месяца");


        }
    }
}

