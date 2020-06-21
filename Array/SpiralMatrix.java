import java.util.*;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        if (matrix.length == 0)
            return ll;
        int i = 0, j = 0, p = matrix.length - 1, q = matrix[0].length - 1;
        while (i <= p && j <= q) {
            for (int l = j; l <= q; l++) {
                ll.add(matrix[i][l]);
            }
            i++;
            for (int l = i; l <= p; l++) {
                ll.add(matrix[l][q]);
            }
            q--;
            if (i <= p) {
                for (int l = q; l >= j; l--) {
                    ll.add(matrix[p][l]);
                }
                p--;
            }
            if (j <= q) {
                for (int l = p; l >= i; l--) {
                    ll.add(matrix[l][j]);
                }
                j++;
            }
        }

        return ll;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> l = spiralMatrix.spiralOrder(arr);
        for (int i : l) {
            System.out.print(i + " ");
        }
    }
}