package others.basic.things;

public class StaticBlockExample extends StaticBlockConstructor {
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println("main class statement");
		StaticBlockExample saticblobj=new StaticBlockExample();
		StaticBlockExample.methodRandom();
		
		
		//try calling cn=ontructor
	StaticBlockConstructor consobj=new StaticBlockConstructor();
	//static blocks of onstructor wont print by calling const here
//	StaticBlockConstructor.
	
				
	}

	static {
//		methodPrivateNOnStatic();////cant call non static to static block
		System.out.println("static block-2");
	}
	static {
		methodPrivatestatic();
		methodRandom();
		System.out.println("static block-3");
	}
	static void methodRandom() {
		int b=8;
		System.out.println("printing b"+ b);
	}
	private static void methodPrivatestatic() {
		System.out.println("something from privatstaticemehod");
	}
	private  void methodPrivateNOnStatic() {
		System.out.println("something from privatemehod");
	}

}
