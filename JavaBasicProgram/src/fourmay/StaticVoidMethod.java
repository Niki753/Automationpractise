package fourmay;

public class StaticVoidMethod {

	public static void display()
	{
		System.out.println("I am Nikita");
		System.out.println("Ilive in Hyderabad");
		System.out.println("My No. is 123456");
	}
	static void display(String name, String location, int number)
	{
	System.out.println("I am " +name);
	System.out.println("I live in " +location );
	System.out.println("My No. is " +number );
}
	static void addNumber()
	{
		int num1 = 10, num2= 20,res;
		res= num1+num2;
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		System.out.println("result = "+res);
	}
	static void addNumber(int num1, int num2) {
	int res = num1 +num2;
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		System.out.println("result = "+res);	
	}
	
	public static void main(String[] args) {
			display();
			display("Yogeshita", "IndoreMP" , 12346548);
			display("Yogesh", "Indore" , 12346579);
			StaticVoidMethod.display("Danish", "Dhar", 259);	
			addNumber();
			StaticVoidMethod.addNumber();
			addNumber(15,19);
			StaticVoidMethod.addNumber(18,20);
	}
}
