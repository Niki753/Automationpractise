package randompractise1;

public class Kcountnumber1 {

	public static void main(String[] args) {

		int num = 15961, count = 0;
		for (; num != 0; count++) {
			num = num / 10;
		}
		System.out.println(count);
	}

}
