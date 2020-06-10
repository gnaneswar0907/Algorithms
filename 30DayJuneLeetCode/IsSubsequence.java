
/**
 * Given a string s and a string t, check if s is subsequence of t.A subsequence
 * of a string is a new string which is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative
 * positions of the remaining characters. (ie, "ace" is a subsequence of "abcde"
 * while "aec" is not).
 * 
 * Input: s = "abc", t = "ahbgdc" Output: true
 * 
 * Input: s = "axc", t = "ahbgdc" Output: false
 */

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int lastIndex = -1, i = 0;
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.indexOf(c, lastIndex + 1) < 0) {
                return false;
            } else {
                lastIndex = t.indexOf(c, lastIndex + 1);
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}