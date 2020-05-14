import java.util.*;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        if (nums.length == 1)
            return nums[0] == k ? 1 : 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int count = 0, sum=0;
        // map.put(0, 1);
        // for (int i = 0; i < nums.length; i++) {
        // sum += nums[i];
        // if (map.containsKey(sum - k))
        // count += map.get(sum - k);
        // map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }
        // return count;
    }

    public static void main(String[] args) {
        SubArraySum subArraySum = new SubArraySum();
        int[] nums = new int[] { 1, 1, 1 };
        System.out.println(subArraySum.subarraySum(nums, 2));
    }
}