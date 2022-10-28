package com.etjava.jdk8;

/*
 * Lambda - 方法引用
 */
public class Lambda3 {
	public static void main(String[] args) {
		
		Cal7 c = a -> a+3; // 相当于 (a)->{return a+3;};
		System.out.println(c.test(3));
		
		Lambda3 l = new Lambda3();
		Cal7 c2 = l::testA;
		Cal7 c3 = l::testA;
		Cal7 c4 = l::testA;
		c2.test(10);
		
		Cal7 c5 = Lambda3::testC;
		Cal7 c6 = Lambda3::testC;
		Cal7 c7 = Lambda3::testC;
		c7.test(9);
		
	}
	// 封装成通用方法
	int testA(int a) {
		return a+3;
	}
	
	// 封装成静态方法
	static int testC(int j) {
		return j+3;
	}
}


// 有返回值 有多个参数
@FunctionalInterface
interface Cal7{
	int test(int a);
}
