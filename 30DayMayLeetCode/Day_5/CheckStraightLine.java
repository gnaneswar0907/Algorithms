public class CheckStraightLine {
    public boolean checkStraightLine(int[][] c) {
        if (c.length == 2)
            return true;
        if (c.length > 2) {
            int x1 = c[0][0], y1 = c[0][1], x2 = c[1][0], y2 = c[1][1];
            if (x2 - x1 != 0) {
                int m = (y2 - y1) / (x2 - x1);
                int cc = y1 - (m * x1);
                for (int[] a : c) {
                    if (a[1] != (m * a[0]) + cc) {
                        return false;
                    }
                }

                return true;
            } else {
                for (int[] a : c) {
                    if (a[0] != x1) {
                        return false;
                    }
                }

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckStraightLine cst = new CheckStraightLine();
        int[][] arr1 = new int[][] { { 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 7 } };
        System.out.println(cst.checkStraightLine(arr1));
    }
}