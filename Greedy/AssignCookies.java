import java.util.*;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0, i = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        AssignCookies assignCookies = new AssignCookies();
        int[] greed = { 1, 2, 3 };
        int[] size = { 1, 2 };
        System.out.println(assignCookies.findContentChildren(greed, size));
    }
}