package inheritance.types.ways;

public class ConstcHcek {

	public static void main(String[] args) {
		Ccons cobj=new Ccons();

	}

}
class Acons
{
    public Acons()
    {
        System.out.println("Class A Constructor");
    }
}
 
class Bcons extends Acons
{
    public Bcons()
    {
        System.out.println("Class B Constructor");
    }
}
 
class Ccons extends Bcons
{
    public Ccons()
    {
        System.out.println("Class C Constructor");
    }
}