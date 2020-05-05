package Day_1;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int min = 1, max = n;
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}