package access.specifier.ways;

public class OneExtraSubClass extends AccessSpecifierMain {
	
	
	 public static void method1() {
			System.out.println("hi I a, a public static void method from sub class");
			
		}
	    public static int method2(int a,int b) {
			System.out.println("hi Im a public static returntype method from sub class");
			return a+b;
			
		}
	    public void method3() {
			System.out.println("hi Im a public nonstatic void method from sub class");
			
		}
	    public String method4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
			return name;
			
		}
	    void dummy() {
	    	System.out.println("some dummmy check in subclass");
	    }
	   
	    //protected mehods
	    protected static void methods1() {
			System.out.println("hi I a, a public static void method from sub class");
			
		}
	    protected static int methods2(int a,int b) {
			System.out.println("hi Im a public static returntype method from sub class");
			return a+b;
			
		}
	    protected void methods3() {
			System.out.println("hi Im a public nonstatic void method from sub class");
			
		}
	    protected String methods4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
			return name;
			
		}
	   
	   
		
	    //default mehods
	     static void methodss1() {
			System.out.println("hi I a, a public static void method from sub class");
			
		}
	     static int methodss2(int a,int b) {
			System.out.println("hi Im a public static returntype method from sub class");
			return a+b;
			
		}
	     void methodss3() {
			System.out.println("hi Im a public nonstatic void method from sub class");
			
		}
	     String methodss4(String name) {
			System.out.println("hi Im a public nonstatic return type method from  sub class"+name);
			return name;
			
		}
	   
	   
		

}
