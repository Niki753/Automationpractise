package array;

public class Practisearray13 {

	public static void main(String[] args) {
		// largest element in java
		int[] a = { 70, 80, 55, 100 };
		int max;
		max = a[0];// max= 70
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) // 100>70
			{
				max = a[i];// max=100
			}
		}
		System.out.println(max);
//smallest element in java
		int[] b = { 55, 8, 7, 99, 8, 44 };
		int min;
		min = a[0];

		for (int i = 1; i < b.length; i++) {
			if (b[i] < min) {
				min = b[i];
			}

		}
		System.out.println(min);

	}

}
