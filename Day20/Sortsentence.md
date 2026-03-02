# Sorting the Sentence – LeetCode 1859

## 🧩 Problem Summary

You are given a shuffled sentence where:

- Each word ends with a digit.
- The digit represents the correct position of that word in the sentence.

Your task is to:
- Rearrange the words based on their position numbers
- Remove the numbers
- Return the correctly ordered sentence

---

## 🧠 Example

Input:
```
"is2 sentence4 This1 a3"
```

Output:
```
"This is a sentence"
```

---

## 🧠 Approach

1. Split the sentence using space → `split(" ")`
2. Create a result array of same size
3. For each word:
   - Extract last character (position digit)
   - Convert digit character to integer
   - Remove digit using `substring()`
   - Place word at correct index in result array
4. Join result array into final sentence using `StringBuilder`

---

## ✅ Java Solution

```java
package Day20;

public class Sortsentence {
    
    static String sortSentence(String s){
    
        String [] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++)
        {
            char lastChar = words[i].charAt(words[i].length() - 1);
            int position = lastChar - '0';
            String cleanWord = words[i].substring(0, words[i].length() - 1);
            result[position - 1] = cleanWord;
        }

        StringBuilder finalSentence = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            finalSentence.append(result[i]);

            if (i != result.length - 1) {
                finalSentence.append(" ");
            }
        }

        return finalSentence.toString();
    }
    
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

```
O(n)
```

- Splitting the sentence → O(n)
- Single pass through words → O(n)
- Building final string → O(n)

Overall linear complexity.

---

## 🚀 Key Learning

- String splitting
- Character extraction using `charAt()`
- Converting char digit to integer
- Using `substring()`
- Building string efficiently using `StringBuilder`

---
