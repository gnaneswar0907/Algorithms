public class SingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (nums[mid] == nums[mid - 1]) {
                if ((mid - l + 1) % 2 == 0) {
                    l = mid + 1;
                } else {
                    h = mid - 2;
                }
            } else {
                if ((h - mid) % 2 == 0) {
                    l = mid + 2;
                } else {
                    h = mid - 1;
                }
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        SingleNonDuplicate snd = new SingleNonDuplicate();
        int[] arr1 = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int[] arr2 = new int[] { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println(snd.singleNonDuplicate(arr1));
        System.out.println(snd.singleNonDuplicate(arr2));
    }
}