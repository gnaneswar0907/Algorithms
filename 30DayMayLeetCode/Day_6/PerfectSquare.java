public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1)
            return true;
        int l = 0;
        int h = num;
        float nums = num;
        while (l < h) {
            float mid = l + ((h - l) / 2);
            if (mid == (nums / mid))
                return true;
            else if (mid > (nums / mid))
                h = (int) mid;
            else
                l = (int) mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSquare ps = new PerfectSquare();
        System.out.println(ps.isPerfectSquare(16));
        System.out.println(ps.isPerfectSquare(14));
    }
}