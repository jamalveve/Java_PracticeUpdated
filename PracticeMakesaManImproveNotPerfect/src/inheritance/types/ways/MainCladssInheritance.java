package inheritance.types.ways;

public class MainCladssInheritance {
	public void vechicles() {
		System.out.println("we can drive fast");
		
	}
	public void animals() {
		System.out.println("i am scared to animals");
	}
	
	public void commons() {
		System.out.println("it is common we can ovveride in child");
	}
	
	public static void commonsstatic() {
		System.out.println("it is commons static method from parent");
	}
	
   public static void main(String[] args) {
	//single inheritance
	   
	   MainCladssInheritance parentobj=new MainCladssInheritance();
	   
	   //basicall we cant get the child property to parent property
	   parentobj.vechicles();
	   parentobj.animals();
	   
//	   we can get the parent property to child property
	   SingleInheritanceExample childobj=new SingleInheritanceExample();
	   childobj.animals();
	   childobj.Buffalo();
	   childobj.Bus();
	   childobj.vechicles();
	   
	   System.out.println("check casting");
	   childobj.commons();
	   
	   System.out.println("printing childobj.staticmethod is printing child static");
	   childobj.commonsstatic();//we can hide the parent by making it static method
	   
	   
	    //basically doing upcasting we wil bget the parent methods and variables only unlesss we overide
	   //if we do upcast fro parent obj
	   MainCladssInheritance refernce=childobj; 
	   refernce.commons();//as we are passingv the child reference and it is non static child is visible
	   refernce.commonsstatic();//parent only
	   
	   MainCladssInheritance upcastobj=new SingleInheritanceExample(); 
	   //the method bus and bffalo is not visible
	   System.out.println("checking casting");
	   upcastobj.commons();//as it is non static overrided method child is visible
	   parentobj.commonsstatic();//caalimg parent obj. method parent is visbile
//	   SingleInheritanceExample childobj1=parentobj;//not possible
	   //making it static parent is visible and child is hiding
	   System.out.println("upcasting and calling static method print parent");
	   upcastobj.commonsstatic();//as it is static overoded mthod,parnet is comming 
	   
	   System.out.println("--------------------------------------------------------------------");
	   //multilevel inheritance
	   ChildClassExample subchild=new ChildClassExample();
	   subchild.animals();
	   subchild.Buffalo();
	   subchild.husband();
	   
	   subchild.vechicles();
	   subchild.cars();
	   subchild.Bus();
	   
	   MainCladssInheritance subclassupcastobj=new ChildClassExample();
	   subclassupcastobj.animals();
	   subclassupcastobj.commons();//child visible
	   subclassupcastobj.commonsstatic();//parnet visible
	   
	   SingleInheritanceExample subclassupcastobj1=new ChildClassExample();
	   subclassupcastobj1.commons();//child visible
	   subclassupcastobj1.commonsstatic();//parnet visible
		   
	   
	   
	   
}
}
