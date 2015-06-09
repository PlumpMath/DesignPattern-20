package com.echo.singleton;

/*
 * ���javaƽ̨�ڴ�ģ�͡�����д������
 */
public class SingletonFour {
	private SingletonFour(){}
	private static SingletonFour instance = null;
	private static SingletonFour getInstance(){
		if (instance == null) {
			synchronized (SingletonFour.class) {
				SingletonFour temp = instance;
				if(temp == null){
					synchronized (SingletonFour.class) {
						temp = new SingletonFour();
					}
					instance = temp;				
				}
			}			
		}
		return instance;
	}
}
