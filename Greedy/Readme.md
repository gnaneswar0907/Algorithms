# Greedy Type Problems

- [Split a String in Balanced Strings](https://github.com/gnaneswar0907/Algorithms/blob/master/Greedy/BalancedString.java)

Balanced strings are those who have equal quantity of 'L' and 'R' characters.Given a balanced string s split it in the maximum amount of balanced strings. Return the maximum amount of splitted balanced strings.

```java
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
```

---

- [Minimum Subsequence in Non-Increasing Order](https://github.com/gnaneswar0907/Algorithms/blob/master/Greedy/MinSubSequence.java)

Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence. If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, return the subsequence with the maximum total sum of all its elements. A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array.

`Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order`

```java
Input: nums = [4,3,10,9,8]
Output: [10,9]
Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included, however, the subsequence [10,9] has the maximum total sum of its elements.

Input: nums = [4,4,7,6,7]
Output: [7,7,6]
Explanation: The subsequence [7,7] has the sum of its elements equal to 14 which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. Note the subsequence has to returned in non-decreasing order.
```

---

- [How Many Apples Can You Put into the Basket](https://github.com/gnaneswar0907/Algorithms/blob/master/Greedy/MaxNumberOfApples.java)

You have some apples, where arr[i] is the weight of the i-th apple. You also have a basket that can carry up to 5000 units of weight. Return the maximum number of apples you can put in the basket

```java
Input: arr = [100,200,150,1000]
Output: 4
Explanation: All 4 apples can be carried by the basket since their sum of weights is 1450.

Input: arr = [900,950,800,1000,700,800]
Output: 5
Explanation: The sum of weights of the 6 apples exceeds 5000 so we choose any 5 of them.
```

---

- [Lemonade Change](https://github.com/gnaneswar0907/Algorithms/blob/master/Greedy/LemonadeChange.java)

At a lemonade stand, each lemonade costs $5. 
Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer, so that the net transaction is that the customer pays \$5.
Note that you don't have any change in hand at first.Return true if and only if you can provide every customer with correct change.

```java
Input: [5,5,5,10,20]
Output: true
Explanation:
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.


Input: [5,5,10,10,20]
Output: false
Explanation:
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we cant give change of $15 back because we only have two $10 bills.
Since not every customer received correct change, the answer is false.
```

---

- [Maximize Sum Of Array After K Negations](https://github.com/gnaneswar0907/Algorithms/blob/master/Greedy/MaxSumAfterNegations.java)

Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with -A[i], and we repeat this process K times in total. (We may choose the same index i multiple times. Return the largest possible sum of the array after modifying it in this way.

```java
Input: A = [4,2,3], K = 1
Output: 5
Explanation: Choose indices (1,) and A becomes [4,-2,3].

Input: A = [3,-1,0,2], K = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].

Input: A = [2,-3,-1,5,-4], K = 2
Output: 13
Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
```

---
