package PrepareToExam.Special_task;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String getNumber = scanner.next();
        int getSize = getNumber.length();
        System.out.println(getSize);
        int dotIndex = getNumber.indexOf('.');
        System.out.println(dotIndex);
        if (!getNumber.contains(".")) {

            for (int i = 0; i < getNumber.length(); i++) {

                char charakter = getNumber.charAt(i);
                switch (charakter) {
                    case '1':
                        System.out.print("bir ");
                        break;
                    case '2':
                        System.out.print("ikki ");
                        break;
                    case '3':
                        System.out.print("uch ");
                        break;
                    case '4':
                        System.out.print("to'rt ");
                        break;
                    case '5':
                        System.out.print("besh ");
                        break;
                    case '6':
                        System.out.print("olti ");
                        break;
                    case '7':
                        System.out.print("yetti ");
                        break;
                    case '8':
                        System.out.print("sakkiz ");
                        break;
                    case '9':
                        System.out.print("to'qqiz ");
                        break;
                    case '0':
                        System.out.print(" ");
                        break;

                }


            }


        }

    }
}
