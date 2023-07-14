package randompractise3;

public class primeornot {

	static void primenumber(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}}	
		
		if (count == 2) {
			System.out.println("no. is prime");
		} else {

			System.out.println("no. is not prime");

		}

	}

	public static void main(String[] args) {

		primenumber(2);
	}

}
