# Day 07 – Shuffle the Array (LeetCode)

## 🧩 Problem
You are given an integer array `nums` consisting of `2n` elements.

The array format is:
[x1, x2, ..., xn, y1, y2, ..., yn]


Return the array in the following format:
[x1, y1, x2, y2, ..., xn, yn]


---

## 📌 Example

Input:
nums = [2,5,1,3,4,7]
n = 3

Output:

Explanation:
- First half (x) → [2,5,1]
- Second half (y) → [3,4,7]

Result → [2,3,5,4,1,7]

---

## 🧠 My Approach (Simple Explanation)

1. Create a new result array of the same size.
2. Traverse only the first half of the array (0 → n).
3. For each index:
   - Pick element from first half → `nums[i]`
   - Pick element from second half → `nums[i + n]`
4. Place them alternately in the result array:
   - Even index → x element
   - Odd index → y element
5. Return the result array.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {

            int x = nums[i];
            int y = nums[i + n];

            result[2 * i] = x;
            result[2 * i + 1] = y;
        }

        return result;
    }
}
