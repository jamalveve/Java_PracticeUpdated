package access.specifier.ways;

import creating.Object.ways.CheckingAccessSpecifierSubClass;
import creating.Object.ways.CheckingAccessspecify;

public class AccessSpecifierMain {

	public static void main(String[] args) {
		// access from same class
		System.out.println("------------------public from same class------------------------");

		// static to static
		accessway1();// if it is public static void
		accessway2(4, 6);// if public static return type

		// for nonstatic to static create obj
		AccessSpecifierMain obj1 = new AccessSpecifierMain();
		obj1.accessway3();// if it is public non static void
		obj1.accessway4("jamal1");// if public non static return type
		System.out.println("------------------public from different class------------------------");

		// static to static
		Car.car1();// if it is public static void
		Car.car2(4, 6);// if public static return type+

		// for nonstatic to static even from different class create obj
		Car carobj = new Car();
		carobj.car3();// if it is public non static void
		carobj.car4("jamal2");// if public non static return type

		System.out.println("------------------public from same package(subclass)------------------------");
		OneExtraSubClass.method1();
		OneExtraSubClass.method2(5, 60);
		OneExtraSubClass.accessway1();
		OneExtraSubClass.accessway2(0, 8);

		OneExtraSubClass extraobj = new OneExtraSubClass();

//	  extraobj.method2(5, 4);
//	  extraobj.method1();
		extraobj.method3();
		extraobj.method4("jamy3");

//	  extraobj.accessway1();
//	  extraobj.accessway2(9, 0);
		extraobj.accessway3();
		extraobj.accessway4("jamysubclass");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("------------------public from different package(subclass)------------------------");

		CheckingAccessSpecifierSubClass.methodfromdiffPackage1();
		CheckingAccessSpecifierSubClass.methodfromdiffPackage2(8, 0);

		CheckingAccessSpecifierSubClass c1obj = new CheckingAccessSpecifierSubClass();
		c1obj.methodfromdiffPackage3();
		c1obj.methodfromdiffPackage4("jammm");
		c1obj.accessway3();
		c1obj.accessway4("jamformcheckdiffpackag");

		System.out.println("------------------public from different package(notsubclass)------------------------");
		CheckingAccessspecify.methodfromdiffPackage1differentclass1();
		CheckingAccessspecify.methodfromdiffPackage1differentclass2(8, 8);

		CheckingAccessspecify checking1 = new CheckingAccessspecify();
		checking1.methodfromdiffPackage1differentclass3();
		checking1.methodfromdiffPackage1differentclass4("jaummmmmmmmm");

		System.out.println(
				"------------------checking upcasting from different and same package------------------------");

		AccessSpecifierMain upcast = new CheckingAccessSpecifierSubClass();
		AccessSpecifierMain upcasts = new OneExtraSubClass();
		// is posible only for class extended from this class under same package

		upcast.dummy();// non static from doff pacakage
		upcasts.dummy();// non static from samepacakge
		System.out.println("------------------checking protected from same class ------------------------");
	
proaccessway1();
proaccessway2(4, 60);
obj1.proaccessway3();
obj1.proaccessway4("jamau");

System.out.println("------------------checking protected from any class(same package) ------------------------");

Car.cars1();
Car.cars2(8, 7);
//obj1.cars();//not possible
carobj.cars3();
carobj.cars4("jamuu");

System.out.println("------------------checking protected from subclass class(same package) ------------------------");

OneExtraSubClass.methods1();
OneExtraSubClass.methods2(5, 60);

OneExtraSubClass protectedobj=new OneExtraSubClass();
protectedobj.methods3();

System.out.println("------------------checking protected from subclass class(different package)?doubt not possible ------------------------");
//
//CheckingAccessSpecifierSubClass.subclassProtectedmethodfromdiffPackage1();
//CheckingAccessSpecifierSubClass.subclassProtectedmethodfromdiffPackage2(5, 60);
//
//CheckingAccessSpecifierSubClass protectedsubclassobj=new CheckingAccessSpecifierSubClass();
//protectedsubclassobj.subclassProtectedmethodfromdiffPackage3();
//
//
System.out.println("------------------checking protected from anyclass (different package) not possible ------------------------");
//
//CheckingAccessspecify.protectdmethodfromdiffPackage1differentclass1();
//// same as above so protected from other package however it is not posible
//
//

System.out.println("------------------checking default from same class ------------------------");
   defaultaccessway1();
  defaultaccessway2(7, 8);
  
  obj1.defaultaccessway3();
  obj1.defaultaccessway4("jamuuuu");
  
  System.out.println("------------------checking default from any class (same package)------------------------");
 Car.carss1();
 Car.carss2(0, 0);
 
 carobj.carss3();
 carobj.carss4("jamuuu");

 System.out.println("------------------checking default from subclass class (same package)------------------------");
 OneExtraSubClass.methodss1();
 OneExtraSubClass.methodss2(9, 0);
 
extraobj.methodss3();
extraobj.methodss4(":jamu");


System.out.println("------------------checking default from any class (other package)not possible------------------------");
//CheckingAccessSpecifierSubClass.subclassdefaulmethodfromdiffPackage2();//not posiible

//CheckingAccessspecify.defaultmethodfromdiffPackage1differentclass1();//not possible


System.out.println("------------------checking private from same class------------------------");
privateaccessway1();//not possible bcz of 
privateaccessway2(4,5);

obj1.privateaccessway3();
obj1.privateaccessway4("jam");
		
		

	}

	void dummy() {
		System.out.println("some dummmy check");
	}
//public methods

	public static void accessway1() {
		System.out.println("hi I a, a public static void method from same class");

	}

	public static int accessway2(int a, int b) {
		System.out.println("hi Im a public static returntype method from same class");
		return a + b;

	}

	public void accessway3() {
		System.out.println("hi Im a public nonstatic void method from same class");

	}

	public String accessway4(String name) {
		System.out.println("hi Im a public nonstatic return type method from same class");
		return name;

	}

//	/protected methods

	protected static void proaccessway1() {
		System.out.println("hi I a, a public static void method from same class");

	}

	protected static int proaccessway2(int a, int b) {
		System.out.println("hi Im a public static returntype method from same class");
		return a + b;

	}

	protected void proaccessway3() {
		System.out.println("hi Im a public nonstatic void method from same class");

	}

	protected String proaccessway4(String name) {
		System.out.println("hi Im a public nonstatic return type method from same class");
		return name;

	}
	

	//default methods->package private
		 static void defaultaccessway1() {
			System.out.println("hi I a, a public static void method from different class");

		}

		static int defaultaccessway2(int a, int b) {
			System.out.println("hi Im a public static returntype method from different class");
			return a + b;

		}

		 void defaultaccessway3() {
			System.out.println("hi Im a public nonstatic void method from different class");

		}

		 String defaultaccessway4(String name) {
			System.out.println("hi Im a public nonstatic return type method from different class");
			return name;

		}
		 
		 //private methods
		 
		 private static void privateaccessway1() {
				System.out.println("hi I a, a public static void method from different class");

			}

		 private static int privateaccessway2(int a, int b) {
				System.out.println("hi Im a public static returntype method from different class");
				return a + b;

			}

		 private   void privateaccessway3() {
				System.out.println("hi Im a public nonstatic void method from different class");

			}

		 private  String privateaccessway4(String name) {
				System.out.println("hi Im a public nonstatic return type method from different class");
				return name;

			}
			 

}
