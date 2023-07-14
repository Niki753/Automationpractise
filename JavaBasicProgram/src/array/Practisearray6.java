package array;

import java.util.Arrays;

public class Practisearray6 {

	public static void main(String[] args) {

		int array1[] = { 1, 5, 6, 8, 5, 9, 8, 7, 5, 2, 6, 5 };
		System.out.println("array1 elements");
		
		for (int a1 : array1) {
			System.out.print(a1 + " ");
		}int copiedarray1[]= array1.clone();
		System.out.println("\ncopiedarray elements");
		for(int z:copiedarray1) {
			System.out.print(z+ " ");
		}

		System.out.println("\ncomparing array1 and copiedarray1");
		
		System.out.println(Arrays.equals(array1, copiedarray1));
		
		
		System.out.println("\nLength of array1 : " + array1.length);

		System.out.println("\nLength of copiedarray1 : " + copiedarray1.length);

		System.out.println("\n making another array ie array2 using arrays.copyof");
		int array2[] = Arrays.copyOf(array1, 3);
		for (int a : array2) {
			System.out.print(a + " ");
		}
		System.out.println("\nLength of array2 : " + array2.length);

		int array3[] = Arrays.copyOfRange(array1, 0, 5);
		System.out.println("array3 elemenets are below ");
		for (int b : array3) {
			System.out.print(b + " ");
		}
		System.out.println("\nsoritng the array3 in ascending order ");
		Arrays.sort(array3);
		for (int c : array3) {
			System.out.print(c+ " ");
		}
	}

}
