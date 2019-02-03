package com.designPatterns.singleton;

public class SingleMain {

	public static void main(String[] args) {
		Singleton single =  Singleton.getSingleInstance();
		single.DispMessge();
	}

}
