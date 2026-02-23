# Final Value of Variable After Performing Operations (LeetCode 2011)

## 🧩 Problem Summary

You are given an array of strings called `operations`.

Initially:

X = 0

Each operation can be:

- "++X" → Increase X
- "X++" → Increase X
- "--X" → Decrease X
- "X--" → Decrease X

Return the final value of X after all operations.

---

## 🧠 Approach

1. Start with X = 0  
2. Traverse the operations array  
3. If operation contains "+" → Increment  
4. Else → Decrement

---

## ✅ Java Solution

```java
public class Operations {
    static int finalValueAfterOperations(String[] operations){
        int x = 0;

        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].contains("+"))
            {
                x++;
            }
            else
            {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int ans = finalValueAfterOperations(operations);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

O(n)

---

## 🚀 Key Learning

- String array traversal  
- contains() method  
- Simple conditional logic