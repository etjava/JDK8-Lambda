package com.etjava.jdk8;

@FunctionalInterface
public interface MyInterface {

	// 抽象方法
	public void init();
	
	// 默认方法
	public default void exists() {}
	
	default Cat s() {
		return new Cat();
	}
	
	
	// 静态方法
	public static void empty() {}
	
	public static boolean empty2() {
		return false;
	}
}
