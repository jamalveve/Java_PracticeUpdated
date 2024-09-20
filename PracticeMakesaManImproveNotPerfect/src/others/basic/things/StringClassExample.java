package others.basic.things;

public class StringClassExample {
	String nameofString = "abcnkjckj";

	void method() {
		nameofString.concat("jamal");
		System.out.println(nameofString);

		nameofString = nameofString.concat("jamal");
		System.out.println(nameofString);

		String s1 = "Sazhinee";
		String s2 = "Sazhinee";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);

		String s11 = "Sachin";
		String s22 = "SACHIN";

		System.out.println(s11.equals(s22));// false
		System.out.println(s11.equalsIgnoreCase(s22));// true

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));

		// concatenation
		String sachinename = "Sachin" + " Tendulkar";
		System.out.println(sachinename);

//		   he Java compiler transforms above code to this:
//			   String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
//			   In Java, String concatenation is implemented through the StringBuilder
//			   (or StringBuffer) class and it's append method. String concatenation
//			   operator produces a new String by appending the second operand onto the end of the
//			   first operand. The String concatenation operator can concatenate not only String
//			   but primitive values also. 

		String string3 = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s3);

		String string4 = s1.concat(s2);
		System.out.println();

		// string concat using string builder
		
		StringBuilder strings1 = new StringBuilder("Hello"); // String 1
		StringBuilder strings2 = new StringBuilder(" World"); // String 2
		StringBuilder strings3 = strings1.append(strings2); // String 3 to store the result
		System.out.println(strings3.toString()); // Displays result
		// string concat using format
		
		String strings4 = String.format("%s%s", strings1, strings2);

	}

}
