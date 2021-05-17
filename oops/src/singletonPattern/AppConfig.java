/* Singleton Pattern is mostly used in multi-threaded and database applications.It is used in
 * logging, caching, thread pools, configuration settings etc.*/

package singletonPattern;

public class AppConfig {

	private AppConfig() {
		
	}
	
	private static AppConfig obj = new AppConfig();
	
	public static AppConfig getInstance() {
		
		return obj;
		
	}

}
