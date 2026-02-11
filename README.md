# Day 05 – Number of Steps to Reduce a Number to Zero (LeetCode)

## 🧩 Problem
Given an integer `num`, return the number of steps to reduce it to zero.

### Rules:
- If `num` is **even** → divide it by 2  
- If `num` is **odd** → subtract 1  

Repeat the process until `num` becomes 0.

Return the **total number of steps**.

---

## 📌 Example

Input:
num=14

Output:
6


Explanation:
- 14 → 7 (even → divide by 2)
- 7 → 6 (odd → subtract 1)
- 6 → 3
- 3 → 2
- 2 → 1
- 1 → 0

Steps = 6

---

## 🧠 My Approach (Simple Explanation)

1. Use a loop to repeat the process until `num` becomes 0.
2. For each step:
   - Check if the number is even or odd.
   - Perform the required operation.
3. Maintain a counter to track the number of steps.
4. Return the counter.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
        return count;
    }
}
