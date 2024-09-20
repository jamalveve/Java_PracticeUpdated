/**
 * 
 */
package Interface.abstraction.ways;

/**
 * 
 */
public interface InterfaceExample {
	public void abstractMethod1();

	public void abstractMethod2(String something);
//	protected void method() {
//
//System.out.println("helllos");
//	}-y not allowed?
//	
//	protected void abstractMethod2();{

	// Illegal modifier for the interface method abstractMethod2;
//	only public, private, abstract, default, static and strictfp are permitted
	// and all these method should have body except public and abstract

	// From Java 8, interfaces can contain default and static method
	// implementations.
//	From Java 9, interfaces can also contain private method implementations.

//	
//	private void abstractMethod2() {
//		System.out.println("Hi Iam private method from interface");
//	}
////	private static void methodssss() {
////		System.out.println("Hi Iam static method from interface");
////	}
//	public static void methodssss() {
//		System.out.println("Hi Iam static method from parent");
//	}
//	
//	default  void methiods455() {
//		System.out.println("Hi Iam default method from interface");
//	}
//	
//	

}

class Buses implements InterfaceExample, OneMoreInterfaceEx {

	@Override
	public void abstractMethod1() {
		System.out.println("no idea what to print");
	}

	@Override
	public void abstractMethod2(String something) {
		System.out.println(something);
	}

	public static void methodssss() {
		System.out.println("Hi Iam static method from child");
	}

	public void methiods455() {// y not protected
		System.out.println("Hi Iam nonstatic method from child  class");
	}

	protected void methodpro() {
		System.out.println("Hi Iam protected method from child  class");

	}

	@Override
	public void abstractMethodExtraInterface1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abstractMethodExtraIntertface2(String something) {
		// TODO Auto-generated method stub

	}

}

class Autos extends OneMoreClassforExample  implements InterfaceExample  {

	@Override
	public void abstractMethod1() {
		System.out.println("not else idea what to print");

	}

	@Override
	public void abstractMethod2(String something) {
		System.out.println(something);

	}
	public static void methodssss() {
		System.out.println("Hi Iam static method from child2");
	}

	public void methiods455() {// y not protected
		System.out.println("Hi Iam nonstatic method from child 2 class");
	}
	protected void methodpro() {
		System.out.println("Hi Iam protected method from child  2class");

	}

}

class OnemoreClassfor {
	public static void classMethod1() {
System.out.println("class ->static method 1 contennt");
	}

	public void classMethod2() {
		System.out.println("class ->static method 1 contennt");


	}
}
//other doubt
//class Example1{
//	public static void method123() {
//		System.out.println("static from method 1 class Example1");
//	}
//	
//	public  void method124() {
//		System.out.println("non static from method 1 class Example1");
//	}
//}
//
//class Example2 extends Example1{
//	public static void method123() {
//		System.out.println("static from method 1 class Example2");
//	}
//	@Override
//	public  void method124() {
//		System.out.println("non static from method 1 class Example2");
//	}
//}
