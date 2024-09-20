package type.casting.primAndObj;

public class TypeCastingWIthObjects {

	public static void main(String[] args) {
		

		Child c = new Child();
		c.m2();
		c.m1();
		System.out.println(c.vars);
		System.out.println(c.ab);
		System.out.println("=======Up casting=======");

		Parents p1 = new Child();// smaller obj to higher obj->upcasting
		System.out.println(p1.vars);
//		System.out.println(p1.ab);//cant access
		p1.m1();
//		p1.m2();//cant access
		System.out.println("=======down casting=======");
		Parents p2=new Parents();
		Child child=(Child)p2;//no compiler error but run time exception
		
		System.out.println(child.ab);
		System.out.println(child.vars);
		child.m1();
		child.m2();

		
	}

}

class Parents {
	protected double vars = 67.9;

	void m1() {
		System.out.println("method from parent 1");
	}
}

class Child extends Parents {
	int ab = 156;

	void m2() {
		System.out.println("method from child");
	}
}