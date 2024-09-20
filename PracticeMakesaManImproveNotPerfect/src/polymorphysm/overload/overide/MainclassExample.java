package polymorphysm.overload.overide;

public class MainclassExample {

	public static void main(String[] args) {
		System.out.println("-------------------Method Overloading--------------------------");
		System.out.println("     ");
		
		MethodOVerloadingExample obj1=new MethodOVerloadingExample();
		MethodOVerloadingExample.display1();

		MethodOVerloadingExample.staticMethodOVerloading(6756);
		MethodOVerloadingExample.staticMethodOVerloading("jamal"," be cse",1453,7.70);
		MethodOVerloadingExample.staticMethodOVerloading("abi"," be civil",1675);
		MethodOVerloadingExample.staticMethodOVerloading("venky", 1789);
		
		obj1.display2();

		obj1.MethodOVerloading(6756);
		obj1.MethodOVerloading("jamal"," be cse",1453,7.7);
		obj1.MethodOVerloading("abi"," be civil",1675);
		obj1.MethodOVerloading("venky", 1789);
		System.out.println("     ");

		System.out.println("-------------------Method Overriding--------------------------");
		System.out.println("     ");
		
		MethodOverridingExample overideParentobj=new MethodOverridingExample();
		overideParentobj.method1();//non static so parent is visible
		OneChildClass overidechildobj=new OneChildClass();
		overidechildobj.method1();//non static and direct child obj so child is visible
		
		//cnt overide static ,final and private methods
		MethodOverridingExample overideparentobjUpcast=new OneChildClass();
		overideparentobjUpcast.method2();//not hiding bcz non static method//child visible
//		overideparentobjUpcast.method3();not [ossoble bcz no such method in parent class
		overidechildobj.staticmethod3();//prints child as it is a static method whicj is only in child
		overideparentobjUpcast.staticmethod4();//hiding the child as it os a static method in both the parent and child
		MethodOverridingExample overideparentobjUpcast2=overidechildobj;
		overideparentobjUpcast2.staticmethod4();//hides
		
	}

}