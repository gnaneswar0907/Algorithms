public class SubArrayMax {
    public int maxSubarraySumCircular(int[] A) {
        // Time Limit Execeded But correct only. Brute Force

        // int l = A.length, maxLength=Integer.MIN_VALUE;
        // if(l==1) return A[0];
        // int[] B = new int[(2*l)-1];
        // for(int i=0;i<B.length;i++)
        // B[i] = A[(i%l)];
        // for(int i=0;i<l;i++){
        // int localMaximum = Integer.MIN_VALUE, sum = 0;
        // for(int j=i;j<(i+l);j++){
        // if(j>=l && (j%l)>=i){
        // break;
        // }
        // sum += B[j];
        // localMaximum = Math.max(sum, localMaximum);
        // }
        // maxLength = Math.max(maxLength, localMaximum);
        // }
        // return maxLength;

        int ans = A[0], curr = A[0], tot = A[0], min = A[0], minCurr = A[0];
        for (int i = 1; i < A.length; i++) {
            curr = Math.max(A[i] + curr, A[i]);
            ans = Math.max(ans, curr);
            tot += A[i];
            minCurr = Math.min(A[i], minCurr + A[i]);
            min = Math.min(min, minCurr);
        }
        int res = Math.max(ans, tot - min);
        return tot == min ? ans : res;
    }

    public static void main(String[] args) {
        SubArrayMax subArrayMax = new SubArrayMax();
        int[] arr1 = new int[] { 1, -2, 3, -2 };
        int[] arr2 = new int[] { 5, -3, 5 };
        int[] arr3 = new int[] { 3, -1, 2, -1 };
        int[] arr4 = new int[] { 3, -2, 2, -3 };
        int[] arr5 = new int[] { -2, -3, -1 };
        System.out.println(subArrayMax.maxSubarraySumCircular(arr1));
        System.out.println(subArrayMax.maxSubarraySumCircular(arr2));
        System.out.println(subArrayMax.maxSubarraySumCircular(arr3));
        System.out.println(subArrayMax.maxSubarraySumCircular(arr4));
        System.out.println(subArrayMax.maxSubarraySumCircular(arr5));
    }
}