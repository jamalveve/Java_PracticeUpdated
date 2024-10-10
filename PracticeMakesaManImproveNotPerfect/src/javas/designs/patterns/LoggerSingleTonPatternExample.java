package javas.designs.patterns;


public class LoggerSingleTonPatternExample {
	private static LoggerSingleTonPatternExample instance;

	private LoggerSingleTonPatternExample() {}

	public static synchronized LoggerSingleTonPatternExample getInstance() {
		if (instance == null) {
			instance = new LoggerSingleTonPatternExample();
		}
		return instance;
	}

	public void log(String message) {
		// Logic to log the message
		System.out.println(message);
	}
	
	public void log2() {
		// Logic to log the message
		System.out.println("some message from logger class"+ Thread.currentThread().getName());
//		System.out.println("some message from logger class");

	}
}
