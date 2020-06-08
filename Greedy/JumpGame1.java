public class JumpGame1 {

    /**
     * DP - Top- Down Approach - Not So Efficient
     * 
     * @param nums
     * @return boolean
     */

    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = 1;
        return canj(nums, 0, dp);
    }

    public boolean canj(int[] nums, int i, int[] dp) {
        if (dp[i] != 0)
            return dp[i] == 1 ? true : false;
        if (i == nums.length - 1)
            return true;
        if (i > nums.length - 1)
            return false;
        for (int j = i + nums[i]; j > i; j--) {
            if (canj(nums, j, dp)) {
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = -1;
        return false;
    }

    /**
     * 
     * Greedy Approach - Most Efficient Way
     *
     */

    // public boolean canJump(int[] nums) {
    // int lastPos = nums.length - 1;
    // for (int i = nums.length - 1; i >= 0; i--) {
    // if (i + nums[i] >= lastPos) {
    // lastPos = i;
    // }
    // }
    // return lastPos == 0;
    // }

    public static void main(String[] args) {
        JumpGame1 jumpGame1 = new JumpGame1();
        int[] arr1 = { 2, 3, 1, 1, 4 };
        int[] arr2 = { 3, 2, 1, 0, 4 };
        System.out.println(jumpGame1.canJump(arr1));
        System.out.println(jumpGame1.canJump(arr2));
    }
}