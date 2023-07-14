package array;

public class array1 {

	public static void main(String[] args) {
//      int a= 1, b=2,c=3,d;//purana method
		int num[] = new int[3];// declaration and initialization
		num[0] = 10; // giving value to variable or else they will get default value
		 num[1]=20;
		 num[2]=35;
		System.out.println(num[0]);// printing
		System.out.println(num[1]);
		// System.out.println(num[5]);
		System.out.println("****************");

		boolean[] status = { true, false, false, true };
		for (int i = 0; i < status.length; i++) {
			System.out.println(status[i]);
		}
		for (int n:num)
		{
			System.out.println(n);
		}
		for(boolean n:status)
		{
			System.out.println(n);
		}
	}
}

/*
 * int []num1= {1,2,3}; //another method array dec and initialization //int
 * count = num1.length;
 * 
 * for (int i =0; i<num1.length; i++);{
 * 
 * System.out.println(num1[i]);
 */