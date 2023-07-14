package array;

public class Practisearray12 {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8 };
		int max;
		max = a[0];// max= 2
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) // 4>2//6>4   //8>4
				max = a[i]; //max=4//max=6//max=8
		}
		System.out.println(max);

	}

}
