
public class palindrome {
	
			
	public static void main(String[] args) {
 
		int num=121,rem,rev=0;
		int temp=num;
		 
		for(;num>0;) {
			rem= num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		if(temp== rev) {
			System.out.println("No. is palindrome");
		}
		else {
			System.out.println("No. is not palindrome ");
		}
		
	}

}
