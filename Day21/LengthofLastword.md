# Length of Last Word – LeetCode 58

## 🧩 Problem Summary

Given a string `s` consisting of words and spaces, return the **length of the last word** in the string.

A word is defined as a sequence of non-space characters.

---

## 🧠 Example 1

Input:
```
"Hello World"
```

Output:
```
5
```

---

## 🧠 Example 2

Input:
```
"   fly me   to   the moon  "
```

Output:
```
4
```

---

## 🧠 Approach

1. Remove leading and trailing spaces using `trim()`
2. Split the string using space `" "` as delimiter
3. Access the last element of the array
4. Return its length

---

## ✅ Java Solution

```java
package Day21;

public class LengthofLastword {
    
    static int lengthOfLastWord(String s){
        String trimString = s.trim();
        String[] words = trimString.split(" ");

        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

```
O(n)
```

- `trim()` takes O(n)
- `split()` takes O(n)

Overall linear time complexity.

---

## 🚀 Key Learning

- Using `trim()` to remove extra spaces
- Splitting strings using `split()`
- Accessing last element in an array
- Handling edge cases with trailing spaces

---

