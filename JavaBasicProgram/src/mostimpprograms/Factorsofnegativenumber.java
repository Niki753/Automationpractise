package mostimpprograms;

public class Factorsofnegativenumber {

	static void factorsnegative(int num) {
		//int num= -6 ;
				int sum=0;
		for(int i =-1;i>=num;i--) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		factorsnegative(-6);
	}

}
