package array;

import java.util.Arrays;

public class AssignArray1 {

	public static void main(String[] args) {
		int[] copyfrom = { 10, 20, 30, 40, 50, 60 };
		System.out.println(" The Length of copy from array is " + copyfrom.length);
		System.out.println("****11th To print all elements from array*** \n");
		for (int i = 0; i < copyfrom.length; i++) {
			System.out.print(copyfrom[i] + " ");
		}
		System.out.println("\n 1st To copy all elements from one array into another  **");
		int[] copyTo = Arrays.copyOf(copyfrom, 4);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.print(copyTo[i] + " ");
		}
		
		
		System.out.println("\n**12th java program to print the sum of all elements in an array");
		int sum = 0;
		int[] num = { 1, 2, 3, 4 };
		for (int j : num) {
			System.out.print(j + " ");
			sum = sum + j;
		}
		System.out.println("\nthe sum is " + sum);
	}
}
