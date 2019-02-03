package com.designPatterns.singleton;

public class Singleton {

	private volatile static Singleton singleInstance;
	private Singleton(){

	}
	public static Singleton getSingleInstance() {
		if(singleInstance == null){//Double check to make the synchronization cost at once
			synchronized(Singleton.class){//if multiple thread access
				if(singleInstance == null){//First check
					singleInstance = new Singleton();
				}
			}
		}
		return singleInstance;
	}

	public void DispMessge(){
		System.out.println("Hello");
	}


}
