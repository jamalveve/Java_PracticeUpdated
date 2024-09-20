package creating.Object.ways;

public class CloningWay {
	int value;
	String busy;
	
	CloningWay(int value,String busy) {
    	this.value=value;
    	this.busy=busy;
    }
    void method3(String baby,int age) {
    	System.out.println("baby name is"+baby+ "and baby age is"+age);
    	
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
    void display3() {
    	System.out.println("method 1 prints name and integer:"+value +busy);

    }

}
