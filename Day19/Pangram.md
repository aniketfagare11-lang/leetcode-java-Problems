# Check if the Sentence Is Pangram – LeetCode 1832

## 🧩 Problem Summary

A pangram is a sentence that contains every lowercase English letter at least once.

Given a string `sentence`, return:

- `true` → if it is a pangram  
- `false` → otherwise  

---

## 🧠 Example

Input:
```
"thequickbrownfoxjumpsoverthelazydog"
```

Output:
```
true
```

---

## 🧠 Approach

- Loop from `'a'` to `'z'`
- For each character, check if it exists in the sentence
- Use `String.indexOf(char)`
- If any letter is missing → return `false`
- If all letters exist → return `true`

---

## ✅ Java Solution

```java
public class Pangram {
    static boolean checkIfPangram(String sentence){

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) == -1)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

```
O(n)
```

We check 26 letters, and each search takes O(n).  
Since 26 is constant, overall complexity is O(n).

---

## 🚀 Key Learning

- Character iteration using `'a'` to `'z'`
- Proper use of `indexOf()` for searching
- Early return (fail-fast logic)
- Understanding pangram concept clearly

---