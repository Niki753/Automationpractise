package overridding;

class vehicle {// parent class
	int age;// NSGV

	static void show() {// Static method
		System.out.println(" i am static method show of vehicle class ");
	}

	vehicle()// user defined constructor
	{
		System.out.println("i am constructor of class vehicle ");
		age = 55;
	}

	void move(int age) {// non static method
		System.out.println("i am non static method move of vehicle class");
		System.out.println("valur of age = " + age);
		System.out.println("value of age = " + this.age);	
	}
	

	static void show(int age) {// method overloading
		System.out.println("i display method overloading");
	}
}

class car extends vehicle { // child class
	int age;// NSgv

	car() {// user defined constructor
		this(10);// using this statement
		System.out.println("i am frst constructor of car class");
		age = 10;// non static global variable
	}

	car(int age) {// constructor overloading
		super();// using super statement
		System.out.println("i am second constructor of car class");
	}

	static void display() {// static method
		System.out.println("i am static method display of car class");
	}

	// @overridden
	void move() {// overridden method
		int age = 15;
		System.out.println("I am non static method move of car class");
		System.out.println("value of age =" + age);
		System.out.println("value of age =" + this.age);// using this keyword
		super.move(11);// using super keyword
	}
}

public class overridding1 {
	public static void main(String[] args) {
		System.out.println("******************");
		car c1 = new car();
		car.display();
		c1.move();
		System.out.println("*************");
		vehicle v1 = new vehicle();
		vehicle.show();
		v1.move(11);

	}
}