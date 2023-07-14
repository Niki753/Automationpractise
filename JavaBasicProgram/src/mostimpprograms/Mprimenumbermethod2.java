package mostimpprograms;

public class Mprimenumbermethod2 {

	static int primeno(int num) {

		int ct = 0;

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
		return ct;
	}

	public static void main(String[] args) {
 		primeno(15);
	}
}