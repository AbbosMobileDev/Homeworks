package Leetcode.Arrays;

import java.util.Scanner;

public class Problem2 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        System.out.println(check(s));
    }

    public int check(String s) {
        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i),i+1) == -1) {
                return i;
            }
        }

        return -1;
    }

}
