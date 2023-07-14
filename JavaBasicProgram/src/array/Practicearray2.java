package array;

public class Practicearray2 {

	public static void main(String[] args) {
      
		int []a= new int[5];
		int id=101;
      for(int i =0;i<a.length;i++){
      
      a[i]=id;
      System.out.println(a[i]);
            id++;
      }
      System.out.println("using for each loop");
		for(int k:a) {
			System.out.println(k);
		}
		
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// Access the Elements of an Array
		System.out.println(cars[0]);//Volvo
		// Change an Array Element
		cars[0] = "Opel";
		System.out.println(cars[0]);//Opel
		// array element count
		System.out.println(cars.length);//4
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("\rversing order");
		for(int i =cars.length-1;i>=0;i--) {
			System.out.println(cars[i]);
		}
	}

}
