package forifelse;

public class While1 {

	public static void main(String[] args) {
		System.out.println("***********using for loop*********");
		int i = 0;
		for (; i < 5;) {
			System.out.println(i);
			i++;
		}
		System.out.println("****  using while loop********");
		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
		}
		System.out.println("**********using while loop************");
		int a = 5;
		while (a >= 0) {
			System.out.println(a);
			a--;
		}
		System.out.println("******using for loop for the same*************");
		
		for (int b=5;b>=0;b--)
		{
			System.out.println(b);
		}
		System.out.println("********print a to z using while******");
		char c1='a';
		while(c1<'z')
		{
			System.out.print(c1+ " ");
			c1++;
		}
		System.out.println("\n*********print z to a ***************" );
		  char c2='z';
		  while(c2>='a')
		  {
			  System.out.print(c2 + " ");
			  c2--;
		  }
		  System.out.println("**************");
		  int num=20;
		  while(num!=0)//20//10/5/2/1
		  {
			  System.out.print(num + " ");
			  num=num/2;
		  }
		  System.out.println("*********************");
		  int x= 10;
		  while(x>0)
		  {
			  System.out.print(x+ " ");//10//8 //6//4//2
			  x=x-2;
		  }
		}
	}

