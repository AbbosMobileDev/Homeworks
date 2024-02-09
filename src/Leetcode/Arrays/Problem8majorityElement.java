package Leetcode.Arrays;

import java.util.Arrays;

public class Problem8majorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length/2];
            }
        }







