package Leetcode.Arrays;

import java.util.ArrayList;

public class Problem13DublicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

                if (set.contains(nums[i])==true && Math.abs(i-set.lastIndexOf(nums[i]))<=k) return true;
                else set.add(nums[i]);
        }

    return false;}
}
