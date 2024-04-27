package creational;

/**
 * A design pattern which restricts the creation of an object to just 1 per jvm
 * For e.g. -> When you need a single DB connection in the whole application. Loggers.
 * Practically we can think of it as -> There is only 1 president of a country.
 */

public class Singleton {
	
	private static volatile Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}
