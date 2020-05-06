package BinarySearch_1;

public class RotatedSortedSearch {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length;
        if (h == 0)
            return -1;
        if (h == 1)
            return nums[0] == target ? 0 : -1;
        int rotateIndex = getRotIndex(nums, l, h - 1);
        if (rotateIndex == 0) {
            return search(nums, l, h - 1, target);
        }
        if (nums[rotateIndex] == target)
            return rotateIndex;
        if (nums[l] > target) {
            return search(nums, rotateIndex + 1, h - 1, target);
        } else {
            return search(nums, l, rotateIndex - 1, target);
        }
    }

    public int search(int[] nums, int l, int h, int target) {
        while (l <= h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int getRotIndex(int[] nums, int l, int h) {
        if (nums[l] < nums[h])
            return 0;
        while (l <= h) {
            int rot = l + ((h - l) / 2);
            if (nums[rot] > nums[rot + 1]) {
                return rot + 1;
            }
            if (nums[rot] < nums[l]) {
                h = rot - 1;
            } else {
                l = rot + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        RotatedSortedSearch rss = new RotatedSortedSearch();
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(rss.search(nums, 0));
        System.out.println(rss.search(nums, 3));
    }
}