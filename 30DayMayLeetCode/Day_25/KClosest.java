import java.util.*;

public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
        if (points.length == 1)
            return points;
        HashMap<Double, List<int[]>> map = new HashMap<>();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            double res = Math.sqrt((x * x) + (y * y));
            List<int[]> ll = map.getOrDefault(res, new ArrayList<>());
            ll.add(points[i]);
            map.put(res, ll);
            pq.add(res);
        }
        int[][] ans = new int[K][2];
        for (int j = 0; j < K; j++) {
            List<int[]> l = map.get(pq.poll());
            for (int[] arr : l) {
                if (j < K)
                    ans[j] = arr;
                if (l.size() > 1)
                    j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        KClosest kClosest = new KClosest();
        int[][] arr1 = { { 1, 3 }, { -2, 2 } };
        int[][] arr2 = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        kClosest.kClosest(arr1, 1);
        kClosest.kClosest(arr2, 2);
    }
}