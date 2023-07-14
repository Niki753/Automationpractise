package array;

public class Practicemultidimarray1 {

	public static void main(String[] args) {

		int a[][] = new int[2][2]; // making array
		System.out.println(a.length);// 3
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // making array
		System.out.println("\n no. of rows :" + b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		System.out.println(b[2].length);

		for (int i = 0; i < b.length; i++) { // 0 //1 //2
			for (int j = 0; j < b[i].length; j++) {// 0-1 2 //0 1 2//0 1 2
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}
}

/*
 * for (int i = 0; i < a.length; i++) { //0 for (int j = 0; j < a[i].length;
 * j++) { //0 System.out.print(a[i][j] + " "); } System.out.println(); }
 */
