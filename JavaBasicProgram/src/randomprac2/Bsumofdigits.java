package randomprac2;

public class Bsumofdigits {

	public static void main(String[] args) {

		int num = 1234;// 1+2+3+4
		int rem;
		int sum = 0;

		for (; num > 0;) {
			rem = num % 10;// 4 //
			sum = sum + rem;// 0+4//
			num = num / 10;// 123//
		}
		System.out.println(sum);

	}
}
