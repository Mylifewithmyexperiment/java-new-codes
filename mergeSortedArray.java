package test;

import java.util.*;

public class mergeSortedArray {

	public static void main(String[] args) {
		JavaBasicPrograms l = new JavaBasicPrograms();
		// int ks = l.ss;
		 
		int arr1[] = { 4, 5, 2, 1 };
		int arr2[] = { 5, 8, 9, 2 };
		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];

		}
		int k = arr1.length;
		do {

			for (int j = 0; j < arr2.length; j++) {
				arr3[k] = arr2[j];
				k++;
			}

		} while (k < (arr1.length + arr2.length));

		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
/*
 * the approach is to put the elements of two sorted array inside an array and
 * then sort it
 * 
 * logic reqiured only in merging two arrray in an array.
 * 
 * 
 * 
 * 
 */
