package BinarySearch_2;

public class MinInSortedArray {

    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int l = 0;
        int h = nums.length - 1;
        if (nums[h] > nums[l])
            return nums[l];
        while (l < h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[l])
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        MinInSortedArray mSortedArray = new MinInSortedArray();
        int[] arr1 = new int[] { 3, 4, 5, 1, 2 };
        int[] arr2 = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(mSortedArray.findMin(arr1));
        System.out.println(mSortedArray.findMin(arr2));
    }
}