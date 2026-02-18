# Day 11 – Find Numbers with Even Number of Digits (LeetCode)

## 🧩 Problem
Given an integer array `nums`, return the count of numbers that contain an **even number of digits**.

---

## 📌 Example

Input:
nums = [12,345,2,6,7896]

Output:
2


---

## 🧠 Problem Explanation (Simple)

We count how many numbers have:

- Even number of digits → ✅
- Odd number of digits → ❌

Example:

✔ 12 → 2 digits ✅  
✔ 345 → 3 digits ❌  
✔ 7896 → 4 digits ✅  

---

## 🧠 My Approach

For each number:

1. Count digits using repeated division by 10
2. Check if digit count is even
3. Increment result counter

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int findNumbers(int[] nums) {

        int count1 = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            int digit = nums[i];

            while (digit != 0) {
                digit = digit / 10;
                count++;
            }

            if (count % 2 == 0) {
                count1++;
            }
        }

        return count1;
    }
}
