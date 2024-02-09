package Leetcode.Arrays;

public class Problem12movezero {
    public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                for (int i1 = i+1; i1 < nums.length; i1++) {
                    if (nums[i1]!=0){
                        nums[i]=nums[i1];
                        nums[i1]=0;
                        break;
                    }
                }
            }
        }

    }
}
