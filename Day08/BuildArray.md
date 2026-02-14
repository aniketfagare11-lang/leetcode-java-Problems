# Day 08 – Build Array from Permutation (LeetCode)

## 🧩 Problem
Given a **zero-based permutation** array `nums`, build a new array `ans` such that:

ans[i] = nums[nums[i]]

A permutation means:
- Contains numbers from `0 → n-1`
- Each number appears exactly once

---

## 📌 Example

Input:
nums = [0,2,1,5,3,4]

Output:
[0,1,2,4,5,3]


---

## 🧠 Problem Explanation (Simple)

For each index `i`:

1. Take value at index `i` → `nums[i]`
2. Use that value as a new index
3. Pick value from that index → `nums[nums[i]]`

Store the result in `ans[i]`.

---

## 🧠 My Approach

1. Create a new array `ans` of the same length.
2. Traverse the original array.
3. Apply the formula:

ans[i] = nums[nums[i]]


4. Return the result array.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
