public class CountingBits {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 1; i <= num; i++)
            ans[i] = ans[i >> 1] + (i & 1); // x / 2 is x >> 1 and x % 2 is x & 1
        return ans;
    }

    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] res1 = countingBits.countBits(2);
        int[] res2 = countingBits.countBits(5);
        for (int i : res1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : res2) {
            System.out.print(i + " ");
        }
    }
}