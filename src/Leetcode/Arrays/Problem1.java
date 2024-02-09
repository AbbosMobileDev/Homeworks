package Leetcode.Arrays;

import java.util.Arrays;

public class Problem1 {
    public void main(String[] args) {
        int[] array1 = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(check(array1, target)));
    }

    public int[] check(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
