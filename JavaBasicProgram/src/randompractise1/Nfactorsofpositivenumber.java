package randompractise1;

public class Nfactorsofpositivenumber {

	public static void main(String[] args) {
		// 6 = 6 3 2 1
		int num = 6;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
