package tuesday.practise;

public class PrimeNos {

	public static int PrimeNumbers(int num)
	{
	     int count = 0;
	     for ( int i =1;i <=15;i++);
	{
	   if (num%1==0)
	{
		   count++;
	}
	if (count==2 )
	{
		System.out.println("given number is prime");
	}
	else 
	{
		System.out.println("given number is not a prime number");
	}
	return count;
	}	
	}
	
	public static void main(String[] args) {
		PrimeNumbers(15);
		System.out.println(PrimeNos.PrimeNumbers(15));
        
	}

}
