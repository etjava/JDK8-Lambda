package com.etjava.jdk8;

@FunctionalInterface
public interface MyInterface {

	// ���󷽷�
	public void init();
	
	// Ĭ�Ϸ���
	public default void exists() {}
	
	default Cat s() {
		return new Cat();
	}
	
	
	// ��̬����
	public static void empty() {}
	
	public static boolean empty2() {
		return false;
	}
}
