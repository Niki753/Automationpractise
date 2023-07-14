package mostimpprograms;

public class SumofNaturalnos {

	static void natural() {
		int sum = 0, n = 4;
		for (int i = 0; i <= n; i++) {//0 1  2 3 4
			sum = sum + i;//          //0 1  3 6 10
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		natural();

	}
}
