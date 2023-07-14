package array;

public class Array5 {

	public static void main(String[] args) {
		int age[] = new int[] { 4, 15, 18, 21, 30 };
		System.out.println("using for loop");

		for (int i = 0; i < age.length; i++)
			if (age[i] == 21) {
				System.out.println(age[i]);
				break;
			} else {
				System.out.println("age is not 21");
			}
		System.out.println("using for each loop");
		for (int x : age) {
			if (x == 30) {
				System.out.println(x);
				// System.out.println("age is 30");
				break;
			} else {
				System.out.println("age is not 30");
			}
		}
	}
}

 
 /*
  child c1= new child(); 
  parent p1=c1; imp up
  parent p1= (parent)c1; exp. up
  
  child d1  =(child)p1 exp. downcasting 



*/