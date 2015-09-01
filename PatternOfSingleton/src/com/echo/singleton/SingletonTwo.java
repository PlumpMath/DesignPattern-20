package com.echo.singleton;

/*
 * ͬ������ �ĵ���ģʽ��Lazyģʽ���̰߳�ȫ
 * �ŵ㣺
 * 1��lazy������ʹ��ʱʵ����������������Դ�˷�
 * 2���̰߳�ȫ
 * ȱ�㣺
 * 1��lazy�����ʵ����ʼ���ǳ���ʱ����ʼʹ��ʱ�����������������
 * 2��ÿ�ε���getInstance()��Ҫ���ͬ�������������ġ�
 */
public class SingletonTwo {
	private SingletonTwo(){}
	private static SingletonTwo instance= null;
	public static synchronized SingletonTwo getInstance(){
		if(instance == null)
			instance = new SingletonTwo();
		return instance;
	}
}
