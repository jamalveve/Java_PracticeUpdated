package string.builder.buffer;

import java.util.Arrays;

public class WhyStringImMutable {

	public static void main(String[] args) {
//
		String[] arrayStr = { "hlo", "I am", "from", "universe" };
		System.out.println(Arrays.toString(arrayStr));

		int[] arrayint = { 20, 40, 10, 4, 87 };
		System.out.println(Arrays.toString(arrayint));

//		lets change --->arrays are mutable
		Arrays.sort(arrayStr);
		Arrays.sort(arrayint);

		System.out.println(Arrays.toString(arrayStr));
		System.out.println(Arrays.toString(arrayint));

		// lets come to string

		String s2 = "welcome";
//		s2.concat("to my home");	///--->this  is y string is immutable	
		String Concatstr = s2.concat("to my home");
		// it wont change until you store it in someother string and you have to pringt

		System.out.println(s2);
		System.out.println(Concatstr);
//		string womt let the actuall varoale mutable 

	}

}
