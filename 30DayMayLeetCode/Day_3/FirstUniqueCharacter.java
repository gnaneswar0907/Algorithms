import java.util.*;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> ls = new ArrayList<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == 1)
                ls.add(c);
        }
        int index = Integer.MAX_VALUE;
        if (ls.isEmpty())
            return -1;
        for (char c : ls) {
            index = Math.min(index, s.indexOf(c));
        }
        return index;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter fuch = new FirstUniqueCharacter();
        System.out.println(fuch.firstUniqChar("leetcode"));
        System.out.println(fuch.firstUniqChar("loveleetcode"));
    }
}