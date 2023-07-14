package day3.basics;

public class practiseifelse 
{

	public static void main(String[] args) {
	int num1 = 45, num2 = 30;
	if (num1>num2){
	
		System.out.println( "number1 is greater than number2" );
	} else {
		System.out.println("number1 is not equal to number2 " );
	}
	if ( num1 >= num2) {
		System.out.println(" number1 is greater than or equal to number2" );
	}else { 
		System.out.println("number1 is smaller than or equal to number2");
	}
	if ( num1>=num2 && num1<num2) {
			System.out.println(" nuhmber1 is greater than or equals to number2   ");
	} else { System.out.println(" number1 is smaller than number2 ");
	}
	if (num1==num2 || num1>num2) {
			System.out.println("  number1 is greater than number2 ");
	} else { System.out.println( " number1 is equal to number2 ");
	}
	int sub1=50,sub2=30;
	if(sub1>35 && sub2>35) {
		System.out.println("pass....");
	}else {
		System.out.println("fail....");
	}
		int abc1=65,abc2=60;
	if(abc1>35 && abc2>35) {
		System.out.println("pass....");
	}else {
		System.out.println("fail....");
	}
	int sub1=50,sub2=30;
	if(sub1>35 && sub2>35) {
		System.out.println("pass....");
	}else {
		System.out.println("fail....");
	}

	
	
	}
}
