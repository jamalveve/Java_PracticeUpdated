package others.basic.things;

public class StaticBlockConstructor {

	
	StaticBlockConstructor(){
		System.out.println(" iam from sonstructor");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println("main class statement");
		StaticBlockConstructor s1=new StaticBlockConstructor();
		s1.randommethod();
	}

	static {
		System.out.println("static block-2");
	}
	static {
		System.out.println("static block-3");
	}
   void randommethod() {
	System.out.println("i am from method");
	VariablesAndMethodsMain.finalmethod();
}

}
