package com.echo.adaper;
/*
 * ���ü̳з�ʽ�Ĳ���������
 */

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.print("�����̳�������");
		this.powerWithTwo();
	}

}
