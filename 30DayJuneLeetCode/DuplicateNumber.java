/**
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1
 * and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one
 * 
 */

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return -1;
        int l = nums[0], h = nums[nums[0]];
        while (l != h) {
            l = nums[l];
            h = nums[nums[h]];
        }
        h = 0;
        while (l != h) {
            l = nums[l];
            h = nums[h];
        }
        return h;
    }

    public static void main(String[] args) {
        DuplicateNumber duplicateNumber = new DuplicateNumber();
        int[] arr1 = { 1, 3, 4, 2, 2 };
        int[] arr2 = { 3, 1, 3, 4, 2 };
        System.out.println(duplicateNumber.findDuplicate(arr1));
        System.out.println(duplicateNumber.findDuplicate(arr2));
    }
}