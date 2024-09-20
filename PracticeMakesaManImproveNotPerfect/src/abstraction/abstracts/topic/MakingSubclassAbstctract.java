package abstraction.abstracts.topic;

public abstract class MakingSubclassAbstctract {

	
	abstract void  newmethods1();
	abstract void newabtract2();
	public static void methods2absttt() {
		System.out.println("i am static methid from gthe abstract class");
	}
	private void privatemethodabstt() {
		System.out.println("iam private methid frorm abstact class");
	}
	private static void privatestaticmethodabstt() {
		System.out.println("private statoc");
	}
	final void methodabstt() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		
		methods2absttt();
		privatestaticmethodabstt();
//		ChildforAbstrct childclassobjs=new ChildforAbstrct();
		OneANothersubclass childclassobjs=new OneANothersubclass();
		//changing the child class
//		childclassobjs.privatemethodabstt();//not possible non static private method
		childclassobjs.methodabstt();
		PrivateMethodCheck.methodpro();
		
	}
	protected static void methodpro() {
		System.out.println("i ma pro method");
	}



	

}
//making this class abstract to avoid implementig all abtrsct method
abstract class ChildforAbstrct extends MakingSubclassAbstctract{

	abstract void  methodsss();
	@Override
	void newmethods1() {
		// TODO Auto-generated method stub
		
	}

	//not implemented all the astrct class
	
}
class OneANothersubclass extends ChildforAbstrct{

	@Override
	void newabtract2() {//grandparent
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodsss() {//parent
		// TODO Auto-generated method stub
		
	}
	
}
