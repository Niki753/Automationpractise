package forifelse;

public class Dowhile {

	public static void main(String[] args) {
		System.out.println("*******using while**");
		int c = 10;
		while (c >= 0) {
			System.out.println(c);// 10 7//4//1
			c = c - 3;
		}
		System.out.println("*******using do while***********");
		int d = 10;
		do {
			System.out.println(d);
			d = d - 3;
		} while (d < 0);
		System.out.println("***** print 1 to 20 using while ********");
		int i =1;
		while(i<21)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println("****\nusing do while loop*******");
		int j=1;
				do
				{
					System.out.print(j+" ");
					j++;
				}while (j<21);
				//while(j==21) it will be executed only once i.e. //1 
	}

}