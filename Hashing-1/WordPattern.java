import java.util.*;

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        String[] strs = str.split(" ");
        if (pattern.length() != strs.length)
            return false;
        int i = 0;
        for (char cc : pattern.toCharArray()) {
            if (map.containsKey(cc)) {
                if (!map.get(cc).equals(strs[i]))
                    return false;
            } else {
                if (map.containsValue(strs[i])) {
                    return false;
                }
                map.put(cc, strs[i]);
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wp.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wp.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wp.wordPattern("abba", "dog dog dog dog"));
    }
}