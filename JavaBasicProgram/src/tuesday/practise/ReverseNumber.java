package tuesday.practise;

public class ReverseNumber {

	public static int RevNumber(int num) { // static method
		int rev = 0, rem;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem; //
			num = num / 10;
		}

		return rev;
	}

	int RevNumber1(int num) {    // non static method
		int rev = 0, rem;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem; //
			num = num / 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		// RevNumber();
		System.out.println(RevNumber(456));
		int result = RevNumber(456);
		System.out.println(result);
		System.out.println(RevNumber(651)); 
		System.out.println("non static method ");
		ReverseNumber ref = new ReverseNumber();//object creation using ref because non static method
		System.out.println(ref.RevNumber1(12345)); //calling out method body and seeing return value 
		int abc = ref.RevNumber1(741);// storing the return value into new variable and calling body 
		System.out.println("updated = " +abc);// 
	}

}
