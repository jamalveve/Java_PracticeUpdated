package main.method.overloading;

public class MainMethodOl {

	public static void main(String[] args) {
		MainOverload obj1=new MainOverload();
		obj1.main(4, 6);//overload in diferent class
		obj1.main("jamal",6);
		obj1.main("jamy", 0,8.5f);
		
		main("jamu", "jamy");//overloaded in same class
		

	}
	
	public static void main(String d,String y) {
		System.out.println(d+y);

	}
	
		
}
class MainOverload{
	public static void main(int a,int b) {
		System.out.println(a+b);

	}
	public static void main(String s,int c) {
		System.out.println(s+c);

	}
	public static void main(String s,int c,float e) {
		System.out.println(s+c+e);
	}
}
