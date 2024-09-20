package constructor.all.topics;

public class ConstructorOverloadingExample extends MainclasssForconstructor {
	
	 int values;
	private String names;
	protected int ages;
	public ConstructorOverloadingExample(//default non static and public,protected ,and default //cangt be private doesnot make sense
			 int values,
			 String names,
			 int ages){
		this.values=values;
		this.names=names;
		this.ages=ages;
		
	}
	protected ConstructorOverloadingExample(//default non static and public,protected ,and default //cangt be private doesnot make sense
			 int values){
		this.values=values;
		
		
	}
	 ConstructorOverloadingExample(//default non static and public,protected ,and default //cangt be private doesnot make sense
			 String names,
			 int ages){
		this.names=names;
		this.ages=ages;
		
	}
	 @Override
	void display() {
		System.out.println(names+ages+values);
		System.out.println("i am from child  method");

	}
	static void checkmethod() {
		System.out.println("checkung teh static method inside consttuctor in child class");
	}

}
