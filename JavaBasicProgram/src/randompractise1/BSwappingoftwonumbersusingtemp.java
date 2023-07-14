package randompractise1;

public class BSwappingoftwonumbersusingtemp {

	public static void main(String[] args) {
		// Swap two numbers using temporary variables

		int a = 10;
		int b = 20;

		int temp;

		System.out.println("value of a :" + a);
		System.out.println("value of b :" +b);

		temp=a; //temp = 10
		a=b;//a=20
		b= temp;// b= 10 
		System.out.println("value of a :" + a);
		System.out.println("value of b :" +b);

		
	}

}
