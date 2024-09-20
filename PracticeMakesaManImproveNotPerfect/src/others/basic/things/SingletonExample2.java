//package others.basic.things;
//
//public class SingletonExample2 {
//
//	public static void main(String[] args) {
//		SingletonLazy singletonlazy1 = SingletonLazy.getInstances();
//		SingletonLazy singletonlazy2 = SingletonLazy.getInstances();
//		if (singletonlazy1 == singletonlazy2) {
//			System.out.println("Both objects are the same instance.");
//			System.out.println(singletonlazy1);
//			System.out.println(singletonlazy2);
//
//	}
//
//}
//class SingletonLazy {
//	private static SingletonLazy instances;
//
//	private SingletonLazy() {
//	}
//
//	public static synchronized SingletonLazy getInstances() {
//		if (instances == null) {
//			instances = new SingletonLazy();
//		}
//		return instances;
//	}
//}
//
