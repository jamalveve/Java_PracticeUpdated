package inheritance.types.ways;
 class C1 { 
	    static int x = 50;
	    int y=30;
	     static void method1() {
		   System.out.println("parent");
	   }
	      void method2() {
			   System.out.println("parent");
		   }
	}
	 class C2 extends C1 {
	   static int x = 40;
	    int y=20;

	    static void method1() {
		   System.out.println("child");
	   }
	    void method2() {
			   System.out.println("child");
		   }
	}
	public class Check {
	public static void main(String[] args) 
	{
	   C2 c2 = new C2();
	   System.out.println(c2.x); 
	 
	   C1 c1 = new C1();
	   System.out.println(c1.x);
	   c1.method1();
	 
	   C1 c3 = new C2();
	   System.out.println(c3.x);
	   System.out.println(c3.y);

	   c3.method1();
	   c3.method2();
	  }
	}
