package Leetcode.Arrays;

public class Problem5 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i : nums)  {
            if (i != val) {
                nums[index++] = i;
            }
        }
        return index;
    }

}