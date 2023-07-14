package forifelse;

public class forloop {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
        }
		System.out.println("**********************");

		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		//System.out.println("\n");
		System.out.println("**********************");

		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.println(c1);
		}
		
		//System.out.println("\n");
		System.out.println("**********************");

		for(char c2='a';c2<='z';c2++)
		{
			System.out.println(c2 );
		}
		System.out.println("**********************");
        for(int a=10;a>=0;a--)
        {
        	System.out.print(a + "  ");
        }
		System.out.println("**********************");

		for(char a1 ='Z';a1>='A';a1--)
		{
			System.out.print(a1+ "  ");
		}
	}
}