package ReviewExercise;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        System.out.print("yilni kiriting :");
        Scanner scanner= new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0  && year % 100 !=0){
            System.out.println("366");
        }else if (year % 400 == 0){
            System.out.println("366");
        }else {
            System.out.println("365");
        }
    }
    //ishlandi
}
