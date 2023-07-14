package randomprac2;

public class Acountdigitsininteger {
//count digits
	public static void main(String[] args) {
		int num = 101, count = 0;
		for (; num != 0; count++) {
			num = num / 10;
		}
		System.out.println(count);

	}

}
