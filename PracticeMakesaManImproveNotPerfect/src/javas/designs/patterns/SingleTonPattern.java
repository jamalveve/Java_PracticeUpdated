package javas.designs.patterns;

public class SingleTonPattern {
//  way 1  (stnchronized keyword alomg with the method->
//	way  2 double check loging->
//	wwhy singleton pattern
//	so we are going to create the object of the class or instantiate the class only one time
	/// it emasnwe cnat create multiple obj
	// mve the obj is created only one copy is sahred among alll the threads

	// 3 steps
//	->private static instance variable of the class
//	->private constructor
//	->public static oneGetmethod

	// starts-----------------------------------------------------------

	private static SingleTonPattern variable;

	private SingleTonPattern()  {
		if (variable != null) {
			throw new NullPointerException("object not exists");//preventing object creation(rule bypass)
		}
	}

//	public synchronized static  SingleTonPattern getInstance() { instead of this below if condition 
//	/bcz we want to make the class instantiate one time not the control over the multiple threads even though multiple threads come 
	// we should make the class obj crated once thats why we are doing condition
	// check synchronized not the method
	public static SingleTonPattern getInstance() {
		// one more if condition
		if (variable == null) {
			synchronized (SingleTonPattern.class) {
				if (variable == null) {
					variable = new SingleTonPattern();
				}
			}
		}
		// if(variable==null) {
		// variable=new SingleTonPattern();
		// }

		return variable;
	}// ->//so when mutiple theread comes to access this ->only for one thread it
		// will not be null and object can be created
//	when the second thread come it will get null and get the same copy of the first thread and all the reaminng threads also same
//	so inorder to avoid threads coming simoulatenusly we have to do thread management 
	// here we can use synchronized keyword also for thread safety and manage to let
	// the thread
	// come one by one at the same time but line num21
//	

//	along with this we can have public static method if we need
	// ,ay be some display method

	public static void display() {
		System.out.println("something from singleTon class");
	}

	// way 2 Eager Initialization:->
	// starts-----------------------------------------------------------

//	private static final SingleTonPattern instance = new SingleTonPattern();
//
//	private SingleTonPattern() {
//	}
//
//	public static SingleTonPattern getInstance() {
//		return instance;
//	}

}

//this also fine
