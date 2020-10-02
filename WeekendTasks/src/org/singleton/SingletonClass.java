package org.singleton;

public class SingletonClass {

	private static SingletonClass instance = null;
	public static String inpstr;

	private SingletonClass() {
		inpstr = "This is a Singleton Class";
	}
	
	
	
	public static SingletonClass getInstance() {

		if (instance == null)
			instance = new SingletonClass();
		return instance;

	}

}
