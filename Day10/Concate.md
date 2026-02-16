# Day 10 – Concatenation of Array (LeetCode)

## 🧩 Problem
Given an integer array `nums`, return a new array `ans` such that:

ans = nums + nums


Meaning:
- The original array is repeated twice.

---

## 📌 Example

Input:
nums = [1,2,1]


Output:
[1,2,1,1,2,1]


---

## 🧠 Problem Explanation (Simple)

We need to create a new array that contains:

1. All elements of `nums`
2. Followed by the same elements again

---

## 🧠 My Approach

### Step 1 – Create Result Array
The new array must have double the size:

size = 2 * nums.length


---

### Step 2 – Copy Elements
For each index `i`:

- Place the original value at position `i`
- Place the same value at position `i + n`

Where:

n = nums.length

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // First half
            ans[i + n] = nums[i];   // Second half
        }

        return ans;
    }
}

