# JDK8-Lambda
Lambda 表达式
## Lambda表达式是JDK8.0 新特性，Lambda是针对<font color=red>函数式接口</font>编程
### 函数式接口即一个接口中有且仅有一个抽象方法 或使用@FunctionInterface注解的接口 为函数式接口

# Lambda表达式语法格式
## '->' 是Lambda操作符 也叫做箭头操作符
### -> 左侧是形参列表 (接口中的抽象方法的形参列表)
#### lambda形参列表的参数类型可以省略(类型推断)，如果lambda形参列表只有一个参数，其一对()也可以省略

### -> 右侧是方法体 (需要重写的抽象方法的方法体)
#### lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），省略这一对{}和return关键字
## (int a,int b) -> { return a+b; };  // (a,b) -> a+b;
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

# Lambda表达式 - 使用场景
**Lambda表达式是面向接口编程的，那么在接口中的方法会存在如下特点**<br>
#### 无返回值无参数，无返回值有参数(1个或多个参数) ，有返回值无参数 ，有返回值(1个或多个参数)
**无返回值无参数**<br>
```
@FunctionalInterface
interface Cal1{
  void test();
}
// lambda调用接口
Cal1 c1 = ()->{
  System.out.println("Hello Lambda");
};
c1.test();
```
**无返回值有一个参数**<br>
```
@FunctionalInterface
interface Cal2{
  void test(String str);
}
// lambda调用接口
Cal2 c2 = (str)->{
  System.out.println(str);
};
c2.test("ETJAVA");
```
**无返回值有多个参数**<br>
```
@FunctionalInterface
interface Cal3{
  void test(int a,int b);
}
// lambda调用接口
Cal3 c3 = (a ,c) -> {
  System.out.println(a+c);
};
c3.test(10, 20);
```
**有返回值无参数**<br>
```
@FunctionalInterface
interface Cal4{
  String test();
}
// lambda调用接口 只有一条语句且是return时 {}和return关键字可以省略
Cal4 c4 = ()-> "Hello Lambda";
String str = c4.test();
System.out.println(str);
```
**有返回值有一个参数**<br>
```
@FunctionalInterface
interface Cal5{
  String test(String str);
}
// lambda调用接口 只有一条语句且是return时 {}和return关键字可以省略
Cal5 c5 = (String s)-> s;
String res2 = c5.test("Hello!");
System.out.println(res2);
```
**有返回值有多个参数**<br>
```
@FunctionalInterface
interface Cal6{
  int test(int a,int b);
}
// lambda调用接口
Cal6 c6 = (a,b)->{
  if(a!=0 && b!=0) {
    return a*b;
  }
  return 0;
};
int res4 = c6.test(0, 0);
System.out.println(res4);
```
# Lambda 方法引用
## 当同一个方法(接口中的抽象方法)被多次调用时 可以封装成通用方法
### 封装成通用方法的前提是方法的业务逻辑必须相同(业务逻辑不同不能使用通用方法，没有封装的意义)

## 语法：
### 对象::方法  
### 如果是静态方法  类名::方法
```
@FunctionalInterface
interface Cal7{
  int test(int a);
}
// 直接调用方法1
Cal7 c = a -> a+3; // 相当于 (a)->{return a+3;};
System.out.println(c.test(3));
// 直接调用方法2
Cal7 c = a -> a+3; // 相当于 (a)->{return a+3;};
System.out.println(c.test(3));

// 将接口中的test方法封装成通用方法 因为他们的业务逻辑都是返回a+3的结果
int testA(int a) {
  return a+3;
}
// 调用通用方法
lambda3 l = new lambda3();
Cal7 c2 = l::testA;
Cal7 c3 = l::testA;
Cal7 c4 = l::testA;
c2.test(10);

// 封装成静态方法
static int testC(int j) {
  return j+3;
}
// lambda调用静态方法
Cal7 c5 = lambda3::testC;
Cal7 c6 = lambda3::testC;
Cal7 c7 = lambda3::testC;
c7.test(9);


```


