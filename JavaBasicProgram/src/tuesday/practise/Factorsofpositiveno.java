package tuesday.practise;

public class Factorsofpositiveno {

	static void factorP (int num) {
		//int num=6; 
		for(int i =1;i<=num;i++) {//1 //2//3//6
			if(num%i==0) {        //
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		factorP (6);
	}

}
