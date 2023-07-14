 package This;

public class Assignment123 {

	static int age = 10;//SGV
	int salary ;//NSGV
	
	static void display(int age) //Static method1
	{
		System.out.println("running static method1");
		System.out.println("printing local age = "  +age);
		System.out.println("printing global age = " +Assignment123.age );
		
	}
    static void display1()//static method2
	{
    	System.out.println("running static method2  ");
		System.out.println("value of global age =" +Assignment123.age);
		display(101);
		
	}
	Assignment123()//user defined constructor 
	{
		System.out.println("running user defined constructor");
	}
	
	static //static block1
	{
		System.out.println("static block starts here");
	}
	{//Non static block1
		System.out.println("non static block1 starts here");
		salary = 56000; // initialization of non static global variable from non static block
	}
	void showdisplay()//Non static method
	{
		System.out.println(" value of global salary is " +salary );	
		//this.display(15);
		display(15);
	}
	{//non static block2
		System.out.println("non static block 2 starts here..");
	}
	
	public static void main(String[] args) {
      display(55);
      System.out.println("******************************");
      display(15);
      System.out.println("******************************");
      Assignment123 b2 = new Assignment123();
      System.out.println("******************************");
      b2.showdisplay();
      System.out.println("******************************");
      display1();

	}

}
