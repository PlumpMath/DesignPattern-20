package com.echo.singleton;

public class SingletonTwo {
	private SingletonTwo() {
		System.out.println("����ģʽ�еĹ��캯��");
	}
	private static SingletonTwo instance = null;
	public static synchronized SingletonTwo newInstance(){
		if(instance ==  null){
			instance = new SingletonTwo();
		}
		return instance;
	}

}
