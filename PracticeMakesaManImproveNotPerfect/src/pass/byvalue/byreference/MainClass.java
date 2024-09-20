package pass.byvalue.byreference;

public class MainClass {

	public static void main(String args[]) {

		Mug myMug = new Mug("tea"); // myMug contains "tea"
		System.out.println(myMug.getContents());

		Mug.spill(myMug); // myMug now contains "nothing"
		System.out.println(myMug.getContents());
System.out.println("============================================================");
//		String localcontent = "juice";
//		System.out.println(localcontent);
//
//		Jug.spilled(localcontent); // myMug now contains "nothing"
//		System.out.println(localcontent);
		System.out.println("============================================================");


		Balloon red = new Balloon("Red"); // memory reference = 50
		Balloon blue = new Balloon("Blue"); // memory reference = 100
		// objevt creation

		swap(red, blue);
		System.out.println("After the swap method executes:");
		System.out.println("`red` color value = " + red.getColor());
		System.out.println("`blue` color value = " + blue.getColor());

		changeValue(blue);
		System.out.println("After the changeValue method executes:");
		System.out.println("`blue` color value = " + blue.getColor());

	}
	
//	Object o1 = new Balloon("Blue"); 
//	Object o2 = new Balloon("Red");

	// Generic swap method//just reference so wont create any object so o1//memory
	// refrence =50 =memory referemnce=100 only
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

//here it is craeted as object 
	private static void changeValue(Balloon balloon) { // balloon = 100//same ref
		balloon.setColor("red"); // balloon = 100//same refre
		balloon = new Balloon("Green"); // balloon = 200->herenew object ->new memory
//		Any further methods executed on the balloon variable act upon the object at memory location 200, 
		balloon.setColor("Blue"); // balloon = 200

//		The third line changes the color value of the new Balloon object at memory location 200 
//		to "Blue", but does not affect the original object referenced by blue at memory location 100

//	thatshow the final line of the example program output prints blue color value = Red, 
//?hich reflects the change from line 1.
	}

}
