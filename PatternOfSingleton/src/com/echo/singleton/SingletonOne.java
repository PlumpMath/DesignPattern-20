package com.echo.singleton;

/*
 * �����ĵ���ģʽ��Lazyģʽ�����̰߳�ȫ
 * �ŵ㣺lazy������ʹ��ʱʵ����������������Դ�˷�
 * ȱ�㣺1��lazy�����ʵ����ʼ���ǳ���ʱ����ʼʹ��ʱ�����������������
 *     2�����̰߳�ȫ�����߳��¿��ܻ��ж��ʵ������ʼ����
 */
public class SingletonOne {
	
	//˽�л����췽������֤�ⲿ�಻��ͨ��������������
	private SingletonOne() {
		System.out.println("����ģʽ�еĹ��캯��");
	}
	
	//����ʵ������
	private static SingletonOne instance = null;
	
	//��ȡ��������ʵ��
	public static SingletonOne newInstance(){
		if(instance ==  null){
			instance = new SingletonOne();
		}
		return instance;
	}
}
