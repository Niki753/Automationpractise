package array;

class Example2  {
	int age;
	double salary;
	Example2(){
		System.out.println("Zero-param");
	}
	Example2(int a){
		age=a;
		System.out.println("int-param");
	}
	Example2(double a){
		salary=a;
		System.out.println("double-param");
	}
	void calling() {
		System.out.println("calling of Example1 class, age: "+age);
		System.out.println("calling of Example1 class, salary: "+salary);
	}
}


public class ClassObjectArray8 {

	public static void main(String[] args) {
		Example2 e2 = new Example2();
		e2.calling();
		Example2 e3 = new Example2(15);
		e3.calling();
		Example2 e4 = new Example2(25.36);
		e4.calling();
		
	}

}
