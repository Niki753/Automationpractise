package tuesday.practise;

public class Sumofnaturalno {

	static void sumnatural(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) { //i = 0/1/2/3/4/5
			sum= sum+i;          //sum= 0/1/3/6/10
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumnatural(4) ;
	}

}
