package day2.basics;

public class Sample4 {

	public static void main(String[] args) {
		int num1 = 5,num2= 55;	
		
		System.out.println( "num1 = " +num1);
		System.out.println( "num2 = " +num2);
		boolean res1, res2;
		res1 = (num1 == num2);
		res2 = (num1!=  num2);
		System.out.println( "(num1 is equal to  num2) = " +res1);//f
		System.out.println( "(num1 is not equal to  num2) = " +res2); //t
		res1 = (num1 > num2);
		res2 = (num1 <  num2);
		System.out.println( "(num1 is greater than num2) = " +res1);//f
		System.out.println( "(num1 is samller than num2) = " +res2); //t
		res1 = (num1 >= num2);
		res2 = (num1 <=  num2);
		System.out.println( "(num1 is greater than or equal to num2) = " +res1);//f
		System.out.println( "(num1 is less than or equal to num2) = " +res2);//t
		res2 = (num1 !=  num2);
		System.out.println( "(num1 is not equal to  num2 = " +res2);//t
	}

}
