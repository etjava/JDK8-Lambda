package com.etjava.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda - 构造方法引用
 * @author etjav
 *
 */
public class Lambda5 {
	public static void main(String[] args) {
		
		List<Cat2> list = new ArrayList<>();
		list.add(new Cat2("Tom",12));
		list.add(new Cat2("Jerry",11));
		list.add(new Cat2("Lily",10));
		list.add(new Cat2("Andy",15));
		list.add(new Cat2("Judy",19));
		
		// @FunctionalInterface
		// public interface Comparator<T> 
		list.sort((o1,o2)-> o1.getAge()-o2.getAge());
		System.out.println(list);
		
		// 遍历list 直接打印内容
		list.forEach(System.out::println);
		
	}
}



class Cat2{
	private String name;
	private int age;
	
	public Cat2() {
		super();
	}
	public Cat2(String name, int age) {
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

