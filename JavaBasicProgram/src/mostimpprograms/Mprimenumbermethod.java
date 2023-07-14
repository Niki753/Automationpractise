package mostimpprograms;

//check prime number
public class Mprimenumbermethod {

	public static void main(String[] args) {

		int num = 5, ct = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				ct++;
			}
		}
		if (ct == 2) {
			System.out.println("no. is prime");
		} else {
			System.out.println("no. is not prime");
		}

	}
}
