package creating.Object.ways;

public class CheckingAccessspecify {

	 public static void methodfromdiffPackage1differentclass1() {
			System.out.println("hi I a, a public static void method from diferent package not sub class");
			
		}
	    public static int methodfromdiffPackage1differentclass2(int a,int b) {
			System.out.println("hi Im a public static returntype method from diferent package not sub class");
			return a+b;
			
		}
	    public void methodfromdiffPackage1differentclass3() {
			System.out.println("hi Im a public nonstatic void method from diferent package not sub class");
			
		}
	    public String methodfromdiffPackage1differentclass4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  diferent package not sub class"+name);
			return name;
			
		}
	    
		

	    //protectrd methods
	    protected static void protectdmethodfromdiffPackage1differentclass1() {
			System.out.println("hi I a, a public static void method from diferent package not sub class");
			
		}
	    protected static int protectdmethodfromdiffPackage1differentclass2(int a,int b) {
			System.out.println("hi Im a public static returntype method from diferent package not sub class");
			return a+b;
			
		}
	    protected void protectdmethodfromdiffPackage1differentclass3() {
			System.out.println("hi Im a public nonstatic void method from diferent package not sub class");
			
		}
	    protected String protectdmethodfromdiffPackage1differentclass4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  diferent package not sub class"+name);
			return name;
			
		}
	    

	    //default methods
	     static void defaultmethodfromdiffPackage1differentclass1() {
			System.out.println("hi I a, a public static void method from diferent package not sub class");
			
		}
	     static int defaultmethodfromdiffPackage1differentclass2(int a,int b) {
			System.out.println("hi Im a public static returntype method from diferent package not sub class");
			return a+b;
			
		}
	     void defaultmethodfromdiffPackage1differentclass3() {
			System.out.println("hi Im a public nonstatic void method from diferent package not sub class");
			
		}
	     String defaultmethodfromdiffPackage1differentclass4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  diferent package not sub class"+name);
			return name;
			
		}
	    
		



	

}
