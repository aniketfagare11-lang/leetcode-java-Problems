# Reverse String – LeetCode 344

## 🧩 Problem Summary

Given a character array `char[] s`, reverse the string **in-place**.

### ⚠️ Important Constraints

- ❌ Do NOT create a new array  
- ❌ Do NOT return anything  
- ✅ Modify the same array

---

## 🧠 Approach

We use a **two-pointer swapping technique**:

1. Start from both ends of the array  
2. Swap characters  
3. Move inward until pointers meet

This ensures:

✔ In-place modification  
✔ Optimal space usage  

---

## ✅ Java Solution

```java
import java.util.Arrays;

public class ReverseString {
    static void reverseString(char[] s){
        for(int i = 0; i < s.length / 2; i++)
        {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
```

---

## ⏱ Time Complexity

```
O(n)
```

We traverse half of the array.

---

## 🚀 Key Learning

- Two-pointer technique  
- In-place array manipulation  
- Swapping logic  

---

🔥 Clean logic + Efficient solution