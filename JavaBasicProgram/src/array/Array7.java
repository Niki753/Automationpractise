package array;

class Example2 {
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

public class Array7 {

	public static void main(String[] args) {
     Example2 e2=new Example2();
     e2.calling();
     
     Example2 e3=new Example2(15);
     e3.calling();

     Example2 e4=new Example2(25.5);
     e4.calling();
System.out.println("***************************");
     //int []e=new int[3]= { . . . .}
     Example2 []e = new Example2[3];
     e[0]= new Example2();
     e[1]= new Example2(15);
     e[2]= new Example2(25.5);
     e[0].calling();
     e[1].calling();
     e[2].calling();
     
    		 
     
	}

}
