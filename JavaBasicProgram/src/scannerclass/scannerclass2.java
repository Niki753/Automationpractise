package scannerclass;

class scannerclass2{
	static void prime(int num, int ct) {
//to check whether number is prime or not
		
		for (int i = 1; i <=num; i++) {
			if (num % i == 0) {
				ct++;
			}
		}
		if (ct == 2) {
			System.out.println("no. is prime");
		} else {
			System.out.println("No. is not prime");
		}
	}

	public static void main(String[] args) {
		prime(5,0);
	}
}

/*
 * int num = 15, ct = 0;
 * 
 * for (int i = 1; i <= num; i++) {// 5%1 ,5%5 
 *  if (num % i == 0) 
 *  { ct++; }} 
 *   if
 * (ct == 2)
 *  { System.out.println("number is prime"); }
 *   else {
 * System.out.println("number is not prime"); }
 */