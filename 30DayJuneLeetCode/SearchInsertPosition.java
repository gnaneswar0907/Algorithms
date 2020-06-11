/**
 * 
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted
 * 
 * 
 * Input: [1,3,5,6], 5 | Output: 2
 * 
 * Input: [1,3,5,6], 2 | Output: 1
 * 
 * Input: [1,3,5,6], 7 | Output: 4
 * 
 * Input: [1,3,5,6], 0 | Output: 0
 */

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return h + 1;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] arr = { 1, 3, 5, 6 };
        System.out.println(searchInsertPosition.searchInsert(arr, 5));
        System.out.println(searchInsertPosition.searchInsert(arr, 2));
        System.out.println(searchInsertPosition.searchInsert(arr, 7));
        System.out.println(searchInsertPosition.searchInsert(arr, 0));
    }
}