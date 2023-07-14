package tuesday.practise;

public class armstrong {
	
	static void method() {
		int num =372,cubesome=0,rem,temp;
		temp= num;
		for(;num>0;) {
			rem= num%10;
			cubesome =cubesome+rem*rem*rem;
			num= num/10;
		}
		if (temp== cubesome) {
			System.out.println("no. is arems");
		}
		else {

			System.out.println("no. is not arems");

		}
	}
	public static void main(String[] args) {
		method();
	}

}
