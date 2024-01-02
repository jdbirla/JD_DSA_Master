# JD_DSA_Problems_Solutions

- JavaTPoint:
    - All Programs: https://www.javatpoint.com/java-programs
- Java2Blog
    - https://java2blog.com/java-coding-interview-questions/
- Hotodoinjava
   - https://howtodoinjava.com/interview-questions/interview-puzzles-coding-exercises/
   - https://github.com/lokeshgupta1981/Core-Java/tree/master/src/main/java/com/howtodoinjava/puzzles

  - [String](#string)
    - [How do you reverse a string in Java?](#how-do-you-reverse-a-string-in-java)
    - [How do you check whether a string is a palindrome in Java?](#how-do-you-check-whether-a-string-is-a-palindrome-in-java)
    - [Write a java program to check if two Strings are anagram in java?](#write-a-java-program-to-check-if-two-strings-are-anagram-in-java)
    - [How to check if one String is rotation of another String in java?](#how-to-check-if-one-string-is-rotation-of-another-string-in-java)
    - [Find first non repeated character in String in java?](#find-first-non-repeated-character-in-string-in-java)
    - [Find the longest substring without repeating characters](#find-the-longest-substring-without-repeating-characters)
    - [How to check if String has all unique characters in java](#how-to-check-if-string-has-all-unique-characters-in-java)
    - [Java Program to find duplicate Characters in a String](#java-program-to-find-duplicate-characters-in-a-string)
    - [Find all substrings of a String in java](#find-all-substrings-of-a-string-in-java)
  - [Array Problems](#array-problems)
    - [Java program to find missing number in an array](#java-program-to-find-missing-number-in-an-array)
    - [Rotate an array by K positions.](#rotate-an-array-by-k-positions)
    - [Write Java program that checks if two arrays contain the same elements.](#write-java-program-that-checks-if-two-arrays-contain-the-same-elements)
    - [Java code to find Smallest and Largest Element in an Array :](#java-code-to-find-smallest-and-largest-element-in-an-array-)
    - [FindAllDuplicateNumbers](#findallduplicatenumbers)
    - [Java program to find minimum element in a sorted and rotated array :](#java-program-to-find-minimum-element-in-a-sorted-and-rotated-array-)
    - [Find second largest number in an array](#find-second-largest-number-in-an-array)
    - [Find the number occurring odd number of times in an array](#find-the-number-occurring-odd-number-of-times-in-an-array)
    - [Find a Pair Whose Sum is Closest to zero in Array](#find-a-pair-whose-sum-is-closest-to-zero-in-array)
    - [find sum of two pairs equals to given number in given arrays values.](#find-sum-of-two-pairs-equals-to-given-number-in-given-arrays-values)
    - [Find Common elements in two array using java8](#find-common-elements-in-two-array-using-java8)
    - [Find Different values in Two Arrays](#find-different-values-in-two-arrays)
    - [Separate 0s and 1s in an array](#separate-0s-and-1s-in-an-array)
    - [Find First repeating element in array](#find-first-repeating-element-in-array)
    - [Check if Array Elements are Consecutive](#check-if-array-elements-are-consecutive)
    - [Rotate an Array left and right by k position](#rotate-an-array-left-and-right-by-k-position)
    - [Find the common elements in multiple sorted arrays](#find-the-common-elements-in-multiple-sorted-arrays)
    - [Remove the given elements from the array and retrun new length of array](#remove-the-given-elements-from-the-array-and-retrun-new-length-of-array)
    - [Write a method that, given an array of strings, finds and returns the longest string in the array.](#write-a-method-that-given-an-array-of-strings-finds-and-returns-the-longest-string-in-the-array)
    - [Max Sub Array You](#max-sub-array-you)
  - [Linked-List](#linked-list)
    - [Linked List implementation](#linked-list-implementation)
    - [How do you reverse a linked list in Java?](#how-do-you-reverse-a-linked-list-in-java)
    - [Implement singly linked list in java](#implement-singly-linked-list-in-java)
    - [Reverse a linked list in java](#reverse-a-linked-list-in-java)
    - [Find the middle element of a linked list in java](#find-the-middle-element-of-a-linked-list-in-java)
    - [Find nth element from end of linked list](#find-nth-element-from-end-of-linked-list)
    - [How to check if linked list is palindrome in java](#how-to-check-if-linked-list-is-palindrome-in-java)
    - [Doubly Linked List in java](#doubly-linked-list-in-java)
    - [- https://java2blog.com/doubly-linked-list-java/](#--httpsjava2blogcomdoubly-linked-list-java)
  - [Stack](#stack)
    - [Implement a stack using array.](#implement-a-stack-using-array)
    - [implement a stack using Linked List.](#implement-a-stack-using-linked-list)
    - [Implement Stack using two Queues in java](#implement-stack-using-two-queues-in-java)
    - [Sort a Stack using another stack](#sort-a-stack-using-another-stack)
    - [- https://java2blog.com/sort-stack-using-another-stack/](#--httpsjava2blogcomsort-stack-using-another-stack)
  - [Queue](#queue)
    - [Queue implementation in java](#queue-implementation-in-java)
    - [Implement Queue using Linked List in java](#implement-queue-using-linked-list-in-java)
    - [write a program to implement queue using stack.](#write-a-program-to-implement-queue-using-stack)
    - [- https://www.geeksforgeeks.org/queue-using-stacks/](#--httpswwwgeeksforgeeksorgqueue-using-stacks)
  - [Recursion](#recursion)
    - [Write a Java program to print a Fibonacci sequence using recursion.](#write-a-java-program-to-print-a-fibonacci-sequence-using-recursion)
  - [Binary Seach](#binary-seach)
    - [How do you implement a binary search in Java?](#how-do-you-implement-a-binary-search-in-java)
  - [Misc](#misc)
    - [Check for balanced parentheses , { }](#check-for-balanced-parentheses---)
    - [How can you find the factorial of an integer in Java?](#how-can-you-find-the-factorial-of-an-integer-in-java)
    - [FizzBuzz](#fizzbuzz)

## String
###  How do you reverse a string in Java?
- Output: hello world
StringBuilder : dlrow olleh
```java
package com.jd.interviewprep.dsa.prob.array;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		System.out.println(str);
		// using string builder

		System.out.println("StringBuilder : " + stringBuilder(str));
		System.out.println("usingLoop : " + usingLoop(str));
		System.out.println("reverseString : " + reverseString(str));
		System.out.println("reverseCharArray : " + reverseCharArray(str));

	}

	public static String stringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversedStr = sb.toString();
		return reversedStr;
	}

	public static String usingLoop(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		String result = reversed.toString();
		return result;
	}

	// using recursion
	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);

	}

	public static String reverseCharArray(String str) {

		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length - 1;

		while (start < end) {
			// Swap characters at start and end indices
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			// Move the indices towards the center
			start++;
			end--;
		}

		return new String(chars);
	}
}

```

###  How do you check whether a string is a palindrome in Java?
- A palindrome string is the same string backwards or forwards
- Output: madam is a palindrome.

```java
package com.jd.interviewprep.dsa.prob.string;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam"; // Example string

		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}

		if (isPalindromeUsingStringBuilder(str)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}

	}

	public static Boolean isPalindrome(String input) {

		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;

	}

	public static Boolean isPalindromeUsingStringBuilder(String input) {
		String reversed = new StringBuilder(input).reverse().toString();
		boolean isPalindrome = input.equalsIgnoreCase(reversed); // prints 'true'
		return isPalindrome;

	}
}

```
### Write a java program to check if two Strings are anagram in java?
- Two string are anagrams if they have same characters but in different order. For example: Angel and Angle are anagrams
- String word = "java2blog";       String anagram = "aj2vabgol";
```java
package com.jd.interviewprep.dsa.prob.string;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {

		String word = "java2blog";
		String anagram = "aj2vabgol";

		System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingStringMethods(word, anagram));
		System.out.println("java2blog and aj2vabgol are anagrams using sort:" + isAnagramUsingArraySort(word, anagram));

	}

	public static boolean isAnagramUsingStringMethods(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the chacter from the
			// String
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else
				return false;
		}
		return anagram.isEmpty();
	}

	public static boolean isAnagramUsingArraySort(String word, String anagram) {

		if (word.length() != anagram.length()) {
			return false;
		}

		char[] charArray1 = word.toCharArray();
		char[] charArray2 = anagram.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}
}

```

### How to check if one String is rotation of another String in java?
- OutPut: java2blog and blogjava2 are rotation of each other : true
java2blog and avablog2j are rotation of each other : false

```java
package com.jd.interviewprep.dsa.prob;

public class StringRotation {
	 public static void main(String[] args) {
		 
	        System.out.println(
	                "java2blog and blogjava2 are rotation of each other : " + isRotation("java2blog", "blogjava2"));
	        System.out.println(
	                "java2blog and avablog2j are rotation of each other : " + isRotation("java2blog", "avablog2j"));
	 
	    }
	 
	    public static boolean isRotation(String str, String rotation) {
	        String str2 = str + str;
	 
	        if (str2.contains(rotation)) {
	            return true;
	        }
	        return false;
	 
	    }
}

```

### Find first non repeated character in String in java?
- One of the interview question is “How will you find first non repeating character in String.”
For example:
If input string is “analogy”,  then program should return ‘n’
If input string is “easiest”, then program should return ‘a’
- Algorithm:
Get character while looping over String
Put this character in LinkedHashMap with count. If character is already there, increase count by 1.
Get count from LinkedHashMap while iterating. If count is 1,return that character as LinkedHashMap maintains insertion order.

```java
package com.jd.interviewprep.dsa.prob;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetFirstNonRepeatingCharacter {
	public static void main(String[] args) {
		System.out
				.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
		System.out
				.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
	}

	public static Character getNonRepeatedCharacter(String str) {
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			if (!countCharacters.containsKey(c)) {
				countCharacters.put(c, 1);
			} else {
				countCharacters.put(c, countCharacters.get(c) + 1);
			}
		}
		// As LinkedHashMap maintains insertion order, first character with
		// count 1 should return first non repeated character
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;

	}
}

```
###  Find the longest substring without repeating characters
`
Given a string, write a Java program to find the length of the longest substring without repeating characters.

We can solve this puzzle using the sliding window approach. It uses two variables left and right to track the start and end index of the substring in the specified argument string. Initially, they can be 0 and 0.

A Set represents the current substring under test. Initially, the set can be empty.

We iterate through the string while expanding the right boundary of the substring. If the current character is already present in the set, it means we have a repeating character and we remove it from the left side of the sliding window and move the left boundary to the right. This process continues until there are no repeating characters in the current substring.

Finally, we return the size of the Set that represents the largest substring.
`

```java
package com.howtodoinjava.puzzles;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {

  public static void main(String[] args) {

    String input = "abcabcbb";
    int length = findLongestSubstringLength(input);

    System.out.println(length); //3
  }

  public static int findLongestSubstringLength(String str) {

    int maxLength = 0;
    int left = 0;
    int right = 0;
    Set<Character> slidingWindow = new HashSet<>();

    while (right < str.length()) {

      char currentChar = str.charAt(right);

      if (slidingWindow.contains(currentChar)) {
        slidingWindow.remove(str.charAt(left));
        left++;
      } else {
        slidingWindow.add(currentChar);
        maxLength = Math.max(maxLength, right - left + 1);
        right++;
      }
    }

    return maxLength;
  }
}
```

### How to check if String has all unique characters in java

```java
package com.jd.interviewprep.dsa.prob.string;

import java.util.HashSet;

public class StringAllUniqueCharMain {
	public static void main(String[] args) {

		System.out.println("java2blog has all unique chars : " + hasAllUniqueChars("java2blog"));
		System.out.println("Apple has all unique chars : " + hasAllUniqueChars("apple"));
		System.out.println("index has all unique chars : " + hasAllUniqueChars("index"));
		System.out.println("world has all unique chars : " + hasAllUniqueChars("world"));
	}

	public static boolean hasAllUniqueChars(String word) {

		HashSet alphaSet = new HashSet();

		for (int index = 0; index < word.length(); index++) {

			char c = word.charAt(index);

			// If Hashset's add method return false,that means it is already present in
			// HashSet
			if (!alphaSet.add(c))
				return false;
		}

		return true;
	}
}

```

### Java Program to find duplicate Characters in a String
```java
package com.jd.interviewprep.dsa.prob.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {
	public static void main(String[] args) {
		System.out.println(findDuplicatesUsingMaps("code decode")); // Time complexity = O(NLogn),
		System.out.println(findDuplicatesUsingStream("code decode")); // Time complexity = O(NLogn),
		System.out.println(findDuplicatesUsingStringStream("Jitendra birla")); // Time complexity = O(NLogn),
	}

	private static List<Character> findDuplicatesUsingStream(String name) {
		Map<Character, Long> collect = name.replaceAll("\\W", "").chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Character> collect2 = collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(e -> e.getKey()).collect(Collectors.toList());

		return collect2;
	}

	private static List<String> findDuplicatesUsingStringStream(String name) {
		String[] splitArr = name.replaceAll("\\W", "").split("");

		Map<String, Long> collect = Arrays.stream(splitArr)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		List<String> collect2 = collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey()).collect(Collectors.toList());

		return collect2;
	}

	private static Set<Character> findDuplicatesUsingMaps(String name) {

		Set<Character> duplicates = new LinkedHashSet<>();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		// code decode
		for (int i = 0; i < name.length(); i++) { // O(n)
			if (countMap.containsKey(name.charAt(i))) { // d
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1); // d, 3 , e ,3 // O(logn)
			} else {
				countMap.put(name.charAt(i), 1); // code d,3
			}
		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1)
				duplicates.add(entry.getKey());
		}
		return duplicates;
	}
}


```

### Find all substrings of a String in java
```java
package com.jd.interviewprep.dsa.prob.string;

public class SubstringsOfStringMain {
	public static void main(String args[]) {
		String str = "abbc";
		System.out.println("All substring of abbc are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));

			}
		}
	}
}

```
---
## Array Problems
### Java program to find missing number in an array

- int[] arr1={7,5,6,1,4,2};
Missing numner : 3

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {

		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("missingNumber number from array arr1: " + missingNumber(arr1));

		int[] arr2 = { 5, 3, 1, 2 };
		System.out.println("missingNumber number from array arr1: " + missingNumber(arr2));

	}

	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];
		}
		int missingNumber = sum - restSum;
		return missingNumber;
	}

}


```

### Rotate an array by K positions.
```
N=6 and k=2
If Arr[] = {1, 2, 3, 4, 5, 6} and k=2
then rotated array will be  {5, 6, 1, 2,  3,  4}
 ```
- Array rotation after 1 step
6 1 2 3 4 5 
- Array rotation after 2 step
5 6 1 2 3 4 

```java
package com.jd.interviewprep.dsa.prob;

public class RotateArrayByKPoition {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		rotateBruteForce(arr, 2);

	}

	public static int[] rotateBruteForce(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = nums.length - 1; j > 0; j--) {
				// move each number by 1 place
				int temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
			}
			System.out.println("Array rotation after " + (i + 1) + " step");
			printArray(nums);
			System.out.println();
		}
		return nums;
	}
	public static void printArray(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
```
### Write Java program that checks if two arrays contain the same elements.

```java
package com.jd.interviewprep.dsa.prob;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 2, 1 };
		Integer[] a2 = { 1, 2, 3 };
		Integer[] a3 = { 1, 2, 3, 4 };

		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));
	}

	static boolean sameElements(Object[] array1, Object[] array2) {
		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));

		// if size is different, means there will be a mismatch
		if (uniqueElements1.size() != uniqueElements2.size())
			return false;

		for (Object obj : uniqueElements1) {
			// element not present in both?
			if (!uniqueElements2.contains(obj))
				return false;
		}

		return true;
	}
}
```
### Java code to find Smallest and Largest Element in an Array :

```java
package com.jd.interviewprep.dsa.prob;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };

		// Using Stream
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(max + " " + min);
		System.out.println("-----------------------------");

		// array of 10 numbers
		int arr1[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };

		// assign first element of an array to largest and smallest
		int smallest = arr1[0];
		int largest = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > largest)
				largest = arr1[i];
			else if (arr1[i] < smallest)
				smallest = arr1[i];

		}
		System.out.println("Smallest Number is : " + smallest);
		System.out.println("Largest Number is : " + largest);

	}
}
```
### FindAllDuplicateNumbers

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateNumbers {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 2, 4, 3, 5, 6, 5, 7, 8, 8, 9 };

		// 1
		Map<Integer, Integer> map = new HashMap<>();

		Map<Integer, Long> collect = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Integer> collect2 = collect.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey())
				.collect(Collectors.toList());

		System.out.println(collect2);
	}
}

```

### Java program to find minimum element in a sorted and rotated array :
- Use Binary Seach Algo
```java
package com.jd.interviewprep.dsa.prob;

public class MinimumElementSortedAndRotatedArray {
	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		System.out.println(
				"Minimum element in the array : " + findMinimumElementRotatedSortedArray(arr, 0, arr.length - 1));
	}

	public static int findMinimumElementRotatedSortedArray(int[] arr, int low, int high) {
		int mid;
		while (low < high) {
			mid = low + ((high - low) / 2);

			if (arr[mid] > arr[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return arr[low];
	}

}

```

### Find second largest number in an array

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SecondLargestArray {
	
	public static void main(String[] args) {
        int[] arr1={7,5,6,1,4,2};
        
       System.out.println("Using Stream on Arrays : "+usingStream(arr1));
       System.out.println("Using Iterator on Arrays : "+findSecondLargestNumberInTheArray(arr1));

	}
	
	public static int usingStream(int arr[])
	{
		
		Integer integer = Arrays.stream(arr)
		.boxed()
		.sorted(Comparator.comparing(Integer::intValue).reversed())
		.limit(2)
		.skip(1)
		.findFirst()
		.get();
		
		return integer;
		
	}
	
	public static int findSecondLargestNumberInTheArray(int array[])
    {
        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
 
        // Loop over the array
        for (int i = 0; i < array.length; i++) { 
            // If current element is greater than highest 
            if (array[i] > highest) {
 
                // assign second highest element to highest element 
                secondHighest = highest;
 
                // highest element to current element
                highest = array[i];
            } else if (array[i] > secondHighest && array[i]!=highest)
                // Just replace the second highest
                secondHighest = array[i];
        }
 
        // After exiting the loop, secondHighest now represents the second
        // largest value in the array
        return secondHighest;
    }

}

```

### Find the number occurring odd number of times in an array

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddTimesElementInArray {
	public static void main(String[] args) {
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };

		System.out.println("getOddTimesElementHashing :" + getOddTimesElementHashing(array));
		System.out.println("Get odd time lelemt in array uding stream :" + getOddTimesElementUsingStream(array));

	}

	public static int getOddTimesElementHashing(int ar[]) {
		int i;

		HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
		for (i = 0; i < ar.length; i++) {
			int element = ar[i];
			if (elements.get(element) == null) {
				elements.put(element, 1);

			} else
				elements.put(element, elements.get(element) + 1);
		}
		for (Entry<Integer, Integer> entry : elements.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				return entry.getKey();
			}

		}
		return -1;
	}
	public static int getOddTimesElementUsingStream(int arr[]) {
		
         Integer key = Arrays.stream(arr)
         .boxed()
         .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
         .entrySet()
         .stream()
         .filter(e->e.getValue()%2!=0)
         .findFirst()
         .get()
         .getKey();
	
		return key;
	}
	
	
}

```

### Find a Pair Whose Sum is Closest to zero in Array

```java
package com.jd.interviewprep.dsa.prob.array;

public class FindPairWithMinSum {

	public static void main(String[] args) {
		int array[] = { 1, 30, -5, 70, -8, 20, -40, 60 };
		findPairWithMinSumBruteForce(array);
		findPairWithClosestToXBruteForce(array, 31);
	}

	public static void findPairWithMinSumBruteForce(int arr[]) {
		if (arr.length < 2)
			return;
		// Suppose 1st two element has minimum sum
		int minimumSum = arr[0] + arr[1];
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];
				if (Math.abs(tempSum) < Math.abs(minimumSum)) {
					pair1stIndex = i;
					pair2ndIndex = j;
					minimumSum = tempSum;
				}
			}
		}
		System.out.println(" The pair whose sum is closest to zero : " + arr[pair1stIndex] + " " + arr[pair2ndIndex]);
	}

	public static void findPairWithClosestToXBruteForce(int arr[], int X) {
		if (arr.length < 2)
			return;
		// Suppose 1st two element has minimum diff with X
		int minimumDiff = Math.abs(arr[0] + arr[1] - X);
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempDiff = Math.abs(arr[i] + arr[j] - X);

				if (tempDiff < minimumDiff) {
					pair1stIndex = i;
					pair2ndIndex = j;
					minimumDiff = tempDiff;
				}
			}
		}
		System.out.println(" The pair whose sum is closest to X using brute force method: " + arr[pair1stIndex] + " "
				+ arr[pair2ndIndex]);
	}

}


```

### find sum of two pairs equals to given number in given arrays values.
```java
package com.jd.interviewprep.dsa.prob.array;

public class FindPairWithTargetSum {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5 };
		int n = arr.length;
		int sum = 6;
		printPairs(arr, n, sum);
	}

	static void printPairs(int arr[], int n, int sum) {
		// int count = 0;

		// Consider all possible pairs
		// and check their sums
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] + arr[j] == sum)
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	}
}
```
```java
package com.howtodoinjava.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 18};
    int sum = 9;

    int[] result = twoSum(nums, sum);
    System.out.println(Arrays.toString(result));
  }

  private static int[] twoSum(int[] nums, int sum) {

    for (int i = 0; i < nums.length; i++) {
      int complement = sum - nums[i];
      int foundAtIndex = Arrays.binarySearch(nums, complement);

      if(foundAtIndex > 0) {
        return new int[] {nums[i], nums[foundAtIndex]};
      }
    }
    return null;
  }
}
```
### Find Common elements in two array using java8

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonValuesInJava8 {

	public static void main(String[] args) {
		int arr1[] = { 5, 7, 2, 8, 9 };
		int arr2[] = { 6, 10, 2, 8, 4 };

		System.out.println(" find comman value in two arrays :" + findCommonValues(arr1, arr2));
	}

	public static Set<Integer> findCommonValues(int arr1[], int arr2[]) {
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		set1.retainAll(set2);

		return set1;

	}
	public static List<Integer> findCommonValues(int[] array1, int[] array2) {
		return Arrays.stream(array1).boxed().distinct()
				.filter(Arrays.stream(array2).boxed().collect(Collectors.toList())::contains)
				.collect(Collectors.toList());
	}
}

```
### Find Different values in Two Arrays
```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDifferentValuesInTwoArrays {
	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 4, 5, 6, 7, 8,10,12 };

		Set<Integer> differentValues = 
				Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
				.filter(x -> !Arrays.asList(array1).contains(x) || !Arrays.asList(array2).contains(x))
				.collect(Collectors.toSet());

		System.out.println(differentValues);
	}
}

```

### Separate 0s and 1s in an array

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;

public class SeparateZerosOnesJava8 {
    public static void separateZerosOnes(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int[] separatedArray = Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> a.compareTo(b))
                .mapToInt(Integer::intValue)
                .toArray();
        printArray(separatedArray);
        System.arraycopy(separatedArray, 0, array, 0, array.length);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] separate0s1sSolution1(int arr[])
	 {
	  int count=0;
	  for (int i = 0; i < arr.length; i++) {
	   if(arr[i]==0)
	   {
	    count++;
	   }
	  }
	  for (int i = 0; i < count; i++) {
	   arr[i]=0;
	  }
	  for (int i = count; i < arr.length; i++) {
	   arr[i]=1;
	  }
	  return arr;
	 }
    
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1};

        System.out.println("Original array:");
        printArray(array);

        separateZerosOnes(array);

        System.out.println("Array after separating 0s and 1s:");
        printArray(array);
        
        
        separate0s1sSolution1(array);

        System.out.println("separate0s1sSolution1 Array after separating 0s and 1s:");
        printArray(array);
        
    }
}

```
### Find First repeating element in array
```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindFirstRepeatingElementInArray {
public static void main(String[] args) {
	Integer[] array = {1, 2, 3, 4, 2, 5};

    Set<Integer> set = new HashSet<>();
    Optional<Integer> firstRepeatingElement = Arrays.stream(array)
            .filter(x -> !set.add(x))
            .findFirst();

    if (firstRepeatingElement.isPresent()) {
        System.out.println(firstRepeatingElement.get());
    } else {
        System.out.println("No repeating element found");
    }
}
}

```
### Check if Array Elements are Consecutive

```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;

public class ConsecutiveElementsInArray {
public static void main(String[] args) {
	int[] array = {5, 3, 4, 1, 2};

    int min = Arrays.stream(array).min().getAsInt();
    int max = Arrays.stream(array).max().getAsInt();

    if (max - min == array.length - 1) {
        System.out.println("The elements are consecutive");
    } else {
        System.out.println("The elements are not consecutive");
    }
}
}

```
### Rotate an Array left and right by k position
```java
package com.jd.interviewprep.dsa.prob.array;

public class RotateAnArrayByKPosition {
	public static void main(String[] args) {
		int Array[] = { 1, 2, 3, 4, 5 };

		int K = 2;
		rightRotateBruteForce(Array, K);
		leftRotateBruteForce(Array, K);

	}

	public static int[] rightRotateBruteForce(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = nums.length - 1; j > 0; j--) {
				// move each number by 1 place
				int temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
			}
			System.out.println("Array rotation after " + (i + 1) + " step");
			printArray(nums);
			System.out.println();
		}
		return nums;
	}
	public static int[] leftRotateBruteForce(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = 0 ; j <nums.length -1; j++) {
				// move each number by 1 place
				int temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
			System.out.println("Array rotation after " + (i + 1) + " step");
			printArray(nums);
			System.out.println();
		}
		return nums;
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
```
### Find the common elements in multiple sorted arrays
`Given multiple sorted arrays, find the common elements present in all the arrays.

The above puzzle can be solved using different techniques. For example, we can iterate over elements from the first array and check each element in the remaining arrays. If the element is present in all other arrays, we add it to the list of common elements. However, this approach requires a lot of iterations and is not a suitable solution.

Another solution is to find the common elements between two arrays incrementally, and then check the common elements in the third array, and so on.`

```java
package com.howtodoinjava.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArrays {

  public static void main(String[] args) {

    Integer[][] arrays = {
        {1, 2, 3, 4, 5},
        {2, 4, 6, 8},
        {2, 3, 4, 7},
        {4, 5, 8, 9}
    };

    List<Integer> commonElements = findCommonElements(arrays);
    System.out.println("Common elements in the arrays: " + commonElements);
  }

  public static List<Integer> findCommonElements(Integer[][] arrays) {
    if (arrays == null || arrays.length == 0) {
      return List.of(); //empty arguments
    }

    List<Integer> commonElements = Arrays.asList(arrays[0]);

    for (int i = 1; i < arrays.length; i++) {
      List<Integer> temp = new ArrayList<>();
      for (int num : arrays[i]) {
        if (commonElements.contains(num)) {
          temp.add(num);
        }
      }
      commonElements = temp;
    }
    return commonElements;
  }
}
```

### Remove the given elements from the array and retrun new length of array
```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3, 4, 5, 2, 6 };
		int val = 2;

		int[] result = Arrays.stream(nums).filter(num -> num != val).toArray();

		System.out.println(result.length);
	}
}

```

### Write a method that, given an array of strings, finds and returns the longest string in the array. 
```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestStringFinder {
	public static String findLongestString(String[] strings) {
		if (strings == null || strings.length == 0) {
			return null; // or throw an exception, depending on your requirements
		}

		// Use Arrays.stream to create a stream of strings, find the max based on length
		// Optional<String> result = Arrays.stream(strings).max((s1, s2) ->
		// Integer.compare(s1.length(), s2.length()));
		Optional<String> result = Arrays.stream(strings).sorted(Comparator.comparing(String::length).reversed())
				.findFirst();

		// Return the result or a default value if the array is empty
		return result.orElse(null);
	}

	public static void main(String[] args) {
		String[] strings = { "apple", "banana", "orange", "grapefruit", "kiwi", "pear" };

		System.out.println("Original array: " + Arrays.toString(strings));

		String longestString = findLongestString(strings);

		System.out.println("Longest string: " + longestString);
	}
}

```

### Max Sub Array You
- have been asked to create a method in Java, maxSubarray, that finds the contiguous subarray (containing at least one number) which has the largest sum and returns its sum.
```java
package com.jd.interviewprep.dsa.prob.array;

import java.util.Arrays;

public class MaxSubArray {
	public static int maxSubarray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] inputCase1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result1 = maxSubarray(inputCase1);
		System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);

	}
}

```
---
## Linked-List

### Linked List implementation
```java
package com.jd.interviewprep.dsa.impl.ds.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public static void main(String[] args) {
       /*  New list test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();*/
       /*
        // Append method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        */

        /*
         // RemoveLast method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
         */

        /*
        // prepend method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.prepend(5);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        */

        /*
         // RemoveFirst method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(5);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.removeFirst();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
         */

        /*
        // get method test
        LinkedList myLinkedList = new LinkedList(1);
        System.out.println(myLinkedList.get(0));
         */

        /*
        // set method test
        LinkedList myLinkedList = new LinkedList(1);
        System.out.println(myLinkedList.set(1, 5));
        myLinkedList.printList();
         */

        /*
        //insert Method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(5);
        myLinkedList.append(8);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.insert(1,10);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
         */

        /*
          // remove method test
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(5);
        myLinkedList.append(8);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.remove(1);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
         */


        //Test reverse method
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.reverse();
        myLinkedList.printList();

    }


}

```

### How do you reverse a linked list in Java?
```java
package com.jd.interviewprep.dsa.prob;

import java.util.LinkedList;

public class LinkedListReverse {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<>();

	ll.add(1);
	ll.add(2);
	ll.add(3);

	System.out.println(ll);

	LinkedList<Integer> ll1 = new LinkedList<>();

	ll.descendingIterator().forEachRemaining(ll1::add);

	System.out.println(ll1);
}
}

```
### Implement singly linked list in java
- https://java2blog.com/implement-singly-linked-list-in-java/

### Reverse a linked list in java
- https://java2blog.com/how-to-reverse-linked-list-in-java/

### Find the middle element of a linked list in java
- https://java2blog.com/find-middle-element-of-linkedlist-in/

### Find nth element from end of linked list
- https://java2blog.com/find-nth-element-from-end-of-linked-list/

### How to check if linked list is palindrome in java
- https://www.java2blog.com/how-to-check-if-linked-list-is/
### Doubly Linked List in java
- https://java2blog.com/doubly-linked-list-java/
---
## Stack
###  Implement a stack using array.
- https://java2blog.com/implement-stack-using-array-in-java/
### implement a stack using Linked List.
- https://java2blog.com/implement-stack-using-linked-list-in-java/
### Implement Stack using two Queues in java
- https://java2blog.com/implement-stack-using-two-queues-in-java/
### Sort a Stack using another stack
- https://java2blog.com/sort-stack-using-another-stack/
---
## Queue
### Queue implementation in java
- https://java2blog.com/implement-queue-using-array-in-java/
### Implement Queue using Linked List in java
- https://java2blog.com/implement-queue-using-linked-list-in-java/
### write a program to implement queue using stack.
- https://www.geeksforgeeks.org/queue-using-stacks/
---
## Recursion
### Write a Java program to print a Fibonacci sequence using recursion.
- output : Fibonacci Sequence of 10 numbers:
0 1 1 2 3 5 8 13 21 34
```java
package com.jd.interviewprep.dsa.prob;

public class FabonacciNumber {

	public static void main(String[] args) {
		System.out.println("using Array : ");
		usingArray(10);
		System.out.println("using Loop : ");
		usingLoop(10);
		System.out.println("using Recursion : ");
		usingRecursion(10);
	}

	/**
	 * @param num
	 */
	/**
	 * @param num
	 */
	public static void usingArray(int num) {
		int count = num; // Number of Fibonacci numbers to generate

		System.out.println("Fibonacci Sequence of " + count + " numbers:");

		int[] fibonacciNumbers = new int[count];
		fibonacciNumbers[0] = 0; // First Fibonacci number
		fibonacciNumbers[1] = 1; // Second Fibonacci number

		// Generate Fibonacci sequence
		for (int i = 2; i < count; i++) {
			fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
		}

		// Print Fibonacci sequence
		for (int number : fibonacciNumbers) {
			System.out.print(number + " ");
		}
	}

	public static void usingLoop(int n) {
		int firstTerm = 0, secondTerm = 1;
		System.out.print("Fibonacci Series of " + n + " terms:\n");

		for (int i = 1; i <= n; i++) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	public static void usingRecursion(int count) {

		System.out.println("Fibonacci Sequence of " + count + " numbers:");

		// Generate and print Fibonacci sequence
		for (int i = 0; i < count; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}

```
---
## Binary Seach
### How do you implement a binary search in Java?
- If the key is less than the middle element, then you now need to search only in the first half of the array.
- If the key is greater than the middle element, then you need to search only in the second half of the array.
- If the key is equal to the middle element in the array, then the search ends.
- Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.
```java
package com.jd.interviewprep.dsa.prob;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
	}
	
    public static int binarySearch(int[] arr, int target) {
		int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    
	}
}

```

---
## Misc
### Check for balanced parentheses , { }
```java
package com.jd.interviewprep.dsa.prob;

import java.util.Stack;

public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr)
	{
		// Using ArrayDeque is faster than using Stack class
//		Deque<Character> stack
//			= new ArrayDeque<Character>();
		 Stack stack = new Stack();   
		 
		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = (char) stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = (char) stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = (char) stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	// Driver code
	public static void main(String[] args)
	{
	//	String expr = "([{}])";
		String expr = "([{})]";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}

```

### How can you find the factorial of an integer in Java?
- OutPut: Factorial of 5 is: 120

```java
package com.jd.interviewprep.dsa.prob;

public class Factorial {
	public static void main(String[] args) {
		int number = 5; // Example number

		long factorial = calculateFactorialIterative(number);

		System.out.println("Factorial of " + number + " is: " + factorial);
		 factorial = calculateFactorialRecursive(number);

		System.out.println("Factorial of " + number + " is: " + factorial);
	}

	public static long calculateFactorialIterative(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static long calculateFactorialRecursive(int number) {
		if (number <= 1) {
			return 1;
		} else {
			return number * calculateFactorialRecursive(number - 1);
		}
	}
}

```
### FizzBuzz
`if number is divisible by 5.
 	if number is divisible by 7 the print FizzBuzz.
 	else print Fizz.
if number is divisible by 7 the print Buzz.
	else print the number.
`
```java
IntStream.rangeClosed(1, 100)
  .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
  .forEach(System.out::println);
```
### BinaryOperationProblem
- Given a number N and two reduction operations, count the number of operations required to reduce N to 0.
You are given a string S of length N which encodes a non-negative number V in a binary form. Two types of operations may be performed on it to modify its value:
```java
package com.jd.interviewprep.dsa.prob;

public class BinaryOperationProblem {

	public static void main(String[] args) {
		int solution = solution("0000011100");
		System.out.println(solution);
	}

	public static int solution(String S) {
		// convert the binary string to a long value
		long numberLong = Long.parseLong(S, 2);
		System.out.println(numberLong);
		// initialize the number of operations to zero
		int count = 0;
		// loop until V becomes zero
		while (numberLong > 0) {
			// if V is odd, subtract 1 from it
			if (numberLong % 2 == 1) {
				numberLong--;
			}
			// else if V is even, divide it by 2
			else {
				numberLong /= 2;
			}
			// increment the number of operations
			count++;
		}
		// return the number of operations
		return count;
	}
}
```



