package mostimpprograms;

public class primeornot2 {

	static void method(int num, int ct) {

		for (int i = 1; i <=num; i++) {
			if (num % i == 0) {

				ct++;
		}}
		if (ct == 2) {
			System.out.println("give no.is prime");
		} else {
			System.out.println(" given no.is not prime");
		}
	}

	public static void main(String[] args) {

		method(10, 0);
		method(11, 0);
		method(0, 0); 
		method(23, 0);
	}

}
