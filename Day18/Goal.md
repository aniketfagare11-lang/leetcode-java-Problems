# Goal Parser Interpretation – LeetCode 1678

## 🧩 Problem Summary

You are given a string `command` that contains the following patterns:

- `"G"`
- `"()"`
- `"(al)"`

You need to interpret the command string as follows:

- `"G"` → `"G"`
- `"()"` → `"o"`
- `"(al)"` → `"al"`

Return the final interpreted string.

---

## 🧠 Example

Input:
```
"G()(al)"
```

Output:
```
"Goal"
```

---

## 🧠 Approach

- Use Java `String.replace()` method
- Replace:
  - `"()"` with `"o"`
  - `"(al)"` with `"al"`
- Store the returned string (since Strings are immutable in Java)

---

## ✅ Java Solution

```java
public class Goal {
    static String interpret(String command){
        String result = command;
        result = result.replace("()", "o");
        result = result.replace("(al)", "al");
        return result;
    }

    public static void main(String[] args) {
        String command = "G()()()()(al)";
        String ans = interpret(command);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

```
O(n)
```

Where `n` is the length of the string.

---

## 🚀 Key Learning

- String immutability in Java
- Proper usage of `replace()` method
- Pattern-based string transformation

