import java.util.*;

public class LetterCase {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, 0, S.toCharArray());
        return ans;
    }

    public void backtrack(List<String> ans, int i, char[] S) {
        if (i == S.length)
            ans.add(new String(S));
        else {
            if (Character.isLetter(S[i])) { // If it's letter
                S[i] = Character.toUpperCase(S[i]);
                backtrack(ans, i + 1, S); // Upper case branch
                S[i] = Character.toLowerCase(S[i]);
                backtrack(ans, i + 1, S); // Lower case branch
            } else
                backtrack(ans, i + 1, S);
        }
    }

    public static void main(String[] args) {
        LetterCase letterCase = new LetterCase();
        List<String> l = letterCase.letterCasePermutation("a1b2");
        for (String s : l) {
            System.out.println(s);
        }
    }
}