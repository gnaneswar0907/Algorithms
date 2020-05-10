public class PeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + ((h - l) / 2);
            if (nums[mid] > nums[mid + 1]) {
                if ((mid > 0 && nums[mid] > nums[mid - 1]) || mid == 0)
                    return mid;
            }
            if (nums[mid] > nums[mid + 1])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return h;
    }

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        int[] arr1 = new int[] { 1, 2, 3, 1 };
        int[] arr2 = new int[] { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(pe.findPeakElement(arr1));
        System.out.println(pe.findPeakElement(arr2));
    }
}