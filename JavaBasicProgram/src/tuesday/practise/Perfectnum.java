package tuesday.practise;

public class Perfectnum {

	static void perfectnum(int num) {

		int  sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println("no. is perfect num");
		} else {
			System.out.println("no. is not perfect num");
		}

	}

	public static void main(String[] args) {
		perfectnum(6);
	}

}
