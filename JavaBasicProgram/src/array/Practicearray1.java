package array;

public class Practicearray1 {

	public static void main(String[] args) {

		int[] ar = new int[5];
		ar[0] = 1;
		ar[1] = 1;
		ar[2] = 1;
		ar[3] = 1;
		ar[4] = 8;
		System.out.println("using for loop");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println("\nnew array a1");
		int[] ar1 = { 5, 4, 3, 8, 9 };
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

		System.out.println("\nusing for each loop");
		int[] ar2 = { 5, 9, 8, 6, 4, 6, 5, 8 };
		for (int j : ar2) {
			System.out.print(j + " ");
		}
		System.out.println("\nmaking one more array ar3 its char array");
		char[] ar3 = { 'a', 'l', 'e', 'r' };
		for (char k : ar3) {
			System.out.print(k + " ");
		}

		System.out.println("\nprinting using for loop");
		for (int i = 0; i < ar3.length; i++) {
			System.out.print(ar3[i] + " ");
		}
	}

}
