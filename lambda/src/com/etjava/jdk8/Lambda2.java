package com.etjava.jdk8;

/**
 * Lambda ����ʹ��(������)
 * @author etjav
 *
 */
public class Lambda2 {
	public static void main(String[] args) {
		// δʹ��Lambda ���ýӿڽ��м���
		Cal c = new Cal() {
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		};
		int res = c.calc(1, 2);
		System.out.println("result = "+res);
		
		/**
		 * С�������ǽӿڵĲ������� ʹ�ü�ͷ�������� 
		 * ���������Ƿ�����
		 */
		Cal c2 = (int a ,int b) -> {
			return a+b;
		};
		System.out.println("lambda "+c2.calc(1, 2));
		
	}
}

// ����ӿ�
interface Cal{
	int calc(int a,int b);
}
