package com.echo.singleton;

public class Singleton {
	private Singleton(){
		System.out.println("����ģʽ�Ĺ��캯��");
	}
	private static Singleton instance = new Singleton();
	public static Singleton newInstance(){
		return instance;
	}
}
