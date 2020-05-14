import java.util.*;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k == num.length())
            return "0";
        StringBuilder sb = new StringBuilder("");
        LinkedList<Character> st = new LinkedList<>();
        for (char c : num.toCharArray()) {
            while (st.size() > 0 && k > 0 && st.peekLast() > c) {
                st.pollLast();
                k--;
            }
            st.offerLast(c);
        }
        for (int i = 0; i < k; i++) {
            st.pollLast();
        }
        while (!st.isEmpty()) {
            sb.append(st.pollFirst());
        }
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveKDigits rkd = new RemoveKDigits();
        System.out.println(rkd.removeKdigits("1432219", 3));
        System.out.println(rkd.removeKdigits("10200", 1));
        System.out.println(rkd.removeKdigits("10", 2));
    }
}