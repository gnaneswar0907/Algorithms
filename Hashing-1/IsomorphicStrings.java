import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                char c = map.get(Character.valueOf(s.charAt(i))).charValue();
                if (!(t.charAt(i) == c)) {
                    return false;
                }
            } else {
                char mapValue = t.charAt(i);
                if (map.values().contains(mapValue)) {
                    return false;
                } else {
                    map.put(s.charAt(i), mapValue);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.isIsomorphic("egg", "add"));
        System.out.println(is.isIsomorphic("foo", "bar"));
        System.out.println(is.isIsomorphic("paper", "title"));
    }
}