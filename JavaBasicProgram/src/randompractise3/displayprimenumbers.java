package randompractise3;

public class displayprimenumbers {

	public static void main(String[] args) {
		//prime numbers	from 1 to 100	
	
		String Primenumber = "";
		
		for (int i = 1; i <= 100; i++) {
			int count =0;
				
			for(int n=i;n>=1;n--) {
				if(i%n==0) {
					count++;
				}
			}
			if(count==2) {
				Primenumber = Primenumber+i+" ";
			}

		
	}
		System.out.print("Prime numbers are :" +Primenumber +" ");

}}
