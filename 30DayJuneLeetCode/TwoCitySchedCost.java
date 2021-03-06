
/**
 * 
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], 
 * and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * 
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation: 
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 * 
 */

import java.util.*;

public class TwoCitySchedCost {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
        int sum = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            sum += costs[i][0] + costs[i + costs.length / 2][1];
        }
        return sum;
    }

    public static void main(String[] args) {
        TwoCitySchedCost twoCitySchedCost = new TwoCitySchedCost();
        int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
        System.out.println(twoCitySchedCost.twoCitySchedCost((costs)));
    }
}