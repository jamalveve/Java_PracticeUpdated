package encapsulation.data.hiding;

public class MainclassforEncaps {

	public static void main(String[] args) {
		EncapsulationExample encapsobj=new EncapsulationExample();
		encapsobj.setStudentMarks(89);
		encapsobj.setStudentNames("venky");
		System.out.println(encapsobj.getStudentMarks());
		System.out.println(encapsobj.getStudentNames());
		encapsobj.getStudentNames();
		
		
		 //creating instance of Account class  
	    AccountExample acc=new AccountExample();  
	    //setting values through setter methods  
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Sonoo Jaiswal");  
	    acc.setEmail("sonoojaiswal@javatpoint.com");  
	    acc.setAmount(500000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	}

}
