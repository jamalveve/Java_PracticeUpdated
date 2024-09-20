package inheritance.types.ways;

 class A1
{
 void m11() {
     System.out.println("m1 in class A");	 
 }
}
class B1 extends A1
{
  void m11() {
     super.m11();
     System.out.println("m1 in class B");
  }
}
class C12 extends B1 
{
   void m11() {
      System.out.println("m1 in class C"); 
      super.m11();
   }
 }
public class Test2 {
public static void main(String[] args)
{
    C12 c = new C12();
     c.m11();//here //m1 in class C
//     
//     B1 b=new B1();
//     b.m11();//m1 in class a and then m1 in class b bcz od super
     
  }
}