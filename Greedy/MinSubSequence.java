package Greedy;

import java.util.*;

public class MinSubSequence {

    public List<Integer> minSubsequence(int[] nums) {
        int totsum = 0, listsum = 0;
        List<Integer> l = new ArrayList<>();
        if (nums.length == 1) {
            l.add(nums[0]);
            return l;
        }
        for (int i : nums) {
            totsum += i;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (totsum - nums[i] >= listsum + nums[i]) {
                totsum -= nums[i];
                l.add(nums[i]);
                listsum += nums[i];
            } else {
                l.add(nums[i]);
                break;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        MinSubSequence minSubSequence = new MinSubSequence();
        int[] l1 = { 4, 3, 10, 9, 8 };
        int[] l2 = { 4, 4, 7, 6, 7 };
        int[] l3 = { 6 };
        List<Integer> ll1 = minSubSequence.minSubsequence(l1);
        List<Integer> ll2 = minSubSequence.minSubsequence(l2);
        List<Integer> ll3 = minSubSequence.minSubsequence(l3);
        for (Integer i : ll1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : ll2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : ll3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}