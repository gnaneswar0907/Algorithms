public class HouseRobber {
    public int rob(int[] nums) {
        int[] res = new int[nums.length + 1];
        if (nums.length == 0)
            return 0;
        res[0] = 0;
        res[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            res[i] = Math.max(nums[i - 1] + res[i - 2], res[i - 1]);
        }
        return res[nums.length];
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] arr1 = new int[] { 1, 2, 3, 1 };
        int[] arr2 = new int[] { 2, 7, 9, 3, 1 };
        System.out.println(houseRobber.rob(arr1));
        System.out.println(houseRobber.rob(arr2));
    }
}