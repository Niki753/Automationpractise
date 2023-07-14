package systemclass;

class Demo {
	void display() {
		System.out.println("Demo class display method");
	}

	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}

	Demo() {
		System.out.println("Demo class cons..");
	}
}

public class StaticReference {
	static Demo d2 = new Demo();
	static int age = 25;

	public static void main(String[] args) {
		StaticReference.d2.callMe(5);
		StaticReference.d2.display();
		System.err.println("i am error message");
	}

}

/*
 * Demo d2= new Demo();
 * 
 * d2.display(); d2.callMe(5);
 */