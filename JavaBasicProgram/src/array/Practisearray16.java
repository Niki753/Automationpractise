package array;

public class Practisearray16 {

	public static void main(String[] args) {

		// printing elements on even position
		int a[] = { 5, 6, 7, 8, 5, 4, 8, 5 };// 6 ,8,4,5, //index 1 3 5 7

		System.out.println("Elements on even position : ");

		for (int i = 1; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.print(a[i] + " ");

			}
		}
		int a1[] = { 5, 6, 7, 8, 5, 4, 8, 5 };// 5,7,5,8 //index 0 2 4 6 8
		System.out.println("\nElements on odd position :");

		for (int i = 0; i < a1.length; i++) {
			if (i % 2 == 0) {
				System.out.print(a1[i] + " ");

			}
		}

	}

}
