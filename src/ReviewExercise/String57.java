package ReviewExercise;

import java.util.Scanner;

public class String57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (s.contains("  ")) {
            s = s.replace("  ", " ");


        }
        System.out.println(s);

//ishlandi
    }

}

