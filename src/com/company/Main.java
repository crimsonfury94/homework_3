package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int clientOsAndroid = 1;
        int clientOsIos = 0;
        if (clientOsAndroid == 1) {
            System.out.println("Install app on Android by link");
        }
        if (clientOsIos == 0) {
            System.out.println("Install app on iOS by link");
        }
        // Task 2
        int clientDeviceYear = 2011;
        if (clientDeviceYear >= 2015 && clientOsAndroid == 1) {
            System.out.println("Install app on Android by link");
        } else if (clientDeviceYear < 2015 && clientOsAndroid == 1) {
            System.out.println("Install lite version for Android by link");
        }
        if (clientDeviceYear >= 2015 && clientOsIos == 0) {
            System.out.println("Install app on iOS by link");
        } else if (clientDeviceYear < 2015 && clientOsIos == 0) {
            System.out.println("Install lite version for iOS by link");
        }
        // Task 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
        // Task 4
        int deliveryDistance = 95;
        int deliveryDaysShort = 1;
        int deliveryDaysMiddle = 2;
        int deliveryDaysLong = 3;
        if (deliveryDistance <= 20 && deliveryDaysShort == 1) {
            System.out.println("For delivery in " + deliveryDistance  + " km" + " it'll take " + deliveryDaysShort + " day");
        } else if ((deliveryDistance >= 20 && deliveryDistance <= 60) && deliveryDaysMiddle == 2) {
            System.out.println("For delivery in " + deliveryDistance + " km" + " it'll take " + deliveryDaysMiddle + " days");
        } else if ((deliveryDistance >= 60 && deliveryDistance <= 100) && deliveryDaysLong == 3) {
            System.out.println("For delivery in " + deliveryDistance + " km" + " it'll take " + deliveryDaysLong + " days");
        } else {
            System.out.println("Delivery is not possible");
        }
        // Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn season");
                break;
            case 12:
                System.out.println("Winter season");
                break;
            default:
                System.out.println("Month does not exist");


        }
    }
}

