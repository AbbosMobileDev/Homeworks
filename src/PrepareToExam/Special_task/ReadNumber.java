package PrepareToExam.Special_task;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long getNumber = scanner.nextLong();

        long milliard = getNumber / 1_000_000_000;
        if (milliard > 0){
            int yuzlik = (int) (milliard / 100);
            switch (yuzlik){
                case 1:
                    System.out.println("Bir");
                    break;
                case  2 :
                    System.out.println("Ikki");
                    break;
                case 3:
                    System.out.println("Uch");
                    break;
                case 4:
                    System.out.println("Uch");
                    break;
                case 5:
                    System.out.println("Uch");
                    break;
                case 6:
                    System.out.println("Uch");
                    break;
                case 7:
                    System.out.println("Uch");
                    break;
                case 8:
                    System.out.println("Uch");
                    break;
                case 9:
                    System.out.println("Uch");
                    break;


            }
        }
            System.out.println(milliard);


    }
}


