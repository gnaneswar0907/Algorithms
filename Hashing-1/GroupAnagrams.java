import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> fl = new ArrayList<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sum = new String(temp);
            List<String> ll = map.getOrDefault(sum, new ArrayList<>());
            ll.add(s);
            map.put(sum, ll);
        }
        for (List<String> l : map.values()) {
            fl.add(l);
        }
        return fl;
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ls = ga.groupAnagrams(strs);
        for (List<String> l : ls) {
            for (String s : l) {
                System.out.print(s);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}