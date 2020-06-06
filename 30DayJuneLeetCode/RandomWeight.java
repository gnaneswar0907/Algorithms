
/**
 * 
 * Given an array w of positive integers, where w[i] describes the weight of index i, 
 * write a function pickIndex which randomly picks an index in proportion to its weight.
 * 
 * Input: 
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output: [null,0]
 * 
 * Input: 
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output: [null,0,1,1,1,0]
 */

import java.util.*;

public class RandomWeight {
    int[] sums;
    Random rand;

    public RandomWeight(int[] w) {
        rand = new Random();
        for (int i = 1; i < w.length; i++) {
            w[i] += w[i - 1];
        }
        this.sums = w;
    }

    public int pickIndex() {
        int temp = rand.nextInt(sums[sums.length - 1]) + 1;
        int l = 0;
        int h = sums.length - 1;
        while (l < h) {
            int mid = (l + h) / 2;
            if (temp == sums[mid])
                return mid;
            else if (temp < sums[mid])
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}