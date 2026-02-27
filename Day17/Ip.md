# Defanging an IP Address – LeetCode 1108

## 🧩 Problem Summary

Given a valid IPv4 address string, return a "defanged" version of that address.

A defanged IP address replaces every period `"."` with `"[.]"`.

---

## 🧠 Example

Input:
```
"1.1.1.1"
```

Output:
```
"1[.]1[.]1[.]1"
```

---

## 🧠 Approach

- Strings in Java are **immutable**
- The `replace()` method does not modify the original string
- It returns a **new string**
- Store the returned value and return it

---

## ✅ Java Solution

```java
public class Ip {
    static String defangIPaddr(String address) {
        String ip = address;
        ip = ip.replace(".", "[.]");
        return ip;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
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
- Proper use of `replace()` method
- Returning modified string correctly

---

