package creating.Object.ways;

import access.specifier.ways.AccessSpecifierMain;

public class CheckingAccessSpecifierSubClass extends AccessSpecifierMain {
	 public static void methodfromdiffPackage1() {
			System.out.println("hi I a, a public static void method from sub class");
			
		}
	    public static int methodfromdiffPackage2(int a,int b) {
			System.out.println("hi Im a public static returntype method from sub class");
			return a+b;
			
		}
	    public void methodfromdiffPackage3() {
			System.out.println("hi Im a public nonstatic void method from sub class");
			proaccessway3();
			
		}
	    public String methodfromdiffPackage4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
			return name;
			
		}
	    void dummy() {
	    	System.out.println("some dummmy check in subclass");
	    }
//from different pacakag upcasting nonstatuc is not possible
	   
	    

		 protected static void subclassProtectedmethodfromdiffPackage1() {
				System.out.println("hi I a, a public static void method from sub class");
				
			}
		 protected static int subclassProtectedmethodfromdiffPackage2(int a,int b) {
				System.out.println("hi Im a public static returntype method from sub class");
				return a+b;
				
			}
		 protected void subclassProtectedmethodfromdiffPackage3() {
				System.out.println("hi Im a public nonstatic void method from sub class");
				
			}
		 protected String subclassProtectedmethodfromdiffPackage4(String name) {
				System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
				return name;
				
			}
		   
			//default methods
		  static void subclassdefaultmethodfromdiffPackage1() {
				System.out.println("hi I a, a public static void method from sub class");
				
			}
		  static int subclassdefaulmethodfromdiffPackage2(int a,int b) {
				System.out.println("hi Im a public static returntype method from sub class");
				return a+b;
				
			}
		  void subclassdefaulmethodfromdiffPackage3() {
				System.out.println("hi Im a public nonstatic void method from sub class");
				
			}
		  String subclassdefaulmethodfromdiffPackage4(String name) {
				System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
				return name;
				
			}
		   
			



		


}
