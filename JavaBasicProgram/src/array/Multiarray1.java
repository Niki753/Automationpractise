package array;

public class Multiarray1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println(arr.length);
		/*
		 * System.out.println(arr[0].length); System.out.println(arr[1].length);
		 * System.out.println(arr[2].length);
		 */
		System.out.println("***********************");
		for (int i = 0; i < arr.length; i++) {// 012

			for (int j = 0; j < arr[i].length; j++) {// 0 1 2 01212
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("*************************");

		int [][] c1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(c1.length);
		System.out.println("***************************8");
		for (int i = 0; i < c1.length; i++) {
			for(int j=0;j<c1[i].length;j++) {
				System.out.print( c1[i][j]+  " " );
				
			}
        System.out.println();
		}

	}
}
