package Lesson15.enum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biror sonni kiriting (1-12) :");
        int a = scanner.nextInt();

        if (a >= 1 && a <= 12) {
            Month month = Month.values()[a - 1];

            if (a <= 2 || a == 12) {
                System.out.println(month + " oy " + Season.QISH + " Fasli");
            } else if (a >= 3 && a <= 5) {
                System.out.println(month + " oyi " + Season.BAHOR + " Fasli");
            } else if (a >= 6 && a <= 8) {
                System.out.println(month + " Oyi " + Season.YOZ + " Fasli");
            } else if (a >= 9 && a <= 11) {
                System.out.println(month + " Oyi " + Season.KUZ + " Fasli");
            }
        }


    }
}

