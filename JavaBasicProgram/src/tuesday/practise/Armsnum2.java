package tuesday.practise;

public class Armsnum2 {

	static void arms(int num) {
       int cubesome=0,rem,temp;
       temp=num;
       for(;num>0;) {
    	   rem=num%10;
    	   cubesome= cubesome+rem*rem*rem;
    	   num=num/10;
       }
       if(cubesome==temp) {
    	   System.out.println("no. is armstrong");
       }
       else {
    	   System.out.println("no. is not armstrong");
       }
	}

	public static void main(String[] args) {
		arms(372);
	}

}
