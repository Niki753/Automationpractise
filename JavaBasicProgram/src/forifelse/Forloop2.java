package forifelse;

public class Forloop2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Hi i am nikita");
		}
		System.out.println("************************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
         int value = c1;
			System.out.println("asci value of " +c1  +" is "  + value );
		}
		System.out.println("*****************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
	         int value = c1;
				System.out.println("asci value of " +c1  +" is "  + value );
			}
		System.out.println("\n******printing odd nos between 1 to 100*******");
		for(int i =1;i<=100;i++)
			if(i%2!=0)
			{
				System.out.print(i + " ");
			}
	
	System.out.println("\n******printing even nos between 1 to 100*******");
	
	for(int i =1;i<=100;i++)
		if(i%2==0)
		{
			System.out.println( "even no. is  " +i);
		}


	}}
