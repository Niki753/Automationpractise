package tuesday.practise;

public class EvenNumbers {

	public static void Evenno(int num) {
		// need even nos. between 0 to 100

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)

				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Evenno(20);
	}

}
