
/**
 * 
 * Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements 
 * in this subset satisfies: Si % Sj = 0 or Sj % Si = 0.
 * If there are multiple solutions, return any subset is fine.
 * 
 * Input: [1,2,3]
 * Output: [1,2] (of course, [1,3] will also be ok)
 * 
 * Input: [1,2,4,8]
 * Output: [1,2,4,8]
 */

import java.util.*;

public class LargestDivisibleSubset {

    /** Brute Force Approach */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l = new ArrayList<>();
        if (nums.length == 0)
            return l;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<Integer> ll = new ArrayList<>();
            ll.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                boolean divides = true;
                if (i != j) {
                    for (int k : ll) {
                        if (k % nums[j] == 0 || nums[j] % k == 0) {
                            divides = divides && true;
                        } else {
                            divides = divides && false;
                        }
                    }
                    if (divides)
                        ll.add(nums[j]);
                }
            }
            if (ll.size() > l.size())
                l = ll;
        }
        return l;
    }

    /** Dynamic Programming Solution */

    // public static List<Integer> largestDivisibleSubset(int[] nums) {
    // List<Integer> result = new ArrayList<Integer>();
    // if (nums.length == 0) return result;

    // Arrays.sort(nums); // step 1
    // int[] count = new int[nums.length];
    // Arrays.fill(count, 1); // individual element is subset of length 1

    // for (int i = 1; i < nums.length; i++) {
    // for (int j = i - 1; j >= 0; j--) {
    // if (nums[i] % nums[j] == 0) {
    // count[i] = Math.max(count[i], count[j] + 1); // step 2 for each element in
    // nums, find the length of largest subset it has.
    // }
    // }
    // }

    // int maxIndex = 0;
    // for (int i = 1; i < nums.length; i++) {
    // maxIndex = count[i] > count[maxIndex] ? i : maxIndex; // step 3 pick the
    // index of the largest element in count.
    // }

    // int temp = nums[maxIndex];
    // int currentCount = count[maxIndex];
    // for (int i = maxIndex; i >= 0; i--) {
    // if (temp % nums[i] == 0 && count[i] == currentCount) {
    // result.add(nums[i]); // step 4 from nums[maxIndex] to 0, add every element
    // belongs to the largest subset.
    // temp = nums[i];
    // currentCount--;
    // }
    // }
    // return result;
    // }

    public static void main(String[] args) {
        LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();
        int[] arr = { 1, 4, 5, 8, 12, 9 };
        for (int i : largestDivisibleSubset.largestDivisibleSubset(arr)) {
            System.out.print(i + "  ");
        }
    }
}