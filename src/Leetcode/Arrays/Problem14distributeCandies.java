package Leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Problem14distributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            if (set.contains(candyType[i])!=true) set.add(candyType[i]);


        }
        if (set.size()<=candyType.length/2)return set.size();

        return candyType.length/2;
    }
}
