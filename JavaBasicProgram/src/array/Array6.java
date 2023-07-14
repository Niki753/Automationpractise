package array;

public class Array6 {

	public static void main(String[] args) {
        int []num = new int[] {2,4,6};
        double sum=0;
        //double average;
        System.out.println(num.length);
        System.out.println("**************");
        for(int n:num) {
        	System.out.println(n);
        	sum= sum+n;}
         int count= num.length;
         double average = sum/count;
         System.out.println("sum " +sum);
         System.out.println("average is " +average);
        }
	}

