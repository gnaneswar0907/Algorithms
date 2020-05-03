package Day_1;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int co = 0;
        for (char c : S.toCharArray()) {
            if (J.indexOf(c) >= 0)
                co++;
        }
        return co;
    }

    public static void main(String[] args) {
        JewelsAndStones js = new JewelsAndStones();
        System.out.println(js.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(js.numJewelsInStones("z", "ZZ"));
    }
}

// Test Case 1
// Input: J = "aA", S = "aAAbbbb"
// Output: 3

// Test Case 2
// Input: J = "z", S = "ZZ"
// Output: 0