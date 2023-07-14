package day5.basics;

public class swap1 {

	public static void main(String[] args) {
		int a= 20, b= 40;
		System.out.println( "Value of a = " +a); 
		System.out.println( "Value of b = " +b); 
		
/*int temp = b;
		b=a;
		System.out.println( "Value of a = " +temp);
		System.out.println( "Value of b = " +a); 
		
		int temp1= a;
		a=b;
		b=temp1;
		System.out.println( "Value of a = " +b);
		System.out.println( "Value of b = " +a); 
	*/
		
		int temp2= a;
		a=b;
		b= temp2;
		System.out.println( "Value of a = "+b);
		System.out.println( "Value of b = "+a);
		
	}

}
