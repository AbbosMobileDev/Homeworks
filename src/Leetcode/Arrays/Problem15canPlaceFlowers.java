package Leetcode.Arrays;

import java.util.ArrayList;

public class Problem15canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      int count=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if ((flowerbed[0]==0 && flowerbed[1]==0) )
            {count++;
                flowerbed[0]=1;
            }
            if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                count++;
                flowerbed[flowerbed.length-1]=0;
            }
            if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                flowerbed[i]=1;
                count++;

            }

        }
        return false;
    }
}
