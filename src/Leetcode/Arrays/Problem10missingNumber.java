package Leetcode.Arrays;

import java.util.ArrayList;

public class Problem10missingNumber {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
       int m = 0;
        for (int num : nums) {
            arrayList.add(num);
        }
        for (int num : nums) {
            if (!arrayList.contains(m)) {
                return m;
            }
            else m++;
        }
        return m;
    }
}
