import java.util.*;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        int r = 0;
        for (Integer i : map.values()) {
            int q = (i / 2);
            l += (q * 2);
            if (i % 2 != 0)
                r = 1;
        }
        return r != 0 ? l + 1 : l;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("abccccdd"));
    }
}