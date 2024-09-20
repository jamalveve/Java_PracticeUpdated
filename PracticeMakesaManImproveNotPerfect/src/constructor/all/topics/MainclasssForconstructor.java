package constructor.all.topics;

public class MainclasssForconstructor {
	private int values;
	private String names;
	private int ages;

	public MainclasssForconstructor(// default non static and public,protected ,and default //cangt be private
									// doesnot make sense
			int values, String names, int ages) {
		this.values = values;
		this.names = names;
		this.ages = ages;
		System.out.println("it is parametered consyryctror");

	}
	// if we keep any one cpnstructor as private we cant extend this constructor by
	// another chuild constructor
	// compiler error:
//	Implicit super constructor MainclasssForconstructor() is not visible. Must explicitly invoke another constructor
//	 static void MainclasssForconstructor(){no more a constructor it is method

	MainclasssForconstructor() {
		System.out.println("it is zero parameter consyryctror");
	}

	void display() {
		System.out.println(names + ages + values);
		System.out.println("i am from parent method");
	}

	static void checkmethod() {
		System.out.println("checkung teh static method inside consttuctor in parent class");
	}

	public static void main(String[] args) {

		MainclasssForconstructor obj1 = new MainclasssForconstructor(56, "jamal", 23);
		obj1.display();
		ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(5, "jamu", 28);
		obj2.display();
		ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample("jamu", 28);
		obj3.display();
		ConstructorOverloadingExample obj4 = new ConstructorOverloadingExample(5);
		obj4.display();
		System.out.println("-------------------------copy constructor--------------------");
		// creating an object of the class ABC
		// shllwo copy->object 1 and bj 2 are same refernce ->so one change will fect ll
		// the thingss
		ABC obj1shallow = new ABC();

		// it will copy the reference, not value
		ABC obj2shallow = obj1shallow;

		// updating the value to 6
		// using the reference variable obj2
		obj2shallow.x = 6;

		// printing the value of x using reference variable obj1
		System.out.println("The value of x is: " + obj1shallow.x);
		
		// deep copy->obj 1 and obj 2 are cmpletly in diffrence memory location so it
		// wont affect the exact object
		ABC obj1ss = new ABC();

		// it will copy the reference, not value
		ABC obj2ss = new ABC();

		// updating the value to 6
		// using the reference variable obj2
		obj2ss.x = 6;

		// printing the value of x using reference variable obj1
		System.out.println("The value of x is: " + obj1ss.x);

		CopyConstrutorExample actuallobj = new CopyConstrutorExample("software dev", 2);
		actuallobj.display();
		CopyConstrutorExample copyobj = actuallobj;
		copyobj.display();

//		MainclasssForconstructor.MainclasssForconstructor();

		ShallowCopyExample actualobj1 = new ShallowCopyExample("names", "adress");
		actualobj1.display();

		ShallowCopyExample actualobj2 = new ShallowCopyExample(actualobj1);
		actualobj2.display();
		// other way
		ShallowCopyExample actualobj3 = actualobj2;
		actualobj3.display();

		ShallowCopyExample actualobj4 = new ShallowCopyExample("jamal", "adrfn");
		actualobj4.display();

		System.out.println(actualobj1 == actualobj2);
		System.out.println(actualobj1 == actualobj3);
		System.out.println(actualobj2 == actualobj3);

		DeepCopyExample originalobj = new DeepCopyExample("namess", "jansnbbh");
		originalobj.displaydeep();
		DeepCopyExample deepcopyobjs1 = new DeepCopyExample("odiywutduzwg", "uiehyfihyihfh");
		deepcopyobjs1.displaydeep();
		DeepCopyExample deepcopyobjs2 = new DeepCopyExample(originalobj);
		deepcopyobjs2.displaydeep();
		System.out.println("----------------------------------------------------------------");
		// accesing overided method in comstructor
		// non static method
		MainclasssForconstructor mainobj = new MainclasssForconstructor();
		mainobj.display();// parent methid is viisble

		ConstructorOverloadingExample chilobj = new ConstructorOverloadingExample("jam", 5);
		chilobj.display();// child obj so child is visible

		MainclasssForconstructor upcastobj = new ConstructorOverloadingExample("jamy", 6);
		upcastobj.display();// child is visible
		upcastobj.checkmethod();// parent onlyb visible asit is static

		// constructor chaining in class level using this
		System.out.println("============const chaining child andsame class level=============");
		ConstructorChainingExample constchainobj = new ConstructorChainingExample();
		ConstructorChainingExample constchainobj1 = new ConstructorChainingExample("jamal",89);
		ConstructorChainingExample constchainobj2 = new ConstructorChainingExample("jam",78,6.7);
		ConstructorChainingExample constchainobj3 = new ConstructorChainingExample(45.7);

		// constructor chaining in superclass level using super
		System.out.println("============const chaining super andsame class level=============");

		System.out.println("---------------------------------------------------");
		SuperConstructorChaining superconstobj = new SuperConstructorChaining();
	//as it is private below line not possible
//		SuperConstructorChaining superconstobj1= new SuperConstructorChaining("jamal",89);

		SuperConstructorChaining superconstobj2 = new SuperConstructorChaining("jam",78,6.7);
		SuperConstructorChaining superconstobj3 = new SuperConstructorChaining(6.7);

		System.out.println("============constructor chaining child access check=============");

//		constchainobj.SuperConstructorChaining();//mnot possible

		// the above call will will not start from single param it start the constructor
		// from firts only
		
		System.out.println(constchainobj.superconstvar1);//possible
		
//		constructor of sub class is invoked when we create the object of subclass, 
		ConstructorChainingExample constchainobjchild = new ConstructorChainingExample();

		//, In Java, constructor of base class with no argument gets automatically called in derived class constructor.
//		it by default invokes the default constructor of super class.


	}

}
