# Day 06 – Maximum Number of Words Found in Sentences (LeetCode)

## 🧩 Problem
You are given an array of strings `sentences`, where each string represents a sentence.

Return the **maximum number of words** that appear in a single sentence.

A word is defined as a sequence of characters separated by **single spaces**.

---

## 📌 Example

Input:
["alice and bob love leetcode",
"i think so too",
"this is great thanks very much"]

Output:
6


Explanation:
- Sentence 1 → 5 words
- Sentence 2 → 4 words
- Sentence 3 → 6 words

Maximum = 6

---

## 🧠 My Approach (Simple Explanation)

1. Traverse each sentence one by one.
2. Count the number of spaces in the sentence.
3. Number of words = spaces + 1.
4. Track the maximum words found so far.
5. Return the maximum value.

---

## 💻 Java Code (My Solution)

```java
class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;
        int word = 0;

        for (int i = 0; i < sentences.length; i++) {

            int count = 0;

            for (int j = 0; j < sentences[i].length(); j++) {

                if (sentences[i].charAt(j) == ' ') {
                    count++;
                } else {
                    word = count + 1;
                }
            }

            if (max < word) {
                max = word;
            }
        }
        return max;
    }
}
