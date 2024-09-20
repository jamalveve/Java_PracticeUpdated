package primitivedata.Warpper.classs;

public class ExampleOne {

	public static void main(String[] args) {
   
		//when you read the data fro web ,UI everything will be string  so  need to convert from string to primitive
		//and when you send data to web ,UI everything need to be string and so need to convert from primitivedatatype to String
		//we will use it in colllection also
		System.out.println("--------------String ->Integer--------------------");
//		1)String to Integer
		String s1 = "welcome";

//		int parseint=Integer.parseInt(s1);
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "welcome"
//			at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//			at java.lang.Integer.parseInt(Integer.java:580)
//			at java.lang.Integer.parseInt(Integer.java:615)
//			at primitivedata.Warpper.classs.ExampleOne.main(ExampleOne.java:9)

//		bcz the string variabke contains all charactters it is npot possible 

		String s2 = "14245";
		String s3 = "3444";
		System.out.println(s2 + s3);// it will concat

		int parseint = Integer.parseInt(s2);
//		int parseintAdd=Integer.parseInt(s2+s3)//just concat;// not possible same exception 
		int parseintAdd = Integer.parseInt(s2) + Integer.parseInt(s3);// not possible same exception

		System.out.println(parseint);
		System.out.println("adding: " + parseintAdd);
		// or directlt
		System.out.println(Integer.parseInt(s2 + s3));// just concat

		// real scenario in automation testing
//		lets us say we have products  and prices (product 1,price1),(poduct 2,price 2),.....

		// we write automation data for reading the data of price to add
		// if we try to take from web application like above scenario it willl be string
		// and we need to cobert here
		System.out.println("--------------String ->double--------------------");
		String s4 = "0.66";
		String s5 = "0.46";
		double parseDouble = Double.parseDouble(s4);
		System.out.println(parseDouble);
		System.out.println(Double.parseDouble(s4) * Double.parseDouble(s5));

		System.out.println("--------------String ->Boolean--------------------");
		String s6 = "welcome";
		// not possible s6 above bcz boolean is only true or false
		// still if you try tp pas thw welcome it will return false
		boolean booleanParse = Boolean.parseBoolean(s6);
		String s7 = "True";
		boolean booleanParse1 = Boolean.parseBoolean(s7);
		String s8 = "False";
		boolean booleanParse2 = Boolean.parseBoolean(s8);
		System.out.println(booleanParse);
		System.out.println(booleanParse1);
		System.out.println(booleanParse2);
		
		System.out.println("--------------String ->Char--------------------");
		System.out.println("not possible");
		//not possible 
		//ncz we String is multiple characters and char us single char

		System.out.println("--------------Primitive ->String--------------------");
		//string is not a wrapper class
		
		int a=10;
		double b=0.45;
		char c='a';
		boolean boool=true;
		long d=7099;
		float f=98765f;
		//conevrt anydata type in to primitive 
//		String.valueOf(allprimitivedatatype);
		String s100=String.valueOf(a);
		String s101=String.valueOf(b);
		String s103=String.valueOf(c);
		String s104=String.valueOf(d);
		String s106=String.valueOf(f);
		String s105=String.valueOf(boool);
		
		System.out.println(s100);
		System.out.println(s101);
		System.out.println(s106);
		System.out.println(s103);
		System.out.println(s104);
		System.out.println(s105);
		
//		String to char->not possible
//		char to string->possoble
		//y bcz single char can also be a string
		
		char cr='a';
		String s107=String.valueOf(cr);
		System.out.println(s107);

		
	}
}
