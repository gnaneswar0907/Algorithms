import java.util.*;

public class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        int pl = p.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            map2.put(c1, map2.getOrDefault(c1, 0) + 1);
            if (i >= pl) {
                char c2 = s.charAt(i - pl);
                if (map2.get(c2) == 1) {
                    map2.remove(c2);
                } else {
                    map2.put(c2, map2.get(c2) - 1);
                }

            }
            if (map1.equals(map2)) {
                l.add(i - pl + 1);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        AllAnagrams allAnagrams = new AllAnagrams();
        for (Integer i : allAnagrams.findAnagrams("cbaebabacd", "abc")) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : allAnagrams.findAnagrams("abab", "ab")) {
            System.out.print(i + " ");
        }
    }
}