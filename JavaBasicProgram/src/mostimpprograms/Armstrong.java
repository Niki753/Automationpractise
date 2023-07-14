package mostimpprograms;

public class Armstrong {

	static void  armstrongNum(int num) {
		//int num
		int cubesome=0,rem,temp;
		temp=num;
		
		for(;num>0;) {
			rem= num%10;
			cubesome = cubesome+(rem*rem*rem);
			num=num/10;
		}
		if(cubesome==temp) {
			System.out.println("no. is arms");
		}
		else {
			System.out.println("no. is not arms");
		}
		
	}
	
	
	public static void main(String[] args) {
		armstrongNum(371);
	}

}
