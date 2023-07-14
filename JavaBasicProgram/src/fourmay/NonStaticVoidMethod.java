package fourmay;

public class NonStaticVoidMethod {

	public void display()
	{
		System.out.println("i am Nikita");
		System.out.println("i live in Hyderabad");
		System.out.println("My No. is 123546");
	}
	void display(String name, String Location, int num)
	{
		System.out.println("i am " +name);
		System.out.println("i live in " +Location);
		System.out.println("My No. is " +num);
	}
	void addNumber()
	{
		int num1 = 1,num2=2,res = num1+num2;
		System.out.println("num1 = " +num1 );
		System.out.println("num2 = " +num2 );
		//System.out.println("result = " +res );
	}
	void addNumber(int num1,int num2)
	{
		int res = num1+num2;
		System.out.println("num1 = " +num1 );
		System.out.println("num2 = " +num2 );
		//System.out.println("result = " +res );
	
	}
	public static void main(String[] args) {
		//non static method hai thatswhy creating object using new reference variable and then calling out method body using 
		//reference variable ref//
		NonStaticVoidMethod ref = new NonStaticVoidMethod();
		ref.display();
		ref.display( "Niky","America",45679);
		ref.display( "Niharika","Atlantis",4567912);
		ref.addNumber();
		ref.addNumber(4,5);
	}

}
