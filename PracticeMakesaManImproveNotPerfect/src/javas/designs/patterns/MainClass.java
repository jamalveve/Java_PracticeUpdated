package javas.designs.patterns;

import java.lang.reflect.Constructor;

public class MainClass {

	public static void main(String[] args) {
		
		
		SingleTonPattern instance1=SingleTonPattern.getInstance();
		SingleTonPattern instance2=null;
		
		try {
		Constructor<SingleTonPattern> constructor =SingleTonPattern.class.getDeclaredConstructor();
//		This line retrieves the private constructor of the SingleTonPattern class. Normally, this constructor cannot be accessed from outside the class.
		constructor.setAccessible(true);
//		This line allows access to the private constructor. By setting it accessible, you can bypass the visibility rules of Java.
		instance2=constructor.newInstance();
//		This line creates a new instance of SingleTonPattern using the accessible constructor. 
//		If the Singleton pattern is correctly implemented, this should normally not be possible, as there should only be one instance.
		
		//to avoid this type of bypassing the rule go the constructor and do some conditional check there
		System.out.println(instance1.hashCode());

		System.out.println(instance2.hashCode());


		}catch(Exception e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
//		SingleTonPattern obj=new SingleTonPattern();//not possible

//		SingleTonPattern.getInstance().display();

		// try to acess by multiple threads

//		Runnable task=() ->{
//			SingleTonPattern.getInstance().display();
//
//		};
		
//		
		Runnable taskEnum = () -> {
			EnumSingleton.INSTANCE.someMethod();
		};

//		Thread thread1 = new Thread(task);
//		Thread thread2 = new Thread(task);
//		Thread thread3 = new Thread(task);
//		Thread thread4 = new Thread(task);
//		Thread thread5 = new Thread(task);
//		
		Thread thread1 = new Thread(taskEnum);
		Thread thread2 = new Thread(taskEnum);
		Thread thread3 = new Thread(taskEnum);
		Thread thread4 = new Thread(taskEnum);
		Thread thread5 = new Thread(taskEnum);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		// waiting for all threads to complete
//		try {
//			thread1.join();
//			thread2.join();
//			thread3.join();
//			thread4.join();
//			thread5.join();
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}

		// Logger example
		// way like above:

		Runnable Loggerask = () -> {
			LoggerSingleTonPatternExample.getInstance().log2();
//
		};

		// Create multiple threads using the same Runnable task
		Thread threads1 = new Thread(Loggerask, "Thread 1 logss");
		Thread threads2 = new Thread(Loggerask, "Thread 2 logss");
		Thread threads3 = new Thread(Loggerask, "Thread 3...");
		Thread threads4 = new Thread(Loggerask, "Thread 4...");
		Thread threads5 = new Thread(Loggerask, "Thread 5.......");

		// Start all threads
		threads1.start();
		threads2.start();
		threads3.start();
		threads4.start();
		threads5.start();

		LoggerSingleTonPatternExample.getInstance().log("somee logger message");

		// way using classes
		Thread threads = new Thread(new LogTask("Message from thread "));
		threads.start();

		Thread threadss2 = new Thread(new LogTask("Message from 2nd thread "));
		threadss2.start();

		Thread threadss3 = new Thread(new LogTask("Message from 3rd thread "));
		threadss3.start();

	}

}

class LogTask implements Runnable {
	private final String message;

	public LogTask(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		LoggerSingleTonPatternExample logger = LoggerSingleTonPatternExample.getInstance();
		logger.log(message);
	}
}
