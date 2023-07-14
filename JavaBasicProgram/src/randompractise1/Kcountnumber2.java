package randompractise1;

public class Kcountnumber2 {

	static int countnum(int num) {
		int count = 0;

		for (; num != 0; count++) {
			num = num / 10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countnum(14785212));
	}
}
