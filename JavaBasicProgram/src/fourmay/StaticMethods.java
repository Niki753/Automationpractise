package fourmay;

public class StaticMethods {

	static int addNumbers() {
		int a = 10, b = 20, c = a + b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		return c;
	}
	static int addNumbers(int a, int b ) {
		int  c = a + b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
 		return c;
	}

	public static void main(String[] args) {
		// it will execute method body  but u wont b able to see or use return value
		addNumbers();
		StaticMethods.addNumbers();
		System.out.println("****************************************8");		
		System.out.println("*************************************");
		//IN ORDER TO see the return vale ,, call the method inside println

		System.out.println(addNumbers());
		//storing the return value in a variable for future use
		int sum = addNumbers();
		System.out.println("sum = " +sum);
		int totalsum = sum+100;
		System.out.println("total sum = " +totalsum );
	
		System.out.println("*********************************");
		//calling method body bt not see return value
		addNumbers(15,40);
		StaticMethods.addNumbers(1,2);
		// calling method body and able to see return value
		System.out.println(addNumbers(40,50));
		//storing the return value of method in a new variable add
		int add = addNumbers(10,20);
		System.out.println("addition ="  +add);
	}

}
