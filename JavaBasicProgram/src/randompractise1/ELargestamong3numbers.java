package randompractise1;

public class ELargestamong3numbers {

	
	static void largest(int num4,int num5,int num6) {
		
		if (num4 > num5 && num4 > num6) {
			System.out.println("num4 is largest");
		} else if (num5 > num4 && num5 > num6) {
			System.out.println("num5 is largest");

		} else {
			System.out.println("num6 is largest");
		}
	
	}

	public static void main(String[] args) {

		/*int num1 = 210, num2 = 120, num3 = 30;
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is largest");

		} else {
			System.out.println("num3 is largest");
		}*/
          largest(15,6,7);
	}
}
