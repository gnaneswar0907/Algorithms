import java.util.*;

public class TownJudge {
    public int findJudge(int N, int[][] trust) {
        int tempJudge = -1;
        if (trust.length < N - 1)
            return -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            List<Integer> l = map.getOrDefault(trust[i][0], new ArrayList<>());
            l.add(trust[i][1]);
            map.put(trust[i][0], l);
        }
        Set<Integer> s = map.keySet();
        for (int i = 1; i <= N; i++) {
            if (!s.contains(i)) {
                if (tempJudge == -1) {
                    tempJudge = i;
                } else {
                    return -1;
                }
            }
        }
        for (List<Integer> ll : map.values()) {
            if (!ll.contains(tempJudge)) {
                return -1;
            }
        }
        return tempJudge;
    }

    public static void main(String[] args) {
        TownJudge tj = new TownJudge();
        int N = 4;
        int[][] trust = new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
        System.out.println(tj.findJudge(N, trust));
    }
}