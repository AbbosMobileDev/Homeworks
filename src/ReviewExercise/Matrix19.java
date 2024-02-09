package ReviewExercise;

import java.util.Scanner;

public class Matrix19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.print("m=");
        int m = scanner.nextInt();

        int[][] arrays = new int[0][];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrays[n][m] = scanner.nextInt();

            }

            } for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println(arrays[n][m]+" ");
                }
                System.out.println("\n");
        }
    }}
