package mostimpprograms;

public class FactorsOfPositiveNumber {

	static void factorsPositive(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		factorsPositive(16);
	}

}
