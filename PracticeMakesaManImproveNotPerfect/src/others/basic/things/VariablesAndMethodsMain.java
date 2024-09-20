package others.basic.things;

public class VariablesAndMethodsMain {
	static int variable1=6;
	String variable2="jamal";
	private String variable3="hello";
	private static double variable4=6.7;
	protected float variable5=4.5f;
	protected static float variable6=3.6f;
	 final int globalvar1=19;
	  float variable7=4.5f;
	  static float variable8=4.5f;
//	  final int varible10;//you cant in clas level only comnsyructoe level
		final static int def=68;
	
	void nonSTaticmethod() {
		int localvar=10;
		localvar=5+localvar;//posible
//		globalvar1=8+localvar;//not possoble
		 variable7=4.5f+variable7;//possible
		 variable8=6+variable8;
		 System.out.println(variable8);
		System.out.println("non static method and printinf loval variable"+localvar);

	}
	static void sTaticmethod() {
//		def=81+7;//not possoble//final field
//		variable7=4.5f+variable7;//not possible //cant acces non static vafribale inside static method
		 variable8=6+variable8;
		final int localvar=11;//only final local var is permitted
		System.out.println("static method and printinf loval variable"+localvar);
//		slocalvar=5+localvar;//not possble
	}
	final static void finalmethod() {//static or  non static we can create
		System.out.println("I am from final method");
	}
	public static void main(String[] args) {
		//static var fetching way
		//className.variablename
		System.out.println(variable1);
		System.out.println(variable4);
		System.out.println(variable6);

		System.out.println(new VariablesAndMethodsMain().variable2);
		System.out.println(new VariablesAndMethodsMain().variable3);
		System.out.println(new VariablesAndMethodsMain().variable5);
         //above three times we are creating obj //bad type
		
		VariablesAndMethodsMain objclass=new VariablesAndMethodsMain();
		System.out.println(objclass.variable2);
		System.out.println(objclass.variable3);
		System.out.println(objclass.variable5);
		VariablesAndMethodsMain objclass1=new VariablesAndMethodsMain();
		VariablesAndMethodsMain objclass3=objclass1;
		
		System.out.println(objclass==objclass1);
		
        System.out.println(objclass);
        System.out.println(objclass1);
        System.out.println(objclass3);//as we paused just a reference it is same adress

        //method vise
        
        objclass.nonSTaticmethod();
        VariablesAndMethodsMain.sTaticmethod();
        VariablesAndMethodsMain.finalmethod();
       
//        System.out.println(objclass.localvar);
		

		

		
	}

}
