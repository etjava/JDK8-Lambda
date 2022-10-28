package com.etjava.jdk8;

/**
 * Lambda - ���Ű���
 * @author etjav
 *
 */
public class Lambda1 {
	public static void main(String[] args) {
		
		/*
		 * �޷���ֵ �޲���
		 */
		Cal1 c1 = ()->{
			System.out.println("Hello Lambda");
		};
		c1.test();
		
		/*
		 * �޷���ֵ ��һ������
		 * �βε����Ϳ���ʡ�� ���Զ��ƶ�������
		 */
		Cal2 c2 = (str)->{
			System.out.println(str);
		};
		c2.test("ETJAVA");
		
		/*
		 * �޷���ֵ �ж������
		 * �βε����Ϳ���ʡ�� ���Զ��ƶ�������
		 */
		Cal3 c3 = (a ,c) -> {
			System.out.println(a+c);
		};
		c3.test(10, 20);
		
		/*
		 * �з���ֵ �޲���
		 * �βε����Ϳ���ʡ�� ���Զ��ƶ�������
		 * ��������ֻ��һ����䲢����return��� {}��return�ؼ��ֶ�����ʡ��
		 */
		Cal4 c4 = ()-> "Hello Lambda";
		String str = c4.test();
		System.out.println(str);
		
		/*
		 * �з���ֵ ��һ������
		 */
		Cal5 c5 = (String s)-> s;
		String res2 = c5.test("Hello!");
		System.out.println(res2);
		
		/*
		 * �з���ֵ �ж������
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
 * �޷���ֵ �޲���
 */
@FunctionalInterface
interface Cal1{
	void test();
}

/*
 * �޷���ֵ ��һ������
 */
@FunctionalInterface
interface Cal2{
	void test(String str);
}

/*
 * �޷���ֵ �ж������
 */
@FunctionalInterface
interface Cal3{
	void test(int a,int b);
}

/*
 * �з���ֵ �޲���
 */
@FunctionalInterface
interface Cal4{
	String test();
}

/*
 * �з���ֵ ��һ������
 */
@FunctionalInterface
interface Cal5{
	String test(String str);
}

// �з���ֵ �ж������
@FunctionalInterface
interface Cal6{
	int test(int a,int b);
}
