package inheritance.types.ways;

public class Constcheck3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


 class Aclass
{
    public Aclass(int i)
    {
 
    }
    public Aclass()
	{
		//Either keep this constructor  to prevent error in line 25
	}
}
 
class Bclass extends Aclass
{
//	Class B doesn’t have any constructors written explicitly.
//So, compiler will keep default constructor. 
//	In that default constructor, there will be a calling statement to super class constructor (super()).
//	But, it is undefined in Class A.To remove the errors, 
//	either define A() constructor in class A or write B() constructor in class B and call super class constructor explicitly.
	public Bclass()
	{
		//or else keep a method and write this statement to prevent error in line 25
	super(10);  
	}
}
