package GoodPractice;

public class UrinaryOperators {

	public static void main(String[] args) {

		int a = 50;
		int b = a;
		System.out.println("a: " + a);//a= 50
		System.out.println("b: " + b);//b= 50
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = ++a;// a=a+1=51//k= 51
		System.out.println("k: " + k);//k = 51
		System.out.println("a: " + a);//a = 51
		
		int j = k++;// 
		System.out.println("k: " + k);//k= 52
		System.out.println("j: " + j);//j= 51

		int r = -9;
		System.out.println("r=: " + r++);//r = -9 
		System.out.println("r=: " + r);//r = -8  
		
		System.out.println("r=: " + ++r);// -7
		System.out.println("r=: " + r);// -7
		
		int x = -9;
		System.out.println("x=: " + --x);// -10
		System.out.println("x=: " + x);//   -10
		System.out.println("x=: " + x--);// -10
		System.out.println("x=: " + x);//   -11

	}


	}


