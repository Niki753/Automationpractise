package tuesday.practise;

public class displayodd1 {

	static void odd(int i, int num) {
		// int num=15;
		for (i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		odd(1, 15);
	}

}
