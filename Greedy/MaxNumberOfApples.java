package Greedy;

import java.util.Arrays;

public class MaxNumberOfApples {
    public int maxNumberOfApples(int[] arr) {
        if (arr.length == 0)
            return 0;
        int count = 0, max = 5000;
        Arrays.sort(arr);
        for (int i : arr) {
            if (max - i >= 0) {
                max -= i;
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxNumberOfApples maxNumberOfApples = new MaxNumberOfApples();
        int[] l1 = { 100, 200, 150, 1000 };
        int[] l2 = { 900, 950, 800, 1000, 700, 800 };
        System.out.println(maxNumberOfApples.maxNumberOfApples(l1));
        System.out.println(maxNumberOfApples.maxNumberOfApples(l2));
    }
}