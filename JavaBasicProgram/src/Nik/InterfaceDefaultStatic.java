package Nik;

interface Drawable2 {
	void draw();// by default public abstract
	// below default keyword can be used only inside interface

	default void msg() {
		System.out.println("default method");
	}

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle2 implements Drawable2 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class InterfaceDefaultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable2 d = new Rectangle2();
		d.draw();
		d.msg();
		System.out.println(Drawable2.cube(3));
	}
}
