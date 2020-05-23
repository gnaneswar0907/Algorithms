import java.util.*;
import java.util.stream.Collectors;

public class FrequencySort {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> resMap = map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> it : resMap.entrySet()) {
            for (int i = 0; i < (int) it.getValue(); i++) {
                res.append(it.getKey());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        FrequencySort frequencySort = new FrequencySort();
        System.out.println(frequencySort.frequencySort("tree"));
        System.out.println(frequencySort.frequencySort("cccaaa"));
        System.out.println(frequencySort.frequencySort("Aabb"));
    }
}