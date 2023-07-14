package array;

import java.util.Arrays;

public class Practisearray11 {
//
	public static void main(String[] args) {
		int[] a = { 3, 5, 3, 5 };
		System.out.println("printing using for each");
		for (int c : a) {
			System.out.print(c + " ");
		}

		int[] b = { 3, 5, 3, 5 };
		int sum = 0, average;
		System.out.println("\ncalculating sum and average");

		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
		System.out.println(sum);
		average = sum / b.length;
		System.out.println("average :" + average);

		System.out.println("\nmaking clone using copyof method");
		int copyofa[] = Arrays.copyOf(a, a.length);
		for (int c : copyofa) {
			System.out.print(c + " ");
		}
		System.out.println("\n Comparing a and copy of a :" + Arrays.equals(copyofa, a));

		System.out.println("\nprinting in reverse");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
