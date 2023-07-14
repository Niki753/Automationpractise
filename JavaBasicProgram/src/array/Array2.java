package array;

public class Array2 {

	public static void main(String[] args) {

		int[] a = new int[3];// declaraing array 1st synatx
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a.length);
		System.out.println("*********");
		// int b = a.length;
		int id = 3;
		for (int i = 0; i < a.length; i++) {
			//a[0] = 3;
			//a[1] = 40;
			//a[2] = 50;
			System.out.println(a[i]);
			id++;
		}
		System.out.println("***2nd syntax******");
		boolean[] b = { true, false, true };// declaring array 2nd syntax
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b.length);
		System.out.println("***************");
		for (int i = 0; i < b.length; i++) {
		
			System.out.println(b[i]);
			
		}
		System.out.println("*********using for each loop ****");
	   for (int z:a)
	   {
		   System.out.println(z);
	   }
		System.out.println("*********using for each loop ****");

	   for (boolean x:b)
	   {
		   System.out.println(x);
	   }
 	}   

}

/*
 * int a1 =1,b1=2,c1=3; System.out.print(a1); System.out.print(b1);
 * System.out.print(c1);
 */