package array;

public class Practisearray4 {

	public static void main(String[] args) {

		// sum and average of array elements
		int a[] = { 2, 5, 6, 3 };
		int sum = 0;
		int average;
        int number = a.length;
		System.out.println("no. of elements : "+a.length);

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum : "+sum);
		
		average = sum/number;
		System.out.println("average : "+average);
		
	} 
}
