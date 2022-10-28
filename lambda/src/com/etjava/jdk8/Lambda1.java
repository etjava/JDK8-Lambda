package com.etjava.jdk8;

/**
 * Lambda - 入门案例
 * @author etjav
 *
 */
public class Lambda1 {
	public static void main(String[] args) {
		
		/*
		 * 无返回值 无参数
		 */
		Cal1 c1 = ()->{
			System.out.println("Hello Lambda");
		};
		c1.test();
		
		/*
		 * 无返回值 有一个参数
		 * 形参的类型可以省略 会自动推断其类型
		 */
		Cal2 c2 = (str)->{
			System.out.println(str);
		};
		c2.test("ETJAVA");
		
		/*
		 * 无返回值 有多个参数
		 * 形参的类型可以省略 会自动推断其类型
		 */
		Cal3 c3 = (a ,c) -> {
			System.out.println(a+c);
		};
		c3.test(10, 20);
		
		/*
		 * 有返回值 无参数
		 * 形参的类型可以省略 会自动推断其类型
		 * 方法体中只有一条语句并且是return语句 {}和return关键字都可以省略
		 */
		Cal4 c4 = ()-> "Hello Lambda";
		String str = c4.test();
		System.out.println(str);
		
		/*
		 * 有返回值 有一个参数
		 */
		Cal5 c5 = (String s)-> s;
		String res2 = c5.test("Hello!");
		System.out.println(res2);
		
		/*
		 * 有返回值 有多个参数
		 */
		Cal6 c6 = (a,b)->{
			if(a!=0 && b!=0) {
				return a*b;
			}
			return 0;
		};
		int res4 = c6.test(0, 0);
		System.out.println(res4);
	}
}

/*
 * 无返回值 无参数
 */
@FunctionalInterface
interface Cal1{
	void test();
}

/*
 * 无返回值 有一个参数
 */
@FunctionalInterface
interface Cal2{
	void test(String str);
}

/*
 * 无返回值 有多个参数
 */
@FunctionalInterface
interface Cal3{
	void test(int a,int b);
}

/*
 * 有返回值 无参数
 */
@FunctionalInterface
interface Cal4{
	String test();
}

/*
 * 有返回值 有一个参数
 */
@FunctionalInterface
interface Cal5{
	String test(String str);
}

// 有返回值 有多个参数
@FunctionalInterface
interface Cal6{
	int test(int a,int b);
}
