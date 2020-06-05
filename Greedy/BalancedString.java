package Greedy;

public class BalancedString {
    public int balancedStringSplit(String s) {
        int count = 0, i = 0;
        while (i < s.length() - 1) {
            int lcount = 0, rcount = 0;
            if (s.charAt(i) == 'L') {
                lcount++;
            } else {
                rcount++;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == 'L') {
                    lcount++;
                } else {
                    rcount++;
                }
                if (lcount == rcount) {
                    count++;
                    i = j + 1;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BalancedString balancedString = new BalancedString();
        System.out.println(balancedString.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedString.balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedString.balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedString.balancedStringSplit("RLRRRLLRLL"));
    }
}