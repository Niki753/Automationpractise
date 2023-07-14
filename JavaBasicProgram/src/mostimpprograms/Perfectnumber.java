package mostimpprograms;

public class Perfectnumber {

	static void perfectnum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("no. is perfect number");

		} else {

			System.out.println("no. not is perfect number");

		}
	}

	public static void main(String[] args) {
		perfectnum(6);
	}

}
