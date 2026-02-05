# Day 04 – Richest Customer Wealth (LeetCode)

## 🧩 Problem
You are given a 2D integer array `accounts` where:
- Each row represents a customer
- Each column represents the money in a bank account

Return the **maximum wealth** among all customers.

A customer’s wealth is the **sum of all their bank accounts**.

---

## 📌 Example

Input:
accounts = [
[1, 2, 3],
[3, 2, 1]
]


Output:


6


Explanation:
- Customer 1 wealth = 1 + 2 + 3 = 6  
- Customer 2 wealth = 3 + 2 + 1 = 6  
- Richest customer wealth = 6

---

## 🧠 My Approach (Simple Explanation)

1. Traverse each customer (row) one by one.
2. For each customer, calculate the total wealth by summing all their accounts.
3. Keep track of the maximum wealth found so far.
4. After checking all customers, return the maximum value.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = accounts[0][0];

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}

