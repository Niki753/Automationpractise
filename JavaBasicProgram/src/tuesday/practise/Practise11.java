package tuesday.practise;

public class Practise11 {

	public static void display() {
		System.out.println("Hi, I am shailesh");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}	
	static void showDetails(String name,char grade,int num) {
		System.out.println("Hi, I am "+name);
		System.out.println("Your grade is "+grade);
		System.out.println("My contact number is "+num);
		
	}
	
	static void  addTwoNumbers() {
		int num1=10, num2=20,res;
		res = num1+num2;
		System.out.println(+num1);
		System.out.println(+num2);
		System.out.println(+res);
	}
	static void  addTwoNumbers(int num1 ,int num2) {
		int res;
		res = num1+num2;
		System.out.println(+num1);
		System.out.println(+num2);
		System.out.println(+res);
	}
	public static void main(String[] args) {
	display ();	
	Practise11.display();
	showDetails ("Nikita", 'A', 12);
	System.out.println("********************************************");
	addTwoNumbers();
	Practise11.addTwoNumbers();
	addTwoNumbers(25,45);
	}
}

