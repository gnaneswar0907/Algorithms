class StockSpanner {
    private int[] prices;
    private int prevValue, currentIndex, prevCount;

    public StockSpanner() {
        prices = new int[10000];
        prevValue = Integer.MAX_VALUE;
        currentIndex = 0;
        prevCount = 0;
    }

    public int next(int price) {
        prices[currentIndex++] = price;
        if (prevValue > price) {
            prevValue = price;
            prevCount = 1;
            return 1;
        }
        int count = prevCount;
        for (int i = currentIndex - prevCount - 1; i >= 0; i--) {
            if (prices[i] <= price)
                count++;
            else {
                prevValue = price;
                prevCount = count;
                return count;
            }
        }
        prevValue = price;
        prevCount = count;
        return count;
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner(); int param_1 = obj.next(price);
 */