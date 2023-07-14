package methodcallingconcept;

public class Methodcalling2 {
	static int Display() { //
		int num1 = 20;
		int num2 = 30;
        int num3 = num1+num2;
        		
		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		
		return num3;
	}

	static int Display1(int a, int b) {
		int c = a + b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

       return c;
	}
	public static void main(String[] args) {
		Display();//method calling - Only body print and no return value
		System.out.println("****using class name*****");
		Methodcalling2.Display();
		System.out.println("******body print and see return value****");
		System.out.println(Display());
		System.out.println("******** print method body and storing return value for future use*********");
		int ab= Display(); 
		System.out.println("value of ab : " +ab);
		int abc= ab+100;
		System.out.println("value of abc : " +abc);
        System.out.println("*******************************");
		Display1(1,2);
		System.out.println("******body print and see return value****");
		System.out.println(Display1(4,8));
		System.out.println("******** print method body and storing return value for future use*********");

		int cd = Display1(8,6);
		System.out.println("value of cd : " +cd);
		int cde = cd+100;
		System.out.println("value of cd : " +cde);
		
		
	}

}
