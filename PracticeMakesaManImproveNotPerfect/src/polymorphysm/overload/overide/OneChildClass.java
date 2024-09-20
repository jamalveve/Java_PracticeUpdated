package polymorphysm.overload.overide;

public class OneChildClass extends MethodOverridingExample{
	
	@Override
	public void method1() {
		System.out.println("I am from child method");
	}
@Override
	public void method2() {
		System.out.println("I am from child method");
	}

public static void staticmethod3() {
	System.out.println("I am static method from child method");
}


public static void staticmethod4() {
	System.out.println("I am static method from child method");
}



	

}
