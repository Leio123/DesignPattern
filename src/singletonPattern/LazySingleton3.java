package singletonPattern;
/*
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * */
public class LazySingleton3 {

	private static LazySingleton3 instance;
	private LazySingleton3() {}
	
	public static LazySingleton3 getInstance() {
		if (instance == null) {
			synchronized (LazySingleton3.class) {
				if (instance == null) {
					instance = new LazySingleton3();
				}
			}
		}
		return instance;
	}
	
}
