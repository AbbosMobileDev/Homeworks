package ReviewExercise;

import java.util.Scanner;

public class String60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.indexOf("\\",3)==-1){
            System.out.println('\\');
        }
        else {
            s =s.substring(3,s.indexOf("\\",3));
            System.out.println(s);
        }

//ishlandi
    }
}
