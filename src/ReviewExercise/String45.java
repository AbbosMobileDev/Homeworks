package ReviewExercise;

import java.util.Scanner;

public class String45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       String arrays[] = s.split("[ ]");

        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int i1 = 0; i1 < arrays.length; i1++) {
                if (arrays[i].length()>arrays[i1].length()){
                    index = i1;
                }
            }
        }
        System.out.println(arrays[index]+" "+ arrays[index].length());

//ishlandi

    }
}
