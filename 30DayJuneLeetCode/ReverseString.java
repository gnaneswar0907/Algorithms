/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory
 * 
 * You may assume all the characters consist of printable ascii characters
 * 
 * Input: ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
 * 
 * Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int l = s.length;
        for (int i = 0; i < l / 2; i++) {
            char c = s[i];
            s[i] = s[l - 1 - i];
            s[l - 1 - i] = c;
        }
    }

    /** Two Pointer Approach - Somehow Faster */
    // public void reverseString(char[] s) {
    // int left = 0, right = s.length - 1;
    // while (left < right) {
    // char tmp = s[left];
    // s[left++] = s[right];
    // s[right--] = tmp;
    // }
    // }
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        char[] s2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString.reverseString(s1);
        reverseString.reverseString(s2);
        for (char c : s1) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : s2) {
            System.out.print(c + " ");
        }
    }
}