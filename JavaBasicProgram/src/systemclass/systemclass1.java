package systemclass;

public class systemclass1 {

	public static void main(String[] args) {
		String userHome=System.getProperty("user.home");
		System.out.println(userHome); //or
		
		// checking specific property
		System.out.println("System User Dir: "+System.getProperty("user.home"));
		System.out.println("Current Working Dir: "+System.getProperty("user.dir"));
		// clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));//null
		// setting specific property
		System.setProperty("user.home", "F:\\GitAutomation\\MorningBatch1");
		System.out.println("updated System User Dir: "+System.getProperty("user.home"));
		// setting specific property
		//System.setProperty("user.country", "IND");
		// checking property
		System.out.println(System.getProperty("user.country"));//IND
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());

	}

}
