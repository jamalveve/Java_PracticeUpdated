package method.hiding.ways;

import others.basic.things.VariablesAndMethodsMain;

public class MethodHidingWays {

	public static void main(String[] args) {

		ClassAnimal animalObj=new ClassAnimal();
		animalObj.sound();
		//by creating obj for parent class only parent method is visible
		animalObj.eat();
		
		ClassAnimal tigerObj=new Tiger();//upcasting here also calls parent method only due to reference is same 
		//as it is static,static are resolved based on the reference ,not in the instance and in compile time
		tigerObj.sound();
		//but this is achieved through overriding instance method so instance will be created
		tigerObj.eat();
		
		
		Tiger tigerobj2=new Tiger();
		//only by creating tiger object here instance is created for tiger so it shows the tiger method is visible
		tigerobj2.sound();
		
		tigerobj2.eat();
		
		
		
//		Example 2 for mainmethods
		
		MainmethodParentExample parentobj=new MainmethodParentExample();
//		parentobj.main(args);
		parentobj.main();

		
		
		MainmethodParentExample childobj=new MainmethodChildExample();
//		childobj.main(args);childobj
		childobj.main();

		
		//pthet check 
		

		
		
		

	}

}
 
