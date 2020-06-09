/**
 * 
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * Input: 1 Output: true Explanation: 20 = 1
 * 
 * 
 * Input: 16 Output: true Explanation: 24 = 16
 * 
 * Input: 218 Output: false
 */

public class PowerOf2 {

    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count == 1;
    }

    // public boolean isPowerOfTwo(int n) {
    // double i = (double)n;
    // while(i>1){
    // i=i/2;
    // }
    // return i==1;
    // }

    public static void main(String[] args) {
        PowerOf2 powerOf2 = new PowerOf2();
        System.out.println(powerOf2.isPowerOfTwo(1));
        System.out.println(powerOf2.isPowerOfTwo(16));
        System.out.println(powerOf2.isPowerOfTwo(218));
    }
}