package fourmay;

public class NStaticMethod {
	
	double addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	double addNumber(int num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	double addNumber(double num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	double addNumber(int num1,double num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	
	
	public static void main(String[] args) {
		
		NStaticMethod ref= new NStaticMethod();
		
		System.out.println("*************");
		ref.addNumber();
		System.out.println("*************");
		System.out.println(ref.addNumber());
		System.out.println("*************");
		double add= ref.addNumber();
		System.out.println("Addition = " +add);
		System.out.println("*************");
		ref.addNumber(8, 9);
		System.out.println("*************");
        System.out.println(ref.addNumber(9, 10));
		System.out.println("*************");
        double abc = ref.addNumber(14, 20);
        System.out.println("update value = " +abc);
	}

}
