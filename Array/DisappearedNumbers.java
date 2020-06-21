import java.util.*;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        if (nums.length == 0)
            return l;
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                l.add(i + 1);
        }
        return l;
    }

    public static void main(String[] args) {
        DisappearedNumbers disappearedNumbers = new DisappearedNumbers();
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        for (int i : disappearedNumbers.findDisappearedNumbers(arr)) {
            System.out.print(i + " ");
        }
    }
}