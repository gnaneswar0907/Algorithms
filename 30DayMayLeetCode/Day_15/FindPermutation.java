import java.util.*;

public class FindPermutation {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        int wStart = 0, wEnd = 0, count = map1.size();
        // for(int i=0;i<s2.length();i++){
        // char c1 = s2.charAt(i);
        // map2.put(c1, map2.getOrDefault(c1, 0)+1);
        // if(i>=l1){
        // char c2 = s2.charAt(i-l1);
        // if(map2.get(c2)==1){
        // map2.remove(c2);
        // }
        // else{
        // map2.put(c2, map2.get(c2)-1);
        // }
        // }
        // if(map1.equals(map2)) return true;
        // }
        while (wEnd < s2.length()) {
            char c1 = s2.charAt(wEnd);
            if (map1.containsKey(c1)) {
                map1.put(c1, map1.get(c1) - 1);
                if (map1.get(c1) == 0)
                    count--;
            }

            while (count == 0) {
                if (wEnd - wStart + 1 == l1)
                    return true;
                char c2 = s2.charAt(wStart);
                if (map1.containsKey(c2)) {
                    map1.put(c2, map1.get(c2) + 1);
                    if (map1.get(c2) > 0)
                        count++;
                }
                wStart++;
            }
            wEnd++;
        }
        return false;
    }

    public static void main(String[] args) {
        FindPermutation findPermutation = new FindPermutation();
        System.out.println(findPermutation.checkInclusion("ab", "eidbaooo"));
        System.out.println(findPermutation.checkInclusion("ab", "eidboaoo"));
    }
}