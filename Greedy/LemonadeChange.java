public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5)
                five++;
            else if (bill == 10) {
                if (five == 0)
                    return false;
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] arr1 = { 5, 5, 5, 10, 20 };
        int[] arr2 = { 5, 5, 10, 10, 20 };
        System.out.println(lemonadeChange.lemonadeChange(arr1));
        System.out.println(lemonadeChange.lemonadeChange(arr2));
    }
}