package This;

public class Thispractise {
	int a; //NSGV//10
    int b; //NSGV    //20
    // Parameterized constructor with local variable a and b
    Thispractise (int a, int b)
    {
        this.a = a;//10//102
        this.b = b;//20//201
    } 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }
	public static void main(String[] args) {
		Thispractise object = new Thispractise(10, 20);
        object.display();
        System.out.println(object.a+" "+object.b);//
        Thispractise object2 = new Thispractise (102, 201);
        object2.display();
        System.out.println(object2.a+" "+object2.b);//
	}

}