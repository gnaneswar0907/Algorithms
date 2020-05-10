package BinarySearch_2;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target ? new int[] { 0, 0 } : new int[] { -1, -1 };
        int someIndex = binSearch(nums, target);
        if (someIndex == -1) {
            return new int[] { -1, -1 };
        }
        int i = someIndex, j = someIndex;
        while (i > 0) {
            if (nums[i - 1] == target) {
                i--;
            } else {
                break;
            }
        }
        while (j < nums.length - 1) {
            if (nums[j + 1] == target) {
                j++;
            } else {
                break;
            }
        }
        return new int[] { i, j };
    }

    private int binSearch(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchRange sr = new SearchRange();
        int[] arr = new int[] { 5, 7, 7, 8, 8, 10 };
        int[] res = sr.searchRange(arr, 8);
        System.out.println("Range : " + "[" + res[0] + ", " + res[1] + "]");
        int[] res2 = sr.searchRange(arr, 6);
        System.out.println("Range : " + "[" + res2[0] + ", " + res2[1] + "]");
    }
}