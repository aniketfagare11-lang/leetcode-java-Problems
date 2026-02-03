# Day 02 – Palindrome Number (LeetCode)

## 🧩 Problem
Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number is a number that reads the same backward as forward.

### Examples:
- `121` → true  
- `-121` → false  
- `10` → false  

---

## 🧠 My Approach (Logic in Simple Words)

1. Negative numbers can never be palindrome, so return `false` immediately.
2. Store the original number in a separate variable.
3. Reverse the given number using a loop.
4. After reversing, compare the reversed number with the original number.
5. If both are equal, it is a palindrome.

---

## 💻 Java Solution (My Code)

```java
class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int n = x;
        int reversed = 0;

        while (x != 0) {
            int reminder = x % 10;
            reversed = reversed * 10 + reminder;
            x /= 10;
        }

        return reversed == n;
    }
}
