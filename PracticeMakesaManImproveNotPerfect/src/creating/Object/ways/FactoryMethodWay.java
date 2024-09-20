package creating.Object.ways;
//This pattern encapsulates the object creation logic.
public class FactoryMethodWay {
	String model;

	FactoryMethodWay(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Car model: " + model);
    }
}




class WaytoFactory {
    public static FactoryMethodWay createfactory(String model) {
        return new FactoryMethodWay(model);
    }
}