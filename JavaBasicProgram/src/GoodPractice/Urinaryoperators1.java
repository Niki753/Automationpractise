package GoodPractice;

public class Urinaryoperators1 {

	public static void main(String[] args) {
 		int x=10,y;
		//Decrement --> pre-Decrement--> first perform ops dn use updated value
		y=--x; //y = 9	
		System.out.println("x: "+x);//9
		System.out.println("y: "+y);//9
		System.out.println("====================");
		x=10;
		//Decrement --> post-Decrement--> first use value and dn perform ops
		y=x--;//y = 10
		System.out.println("x: "+x);//9
		System.out.println("y: "+y);//10


	}

}
