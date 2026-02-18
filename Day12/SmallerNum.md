
---

# ✅ **Day 12 – README.md**

```markdown
# Day 12 – How Many Numbers Are Smaller Than the Current Number (LeetCode)

## 🧩 Problem
Given an integer array `nums`, return an array `result` such that:

result[i] = count of numbers smaller than nums[i]


---

## 📌 Example

Input:
nums = [8,1,2,2,3]

Output:
[4,0,1,1,3]


---

## 🧠 Problem Explanation (Simple)

For each number:

✔ Compare with all other numbers  
✔ Count strictly smaller elements  

---

## 🧠 My Approach

Use nested loops:

1. For each element → compare with all others
2. Ignore self comparison
3. Count smaller values

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= 0; j--) {

                if (nums[i] > nums[j] && i != j) {
                    count[i]++;
                }
            }
        }

        return count;
    }
}

