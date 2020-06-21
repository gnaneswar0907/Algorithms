import java.util.*;

public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] matrix) {
        int M = matrix.length;
        if (M == 0)
            return new int[0];
        int N = matrix[0].length;
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                LinkedList<Integer> l = map.getOrDefault(i + j, new LinkedList<>());
                l.add(matrix[i][j]);
                map.put(i + j, l);
            }
        }

        int[] res = new int[M * N];
        int p = 0;
        for (int k = 0; k < M + N - 1; k++) {
            LinkedList<Integer> l = map.get(k);
            if (k % 2 == 0) {
                while (l.size() > 0) {
                    res[p++] = l.pollLast();
                }
            } else {
                while (l.size() > 0) {
                    res[p++] = l.pollFirst();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        DiagonalTraversal diagonalTraversal = new DiagonalTraversal();
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] res = diagonalTraversal.findDiagonalOrder(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}