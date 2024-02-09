package Leetcode.Arrays;

import java.util.ArrayList;

public class Problem11intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
       int index = 0;

       ArrayList<Integer> set = new ArrayList<>();
        for (int i : nums1) {
           for (int i1 : nums2) {
                if (i ==i1 && set.contains(i)==false)
                {set.add(i);


                }

            }
        }
        int []nums3 =new int[set.size()];
        for (int i : nums3) {
            nums3[index]=set.get(index);
index++;
        }
        return nums3;

    }
}
