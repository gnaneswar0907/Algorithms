public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0, k = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                res[i] = nums[j];
                j++;
            } else {
                res[i] = nums[n + k];
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        int[] arr1 = { 2, 5, 1, 3, 4, 7 };
        int[] arr2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int[] arr3 = { 1, 1, 2, 2 };
        for (int i : shuffleArray.shuffle(arr1, 3)) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i : shuffleArray.shuffle(arr2, 4)) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i : shuffleArray.shuffle(arr3, 2)) {
            System.out.print(i + "  ");
        }
    }
}