# JDK8-Lambda
Lambda 表达式

# Lambda表达式语法格式
## (int a,int b) -> { return a+b; };
```
// 未使用Lambda 调用接口进行计算
Cal c = new Cal() {
	@Override
	public int calc(int a, int b) {
		return a+b;
	}
};
int res = c.calc(1, 2);
System.out.println("result = "+res);

/* 使用Lambda表达式
 * 小括号中是接口的参数列表 使用箭头符号连接 花括号中是方法体
 */
Cal c2 = (int a ,int b) -> {
	return a+b;
};
System.out.println("result2 =  "+c2.calc(1, 2));
		
-------------------------------------------------------------------------------------		

// 计算接口
interface Cal{
  int calc(int a,int b);
}
```

# Lambda表达式 - 语法细节
**Lambda表达式是面向接口编程的，那么在接口中的方法会存在如下特点**
**无返回值并且无参数**
**无返回值并且有一个参数**
**无返回值并且有多个参数**
**有返回值无参数**
**有返回值有一个参数**
**有返回值有多个参数**
