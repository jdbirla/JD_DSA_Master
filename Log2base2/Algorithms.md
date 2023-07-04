# Algorithms
## Linear Serach 

```java
package com.jd.interviewprep.dsa.alog;

public class LinearSearch {
	public static void main(String[] args) {

		int arr[] = { 86, 91, 34, 50, 0 };
		int key = 50;

		LinearSearch obj = new LinearSearch();

		System.out.println("Searching Element: " + key);

		if (obj.linearSearch(arr, arr.length, key) == 1)
			System.out.println("Search Found");
		else
			System.out.println("Search Not Found");
	}

	public int linearSearch(int arr[], int size, int key) {
		int i;

		for (i = 0; i < size; i++)
			if (arr[i] == key)
				return 1;

		return 0;
	}

}

```
## Binary Search Algo
- Search in sorted order
```java
package com.jd.interviewprep.dsa.alog;

public class BinarySearch {
	public int binarySearch(int arr[], int start, int end, int key) {
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key)
				return 1;

			if (key > arr[mid] )
				start = mid + 1;
			else
				end = mid - 1;
		}

		return 0;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 23, 45, 70, 90, 100, 111, 123 };
		int key = 45;

		BinarySearch obj = new BinarySearch();

		System.out.println("Searching Element: " + key);

		if (obj.binarySearch(arr, 0, arr.length - 1, key) == 1)
			System.out.println("Search Found");
		else
			System.out.println("Search Not Found");

		key = 150;

		System.out.println("Searching Element: " + key);

		if (obj.binarySearch(arr, 0, arr.length - 1, key) == 1)
			System.out.println("Search Found");
		else
			System.out.println("Search Not Found");
	}

}

```

## Binary Search Using Divide and Conquer Strategy
```java
package com.jd.interviewprep.dsa.alog;

public class DivideAndConquerBinarySearch {
	int BinarySearch(int arr[], int start, int end, int key) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key)
				return 1;
			if (arr[mid] < key)
				return BinarySearch(arr, mid + 1, end, key);
			else
				return BinarySearch(arr, start, mid - 1, key);
		} else
			return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 23, 45, 70, 90, 100, 111, 123 };
		int key = 45;
		DivideAndConquerBinarySearch obj = new DivideAndConquerBinarySearch();
		if (obj.BinarySearch(arr, 0, arr.length - 1, key) == 1)
			System.out.println("45 - Search Found");
		else
			System.out.println("45 - Search Not Found");
	}
}

```
