public class MaxSumAfterNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum = 0;
        Arrays.sort(A);
        int i = 0;
        while (A[i] < 0 && K > 0) {
            A[i] = -A[i];
            i++;
            K--;
        }
        if (K > 0) {
            if (K % 2 != 0) {
                if (i == 0) {
                    A[i] = -A[i];
                } else {
                    if (A[i - 1] > A[i]) {
                        A[i] = -A[i];
                    } else {
                        A[i - 1] = -A[i - 1];
                    }
                }

            }
        }
        for (int j : A) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxSumAfterNegations maxSum = new MaxSumAfterNegations();
        int[] arr1 = { 4, 2, 3 };
        int[] arr2 = { 3, -1, 0, 2 };
        int[] arr3 = { 2, -3, -1, 5, -4 };
        System.out.println(maxSum.largestSumAfterKNegations(arr1, 1));
        System.out.println(maxSum.largestSumAfterKNegations(arr2, 3));
        System.out.println(maxSum.largestSumAfterKNegations(arr3, 2));
    }
}