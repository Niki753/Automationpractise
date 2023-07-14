package array;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * String[] cars= new String[4]; //1st syntax cars[0] =" volvo"; cars[1]
		 * =" BMW"; cars[2] =" Ford"; cars[3] =" Mazda";
		 * 
		 * 
		 * System.out.println(cars[0]); System.out.println(cars[1]);
		 * System.out.println(cars[2]); System.out.println(cars[3]);
		 */
		//System.out.println("**********using for each loop*******");

		String[] cars = { "volvo", "BMW", "Ford", "Mazda" }; // 2nd syntax
		/*for (String i : cars) {
			System.out.println(i);
		}*/
		// cars [0]= "Opel"; //reinitialization i.e. volvo ki jagah opel krdia
        System.out.println(cars[0]);
        System.out.println(cars.length);
        System.out.println("*******using for loop ***");
        
        for(int i =0;i <cars.length;i++)
        {
        	System.out.println(cars[i]);        }
          		
	}

}
