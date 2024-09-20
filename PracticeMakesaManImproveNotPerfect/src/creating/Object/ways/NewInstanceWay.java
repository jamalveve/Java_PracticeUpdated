package creating.Object.ways;

public class NewInstanceWay {
	int value;
	String busy;
	
//	NewInstanceWay(int value,String busy) {
//    	this.value=value;
//    	this.busy=busy;
//    }
	//only possible for zero parameterised constructor
	void NewInstanceWay() {
    	this.value=value;
    	this.busy=busy;
    }
	
    void display2() {
    	System.out.println("method 1 prints name and integer:"+ value +busy);

    }


}
