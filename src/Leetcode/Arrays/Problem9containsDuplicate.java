package Leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Problem9containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}
