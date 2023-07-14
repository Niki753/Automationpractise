package day2.basics;

public class Sample3 {

	public static void main(String[] args) {
		int a= 10,b= 20;
		boolean c, d;
		c = a==b;
		d= a<b;
		System.out.println( "c = " +c );
		System.out.println( "d = " +d );
		System.out.println( "Logical AND = " +( c && d) ) ; //f
		System.out.println( "Logical OR = " +( c || d) ); //t
		System.out.println( "Logical Not = " + !( c || d) );//f
	}

}
