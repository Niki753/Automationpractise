package methodcallingconcept;

public class Methodcalling1 {

	static void Display() { //void return type
		int num1 = 20;
		int num2 = 30;

		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
	}

	static void Display1(int a, int b) {
		int c = a + b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

	public static void main(String[] args) {
		Display();
		System.out.println("*************");
		Methodcalling1.Display();
		System.out.println("*************");
		Display1(4, 5);
		System.out.println("*************");
		Methodcalling1.Display1(5,6);

	}

}
