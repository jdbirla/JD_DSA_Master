package com.jd.log2.Array;

public class ArrayPractice {

	private static int search(int[] arr, int size, int key) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == key)
				return i;
		}

		return -1;
	}

	private static int[] remove(int[] arr, int n) {
		
		int[] arrcopy = new int[arr.length-1];
		 if(n<2 || arr ==null) { return arr; }
		 
		int index = 0;
		if(n%2==0)
		{
			index = (n-1)/2;
		}else {
			 index = n/2;

		}
		for(int i = 0 ,  k = 0; i<n ;i++)
		{
			if(index == i)
				continue;
			arrcopy[k++] = arr[i];
		}
		return arrcopy;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
				arr[0] = 12;
				arr[1] = 45;
				arr[2] = 76;
				arr[3] = 3;
				arr[4] = 88;
		int search = search(arr, 5, 80);
		//System.out.println(search);
		
		int[] remove = remove(arr, 5);
		
		for(int i : remove)
		{
			System.out.println(i);
		}
	}
}
