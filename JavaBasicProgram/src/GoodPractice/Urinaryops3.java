package GoodPractice;

public class Urinaryops3 {

	public static void main(String[] args) {
		int a = -95, b;
		b = a++;//b = -95 //---->a= -94
		int x = a, y;//x = -94
		System.out.println(x);// -94
		y = ++x;// y = -93 , x= -93
		System.out.println(a);// a =-94
		System.out.println(b);// b=-95
		System.out.println(x);// x = -93
		System.out.println(y);// y =-93

		int p = 15, q = 30, res;

		res = p++ + --q;// res = 15+29=44
		System.out.println("res: " + res);// res = 44
		System.out.println("p: " + p);// p = 16
		System.out.println("q: " + q);//q = 29
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 = 17+30= 
		System.out.println(res1);// res = 47
		System.out.println("p: " + p);//p = 17
		System.out.println("q: " + q);// q = 30

	}

}
