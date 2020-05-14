import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if (nums.length < 2)
            return 0;
        int maxLength = 0, count = 0;

        /**
         * Brute Force Approach - Time limit Exceeded
         */

        // for(int i=0;i<nums.length;i++){
        // int numZeroes=0, numOnes=0, localMax=0;
        // for(int j=i;j<nums.length;j++){
        // if(nums[j] == 0) numZeroes++;
        // else numOnes++;
        // if(numZeroes == numOnes) localMax = Math.max(localMax, j-i+1);
        // }
        // maxLength = Math.max(localMax, maxLength);
        // }
        // return maxLength;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = count - 1;
            } else {
                count = count + 1;
            }
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        ContiguousArray contiguousArray = new ContiguousArray();
        int[] nums1 = new int[] { 0, 1 };
        int[] nums2 = new int[] { 0, 1, 0 };
        System.out.println(contiguousArray.findMaxLength(nums1));
        System.out.println(contiguousArray.findMaxLength(nums2));
    }
}