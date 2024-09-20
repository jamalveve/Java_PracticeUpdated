package others.basic.things;

public class SingletonClassExample {
	public static void main(String[] args) {
		SingletonEager singleton1 = SingletonEager.getInstance();
		SingletonEager singleton2 = SingletonEager.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("Both objects are the same instance.");
			System.out.println(singleton1);
			System.out.println(singleton2);

			SingletonLazy singletonlazy1 = SingletonLazy.getInstances();
			SingletonLazy singletonlazy2 = SingletonLazy.getInstances();
			if (singletonlazy1 == singletonlazy2) {
				System.out.println("Both objects are the same instance.");
				System.out.println(singletonlazy1);
				System.out.println(singletonlazy2);

			}
		}
	}

}
//eager 1

class SingletonEager {
	private static SingletonEager instance;

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		if (instance == null) {
			instance = new SingletonEager();
		}
		return instance;
	}
}

//lazy 2
class SingletonLazy {
	private static SingletonLazy instances;

	private SingletonLazy() {
	}

	public static synchronized SingletonLazy getInstances() {
		if (instances == null) {
			instances = new SingletonLazy();
		}
		return instances;
	}
}
