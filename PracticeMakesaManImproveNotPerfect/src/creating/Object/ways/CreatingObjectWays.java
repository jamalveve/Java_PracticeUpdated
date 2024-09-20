package creating.Object.ways;

import java.lang.reflect.Constructor;

public class CreatingObjectWays {
  public static void main(String[] args) {
//	System.out.println("hello world");
	  //using new keyword
	  NewkeywordWay obj1=new NewkeywordWay(5," jamal");
	  obj1.method1("chello",2);
	  obj1.display();
	  
	  //using new instance
//	  try {
//	  Class<?> obj2=Class.forName("NewInstanceWay");
//	  NewInstanceWay myNewInstanceWay=(NewInstanceWay)obj2.newInstance();
//	  myNewInstanceWay.display2();
//	  }catch(Exception e) {
//		  e.printStackTrace();
//	  }//deprected after java 9 so use below
	  try {
	  Constructor<NewInstanceWay> constructor = NewInstanceWay.class.getConstructor();
	  NewInstanceWay myObject = constructor.newInstance();
	  myObject.display2();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }//throwing exception?
	  
	  
	  //using cloning
	  try {
	  CloningWay obj3=new CloningWay(9, "abi");
	  CloningWay clonedObj=(CloningWay)obj3.clone();
	  clonedObj.display3();
	  clonedObj.method3("kuty", 1); 
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  //using gactory method
	  FactoryMethodWay obj4 = WaytoFactory.createfactory("Honda Accord");
	  obj4.display(); 
	  
}
}
