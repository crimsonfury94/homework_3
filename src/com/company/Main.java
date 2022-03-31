package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        // ������� 1
        int clientOsAndroid = 1;
        int clientOsIos = 0;
        if (clientOsAndroid == 1) {
            System.out.println("���������� ������ ��� Android �� ������");
        }
        if (clientOsIos == 0) {
            System.out.println("���������� ������ ��� iOS �� ������");
        }
        // ������� 2
        int clientDeviceYear = 2011;
        if (clientDeviceYear >= 2015 && clientOsAndroid == 1) {
            System.out.println("���������� ������ ��� Android �� ������");
        } else if (clientDeviceYear < 2015 && clientOsAndroid == 1) {
            System.out.println("���������� ����������� ������ ��� Android �� ������");
        }
        if (clientDeviceYear >= 2015 && clientOsIos == 0) {
            System.out.println("���������� ������ ��� iOS �� ������");
        } else if (clientDeviceYear < 2015 && clientOsIos == 0) {
            System.out.println("���������� ����������� ������ ��� iOS �� ������");
        }
        // ������� 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " �������� ���������� �����");
        } else if (year % 400 == 0) {
            System.out.println(year + " �������� ���������� �����");
        } else {
            System.out.println(year + " �� �������� ���������� �����");
        }
        // ������� 4
        int deliveryDistance = 95;
        int deliveryDaysShort = 1;
        int deliveryDaysMiddle = 2;
        int deliveryDaysLong = 3;
        if (deliveryDistance <= 20 && deliveryDaysShort == 1) {
            System.out.println("��� �������� � " + deliveryDistance  + " ��" + " ����������� " + deliveryDaysShort + " ����");
        } else if ((deliveryDistance >= 20 && deliveryDistance <= 60) && deliveryDaysMiddle == 2) {
            System.out.println("��� �������� � " + deliveryDistance + " ��" + " ����������� " + deliveryDaysMiddle + " ���");
        } else if ((deliveryDistance >= 60 && deliveryDistance <= 100) && deliveryDaysLong == 3) {
            System.out.println("��� �������� � " + deliveryDistance + " ��" + " ����������� " + deliveryDaysLong + " ���");
        } else {
            System.out.println("�������� ����������");
        }
        // ������� 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("������ �����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�������� �����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("������ �����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("������� �����");
                break;
            case 12:
                System.out.println("������ �����");
                break;
            default:
                System.out.println("��� ������ ������");


        }
    }
}

