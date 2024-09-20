package thisandsuper.statement.keyword;

public class OneMainClassExample extends Libaries {

	OneMainClassExample method() {
		return this;
	}
	public static void main(String[] args) {

		StudentExample constobj=new StudentExample("active",4.5f,"jamal");
		constobj.method();
		
		StudentExample constobj1=new StudentExample("jamal","something");
		StudentExample constobj2=new StudentExample("jamu","something else");
		StudentExample constobj3=new StudentExample("jamyyy","nothing");
	    System.out.println(constobj.active);
	    System.out.println(constobj.methods().active);

	    
		
		
		
		ChildClassforStudent childobj = new ChildClassforStudent();
		childobj.method();//if yu=ou call this method constructor method-> parameter wont come if want have to 
		//print like in the line  number 8 then only constructor method  will print
		childobj.parmeterisedMethod(4, 5);//this is printong from constructor method bcz of super statement
		childobj.display();
		System.out.println("---------------------------------------------------");
		ChildClassforStudent childobjs = new ChildClassforStudent(6);
		
		childobjs.methodfoObj(childobjs);
		childobjs.methodfoObj(constobj);
		Object obj=new Object();
		childobjs.methodfoObj(obj);
		
		OneMainClassExample mainclassChildobj = new OneMainClassExample();
//		mainclassChildobj.methodextraPrivate(this);//not possible
		mainclassChildobj.books();
		mainclassChildobj.letters();
		Libaries.newsPpers();
		mainclassChildobj.BooksRack(45);
		mainclassChildobj.display();
		
		System.out.println(mainclassChildobj.isFalse());
		System.out.println(mainclassChildobj.isTrue());
		
		mainclassChildobj.method().display();
		mainclassChildobj.method().BooksRack(5);
		
//		constobj.methods().s
		
		
	}

//	super.letter();not possible like this
	private void display() {
		super.books();
		System.out.println("fetching the bookscount from super class: " + super.bookscount);
		method2(this);
	}

	public boolean isTrue() {
		super.forms();
		boolean result = super.istrue;
		methodextraPrivate(this);
		return result;
		
	}

	public boolean isFlase() {
		boolean result = super.isFalse();
		return result;
	}
	
	//passing a this inside method implememtation //passing this in display method above
     protected void method2(OneMainClassExample reference) {
    	 System.out.println("void method take class and refrence as parameter");
		
	}
	private void methodextraPrivate(OneMainClassExample refer) {
		this.isFalse();
   	 System.out.println("private method take class and refrence as parameter");
   	
   	 
	}

}

//class level=super keyword
class Libaries {
	int bookscount = 10;
	boolean istrue = true;// varivable vice

	public boolean isFalse() {// method vice
		return false;
	}

	protected void BooksRack(int booksRack) {
		System.out.println("there are " + booksRack + " bookkracks in this library");
	}

	void books() {
		System.out.println("books are in library");

	}

	protected void letters() {
		System.out.println("letter are threre in libary");
	}
	public static void forms() {
		System.out.println("formms from libaray");
	}

//	
//	private void newsPpers() { 
//		System.out.println("newspapers are threre in libary");
//
//	}//no use
	static void newsPpers() {
		System.out.println("newspapers are threre in libary");
	}
    
}
//class ConstructorExample extends OneMainClassExample{
//	ConstructorExample(){
//		super(3);//it is asking to create a constructor for onemainexample class
//	}
//}
