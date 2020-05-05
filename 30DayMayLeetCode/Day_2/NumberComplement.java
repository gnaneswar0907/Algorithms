package Day_2;

public class NumberComplement {
    public int findComplement(int num) {
        // My Solution
        String ss = Integer.toBinaryString(num);
        String s = "";
        for (char c : ss.toCharArray()) {
            if (c == '1')
                s = s + "0";
            else
                s = s + "1";
        }
        int l = Integer.parseInt(s, 2);
        return l;

        // Better 1

        // int res = 0, ind = 0;
        // if(num ==0) return 1;
        // while(num > 0){
        // //find single digit from low to high significance
        // int digit = num % 2;
        // int flippedDigit = (digit == 1? 0 : 1); // flip digit
        // res += (flippedDigit << ind);
        // num /= 2;
        // ind++;
        // }
        // return res;

        // Better 2

        // int x = 1;
        // do{
        // x <<= 1;
        // }while(x <= N);
        // return N ^ (x-1);
    }

    public static void main(String[] args) {
        NumberComplement nc = new NumberComplement();
        System.out.println(nc.findComplement(5));
        System.out.println(nc.findComplement(7));
        System.out.println(nc.findComplement(10));
    }
}