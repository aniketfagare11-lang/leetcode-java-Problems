# Sum of All Odd Length Subarrays – LeetCode 1588

## 🧩 Problem Summary

Given an integer array `int[] arr`, return the **sum of all possible subarrays** that have an **odd length**.

---

## 🧠 Approach

We generate all subarrays using **two loops**:

1️⃣ Fix starting index  
2️⃣ Expand ending index  

For each subarray:

✔ Maintain running sum  
✔ Calculate length  
✔ Add sum only if length is odd

---

## ✅ Logic Breakdown

- `tempSum` → stores current subarray sum  
- `length = j - i + 1` → subarray length  
- `length % 2 != 0` → checks odd length  

---

## ✅ Java Solution

```java
public class Sumofodd {
    static int sumOddLengthSubarrays(int[] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){

            int tempSum = 0;

            for(int j = i; j < arr.length; j++){

                tempSum += arr[j];

                int length = j - i + 1;

                if(length % 2 != 0){
                    sum += tempSum;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}
```

---

## ⏱ Time Complexity

```
O(n²)
```

We generate all subarrays.

---

## 🚀 Key Learning

- Subarray generation  
- Running sum technique  
- Odd/Even length logic  
- Brute force problem solving  

