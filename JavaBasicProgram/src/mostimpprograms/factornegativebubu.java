package mostimpprograms;

public class factornegativebubu {


	static void factorsnegative(int num) {
		//int num= -6 ;
		
	for(int i =-1;i>=num;i--) {
		if(num%i==0) {
			System.out.println(i);
		}
	}
	int temp = num*(-1);
			for(int j=1; j<=temp; j++) {
				if(temp%j==0) {
					System.out.println(j);	
				}
			}
}

	public static void main(String[] args) {
		factorsnegative(-100);

	}

}
