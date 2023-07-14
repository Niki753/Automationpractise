package randompractise1;

public class Nfactorsofpositivenumber1 {

	static void factorspositive(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);	}
		}	}
	public static void main(String[] args) {
		factorspositive(16);
	}
}
