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
