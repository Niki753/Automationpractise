package tuesday.practise;

public class Practise13 {

	
	static int Addnumbers()
	{
		int res, num1=10, num2=20;
		res= num1+num2;
		System.out.println(+num1);
		System.out.println(+num2);
 		return res;
	}
	
	static int Addtwonumbers(int num1 , int num2) {
	int res = num1+num2;
	System.out.println(+num1);
	System.out.println(+num2);
 	
	return res;
	}
	
	public static void main(String[] args) {
		Addnumbers ();
		System.out.println("*************************************");
		
		System.out.println(+Addnumbers());
		System.out.println("********************************");
		int sum = Addnumbers();
		System.out.println(+sum);
		System.out.println("********************************");
		Addtwonumbers (26,30);
		System.out.println("********************************");
		System.out.println( Addtwonumbers(65,66));
		System.out.println("********************************");
		int cal = Addtwonumbers(45,89);
		System.out.println(+cal);
				
		
		//Addtwonumbers(45,55);

		
	}

}
