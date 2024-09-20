package Interface.abstraction.ways;

public class InterfaceMainClass {

	public static void main(String[] args) {
//    InterfaceExample interfaceobj=new InterfaceExample() ;//not possible to instantiate
		Buses child1obj=new Buses();
		child1obj.abstractMethod1();
		child1obj.abstractMethod2("someting will give");
		Buses.methodssss();
		child1obj.methiods455();
		child1obj.methodpro();
		System.out.println("------------------------------------------------------");
		Autos child2obj=new Autos();
		child2obj.abstractMethod1();
		child2obj.abstractMethod2("someting else will give");
		child2obj.methodpro();
		Autos.methodssss();
		child2obj.methiods455();
		child2obj.methodpro();
		System.out.println("------------------------------------------------------");

		child2obj.protectednonstaticMethod2fromCLass();
		child2obj.nonStaticMethod4fromCLass();
		Autos.protectedstaticMethod1fromCLass();
		Autos.staticMethod3fromCLass();
		
//		InterfaceExample reference=new Buses();
//		reference.methiods455();//non static method
//		InterfaceExample.methodssss();
		
		
		
//		System.out.println("------------------------other doubt----------------------------------");
//		Example1 example1obj=new Example1();
//		example1obj.method124();
//		Example1.method123();
//		
//		
//		Example2 example2obj=new Example2();
//		example2obj.method124();
//		Example2.method123();
//		
		
	
	
	}

}
