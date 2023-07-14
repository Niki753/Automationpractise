package tuesday.practise;

public class Prime1 {

	static void prime(int num) {
		int ct = 0;
		for (int i = 1; num >= i; i++) {
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

	public static void main(String[] args) {
		prime(5);
	}
}
