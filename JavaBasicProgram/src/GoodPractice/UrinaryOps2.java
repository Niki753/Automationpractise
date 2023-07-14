package GoodPractice;

public class UrinaryOps2 {

	public static void main(String[] args) {
		int i=10;
		int j=i;//j = 10
		System.out.println("i: "+i);//i = 10
		System.out.println("j: "+j);//j = 10
		System.out.println("=====================");
		i=j+40; //i =50 
		System.out.println("Updated i: "+i);//i = 50
		System.out.println("j: "+j);//j = 10
		System.out.println("=====================");
		int x=10,y;
		//Increment --> pre-increment--> first perform ops dn use updated value
		y=++x; //y =++x; --->x=x+1;//y = 11		
		System.out.println("x: "+x);//11
		System.out.println("y: "+y);//11
		System.out.println("====================");
		x=10;
		//Increment --> post-increment--> first use value and dn perform ops
		y=x++;//y = 
		System.out.println("x: "+x);//11
		System.out.println("y: "+y);//10
	}

}
