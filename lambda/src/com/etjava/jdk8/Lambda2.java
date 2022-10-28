package com.etjava.jdk8;

/**
 * Lambda 基本使用(包含简化)
 * @author etjav
 *
 */
public class Lambda2 {
	public static void main(String[] args) {
		// 未使用Lambda 调用接口进行计算
		Cal c = new Cal() {
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		};
		int res = c.calc(1, 2);
		System.out.println("result = "+res);
		
		/**
		 * 小括号中是接口的参数内容 使用箭头符号连接 
		 * 花括号中是方法体
		 */
		Cal c2 = (int a ,int b) -> {
			return a+b;
		};
		System.out.println("lambda "+c2.calc(1, 2));
		
	}
}

// 计算接口
interface Cal{
	int calc(int a,int b);
}
