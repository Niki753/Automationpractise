package exceptions;

public class exception2 {

	public static void main(String[] args) {
		int [] empid = new int[5];
		try {
			System.out.println("inside try()");
		System.out.println(empid[6]);
		}
		catch(Throwable e) {
			System.out.println("inside catch()");
			  System.out.println(e);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
