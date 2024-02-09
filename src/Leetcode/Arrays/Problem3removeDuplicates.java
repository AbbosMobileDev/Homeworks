package Leetcode.Arrays;

public class Problem3removeDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 2, 1, 4, 5, 6, 7};

    }

    public int[] removeDuplicates(int[] nums) {
        int index = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int k = i + 1;
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] != nums[j])) {
                    nums[k++] = nums[j];
                }
                n = k;
            }

        }
        return nums;
    }

}