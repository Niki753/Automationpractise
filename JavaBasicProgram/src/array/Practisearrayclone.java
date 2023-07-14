package array;

import java.util.Arrays;

public class Practisearrayclone {
//cloning of arrays
	public static void main(String[] args) {

		int[] a1 = { 5, 6, 7, 8, 9 };
		int[] copyofa1 = Arrays.copyOf(a1, a1.length);
		System.out.println("using predefined method copyof");
		System.out.println(Arrays.equals(a1, copyofa1));
		boolean result1 = Arrays.equals(copyofa1, a1);
		System.out.println(result1);

		System.out.println("using clone method to copy elements from an array");
		int[] a = { 7, 75, 5, 58, 8 };
		int[] copyofa = a.clone();
		System.out.println(Arrays.equals(copyofa, a));
		boolean result = Arrays.equals(copyofa, a);
		System.out.println(result);

		System.out.println("clone without any method");

		char[] og = { 'a', 'c', 'w' };
		char[] dup = new char[og.length];

		for (int i = 0; i < dup.length; i++) {
			dup[i] = og[i];
		}
		System.out.println("using for each loop");
		for (char z : dup) {
			System.out.println(z);
		}

		System.out.println("using for  loop");

		for (int i = 0; i < dup.length; i++) {
			System.out.println(dup[i]);
		}

	}
}
