package tuesday.practise;

public class Displayeven1 {

	static void even(int i,int num) {
		for(;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		even(1,20);
	}

}
