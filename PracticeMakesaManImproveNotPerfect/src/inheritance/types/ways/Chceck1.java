package inheritance.types.ways;

public class Chceck1 {

	public static void main(String[] args) {

	    C c = new C();
	    c.m1();
	    B b=new B();
	    b.m1();
	    
	}

}
class A 
{
	  static void m1(){
	      System.out.println("m1 in class A");	 
	  }
	}
	class B extends A
	{
	  static void m1() {
	      System.out.println("m1 in class B");	
	  }
	}
	class C extends B 
	{
	 static void m1() {
	      System.out.println("m1 in class C"); 
	  }
	}
	 class Test {
	public static void main(String[] args) 
	{}
	}
