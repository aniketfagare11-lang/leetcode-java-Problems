# Day 09 – Kids With the Greatest Number of Candies (LeetCode)

## 🧩 Problem
You are given:

- An integer array `candies`, where each element represents the number of candies a kid has.
- An integer `extraCandies`.

Return a boolean array (or list) `result` such that:

result[i] = true → If candies[i] + extraCandies >= maximum candies
result[i] = false → Otherwise


---

## 📌 Example

Input:
candies = [2,3,5,1,3]
extraCandies = 3


Output:
[true, true, true, false, true]


---

## 🧠 Problem Explanation (Simple)

For each kid:

1. Give them `extraCandies`
2. Check if they can have **at least as many candies as the kid with the maximum candies**

If yes → `true`  
If no → `false`

---

## 🧠 My Approach

### Step 1 – Find Maximum Candies
Traverse the array and determine the maximum candies any kid currently has.

---

### Step 2 – Compare Each Kid
For every kid:

candies[i] + extraCandies >= max ?


Store the result in a boolean list.

---

## 💻 Java Code (LeetCode Accepted)

```java
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];

        // Step 1 → Find maximum candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Step 2 → Build result list
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
