package inheritance.types.ways;

public class ConstCHeck2 {

	public static void main(String[] args) {
Ycons yobj=new Ycons();
	}

}
class Xcons
{
    public Xcons(int i)
    {
        System.out.println(1);
    }
//    public Xcons()//errror wont come now////this will also prevent the compiler error in line 26
//    {
//        System.out.println(2);
//    } // or 
    
}
 
class Ycons extends Xcons
{
    public Ycons()//it is aasking to have a xero para cons in parent also
    {
    	super(10);//this will prevent the compiler error in line 26
        System.out.println(3);
    }
}
