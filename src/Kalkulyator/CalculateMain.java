package Kalkulyator;

import java.util.Scanner;

public class CalculateMain  {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("a ni kiriting :");
        double a = scanner.nextDouble();
        System.out.println("arifmetik amalni kirirting :");
        String s = scanner.next();
        System.out.println("b ni kiriting :");
        double b = scanner.nextDouble();
        Arifmetic arifmetic = new Arifmetic(a,b);
        switch (s){
            case "+" :
                arifmetic.plus();break;
            case "-" :
                arifmetic.minus();break;
            case "*" :
              arifmetic.increase();break;
            case "/" :
               arifmetic.decrease();break;
            default:
                System.out.println("ERROR");

        }

    }



}
