package overridding;


class Parent123{
	void method() {
		System.out.println("I am method of parent class");
	}
	static void display() {
		System.out.println("I am display of parent class");
	}
}
class child extends Parent123{
	
	void method() {
		System.out.println("I am method of child class");
	}
	static void display1() {
		System.out.println("I am display1 of child class");	
	}
}

public class Overridding3 {

	public static void main(String[] args) {
     child c1 =  new child();
     c1.method();
     c1.display1();
     c1.display();
     System.out.println("*******************");
    Parent123 p = c1;//auto upcasting
     //Parent123 p = (Parent123)c1; //explicit upcasting
     p.display();
     p.method();
     System.out.println("*******************");
     child c= (child)p; // explicit downcasting
     c.method();
     c.display1();
     
	}

}
