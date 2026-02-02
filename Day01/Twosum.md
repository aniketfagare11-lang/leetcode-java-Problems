# 🧩 LeetCode Problem 1: Two Sum

## 📌 Problem Statement
Given an array of integers `nums` and an integer `target`, find **indices of two different elements** whose sum is equal to `target`.

- Exactly one valid answer exists
- Same element cannot be used twice
- Order of indices does not matter

---

## 🧠 Example


---

## 🛠️ My Approach (Brute Force)

I solved this problem by **checking every possible pair** in the array.

### Logic:
1. Use two nested loops
2. Fix the first index `i`
3. Compare it with all elements after it (`j = i + 1`)
4. If `nums[i] + nums[j] == target`, return indices

This approach guarantees the correct answer because the problem ensures **exactly one solution**.

---

## 💻 Java Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
