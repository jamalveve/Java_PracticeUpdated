package abstraction.abstracts.topic;

public abstract class PrivateMethodCheck {
//	private abstract void  privabsrt();not possibke
	abstract void  methods1();
	abstract void methodsabtract2();
	public static void methods2() {
		System.out.println("i am static methid from gthe abstract class");
	}
	private void privatemethod() {
		System.out.println("iam private methid frorm abstact class");
	}
	private static void privatestaticmethod() {
		System.out.println("private statoc");
	}
	final void method() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		
		methods2();
		PrivateMethodCheck.privatestaticmethod();
		OneChildclassforAboveParentClass childclassobjs=new OneChildclassforAboveParentClass();
//		childclassobjs.privatemethod();//not possible non static private method
		childclassobjs.method();
		PrivateMethodCheck.methodpro();
		
	}
	protected static void methodpro() {
		System.out.println("i ma pro method");
	}

}
class OneChildclassforAboveParentClass extends PrivateMethodCheck{

	@Override
	void methods1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodsabtract2() {
		// TODO Auto-generated method stub
		
	}
	
}
