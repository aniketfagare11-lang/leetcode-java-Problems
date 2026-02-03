# Day 03 – Running Sum of 1D Array (LeetCode)

## 🧩 Problem
Given an integer array `nums`, return the running sum of the array.

The running sum at index `i` is the sum of all elements from index `0` to `i`.

### Example:
Input:
[1,2,3,4]

Output:
[1,3,6,10]


---

## 🧠 My Approach (Simple Explanation)

1. Create a new array to store the running sum.
2. Use a variable `sum` to keep track of the total while traversing the array.
3. Traverse the array once:
   - Add the current element to `sum`
   - Store `sum` in the result array at the same index
4. Return the result array.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
