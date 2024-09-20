
public class TypCastingPrimitiveDatatypes {
//upcasting->lowyer to higher->automatic prpcess
	// Ex:
//	int-->long
//	int--->double
//	float-->double
//	downcasting->hihyer to lowyer-manual process
	// Ex:
//	long--.>int
//	double--->float
	//double--->int
//	
	public static void main(String[] args) {

		
		int a=100;
		float b=a;
		System.out.println(b);
		
		long value=8908765432L;
		int value2=(int)value;
		System.out.println(value2);

		double value3=8.90;
		float vlaue4=(float) value3;
		System.out.println(vlaue4);
		
		//in case of
		double value5=809876543456789.90;
		//and if ttry to do casting to float defietly float cant hold data will be missing
		float vlaue6=(float) value5;
		System.out.println(vlaue6);
		

	}

}
