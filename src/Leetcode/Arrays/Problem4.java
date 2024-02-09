package Leetcode.Arrays;

public class Problem4 {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index=i;
                return index;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>target){
                return i;
            }
        }
        return index;
    }
}
