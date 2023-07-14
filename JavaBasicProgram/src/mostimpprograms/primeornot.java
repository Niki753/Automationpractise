package mostimpprograms;

public class primeornot {

	static void primeornot1() {
		int num = 5;
		int ct = 0;

		for (int i = 1; i <= 5; i++) {
			if (num % i == 0) {
				ct++;
			}
		}
		if (ct == 2) {
			System.out.println("no. is prime");
		}

		else {
			System.out.println("no. is not prime");
		}

	}

	public static void main(String[] args) {
		primeornot1();
		
	}
	

}
