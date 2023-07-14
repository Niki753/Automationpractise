package forifelsepractise2;

public class Forwhiledo {

	public static void main(String[] args) {
		for (int a = 0; a <= 5; a++)// for
		{
			System.out.print(a + " ");
		}
		System.out.println("\n");
		int b = 0;
		while (b <= 5)// while
		{
			System.out.print(b + " ");
			b++;
		}
		System.out.println("\n");

		int c = 0;// do while
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 5);
		System.out.println("\n");
		for (int d = 0; d <= 2; d++) {
			System.out.println("value of d = " +d);
			for (int e = 0; e < 2; e++) {
				System.out.println("  \t" +"value of e " +  + e);
				for (int f = 0; f < 2; f++) {
					System.out.println( "     \t \t" +" value of f "+  + f);

				}
			}
		}
	}
}
/*

d 0
   e 0
     f 0 
      f 1
   e 1
     f 0 
     f 1
 d 1    
   e 0
     f 0
     f  1
    e 1
      f 0
      f 1
 d 2 
    e 0
      f 0
      f 1
     e 1
      f 0  
       f 1
       
 */
