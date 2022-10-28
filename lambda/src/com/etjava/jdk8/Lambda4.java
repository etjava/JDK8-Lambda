package com.etjava.jdk8;

/**
 * Lambda - 构造方法引用
 * @author etjav
 *
 */
public class Lambda4 {
	public static void main(String[] args) {
		// 无参构造方法引用
		CatService cat = ()->new Cat();
		System.out.println(cat.Init());
		// 无参构造方法引用 简化写法
		CatService cat2 = Cat::new;
		System.out.println(cat2.Init());
		
		
		// 有参构造方法引用 - 调用时必须传参
		CatService2 cat3 = Cat::new;
		System.out.println(cat3.Init("Tom",21));
		
	}
}

/*
 * 无返回值 无参数
 */
@FunctionalInterface
interface CatService{
	Cat Init();
}

@FunctionalInterface
interface CatService2{
	Cat Init(String name,int age);
}


class Cat{
	private String name;
	private int age;
	
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}

