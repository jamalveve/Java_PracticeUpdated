package inheritance.types.ways;

public class SingleInheritanceExample extends MainCladssInheritance {//parent

	protected void Bus() {
		System.out.println("we can drive BUs");
		
	}
	 void  Buffalo() {
		System.out.println("i am scared to Buffalow");
	}
	@Override
	public void commons() {
		System.out.println("it is common nonstatic from child and can overide in subchild");
	}
	
	public static void commonsstatic() {
		System.out.println("it is commons static from child we can overide in sub child");
	}//it is not an overided method bcz static meti=hod cant be overided
	
	
}//multilevel inheritance
class ChildClassExample extends SingleInheritanceExample{
	
	public void cars() {
		System.out.println("i can drive car nicely");
		Buffalo();
	}
	
	public void husband() {
		System.out.println("all husbands are animals");
	}
	@Override
	public void commons() {
		System.out.println("it is common I am overided method in child sub class");
	}
	
	
	public static void commonsstatic() {
		System.out.println("it is commons static from child subclass");
	}
	
	
}
