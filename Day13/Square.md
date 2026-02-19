# Day 13 – Squares of a Sorted Array (LeetCode)

## 🧩 Problem
Given an integer array `nums` sorted in **non-decreasing order**, return an array of the **squares of each number**, also sorted in non-decreasing order.

---

## 📌 Example

Input:
nums = [-4,-1,0,3,10]


Output:
[0,1,9,16,100]


---

## 🧠 Problem Explanation (Simple)

- Input array already sorted ✔️
- Squaring negative numbers changes order ❌

Example:

-4 → 16
-1 → 1


Squares become:

[16,1,0,9,100] ❌ unsorted

So we must:

1. Square all numbers
2. Sort the result

---

## 🧠 My Approach

### Step 1 – Create Result Array
Same size as input.

### Step 2 – Square Each Element
square = nums[i] * nums[i]

### Step 3 – Sort Result Array
Use Java’s built-in sorting function.

---

## 💻 Java Code (My Solution)

```java
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }
}
