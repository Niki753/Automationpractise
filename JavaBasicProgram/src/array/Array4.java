package array;

public class Array4 {

	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("*********");
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;
		a[3] = 500;
		a[4] = 56;
		/*
		 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
		 * System.out.println(a[3]); System.out.println(a[4]);
		 */
		int id = 501;

		System.out.println(a.length);
		System.out.println("***using for loop*********");
		for (int i = 0; i < a.length; i++) {
			// a[i]=id;
			System.out.println(+i + " element  =" + id);
			id++;
		}
		System.out.println("****using for each loop****");
		for (int x : a) {
			System.out.println(x);
		}
		System.out.println("*******another syntax to declare array and using for *********");
		boolean abc[] = new boolean[] { true, false, true };
		for (int i = 0; i < abc.length; i++) {

			System.out.println(abc[i]);
		}
		System.out.println("********using for each***********");
		for (boolean xyz : abc) {
			System.out.println(xyz);
		}

	}

}
