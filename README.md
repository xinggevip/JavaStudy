# JavaStudy

## 1.CMD

- cmd运行可执行文件，程序会先找当前文件路径的程序，如果找不到则会在环境变量path中找

## 2.java 基本数据类型

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。

因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

Java 的两大数据类型:

- 内置数据类型
- 引用数据类型

### 2.1.1内置数据类型

- byte
- short
- int
- long
- float
- double
- boolean
- char

## 3.Java 对象和类

Java作为一种面向对象语言。支持以下基本概念：

- 多态
- 继承
- 封装
- 抽象
- 类
- 对象
- 实例
- 方法
- 重载

## 4.Java面向对象

### 4.1Java继承

#### 4.1.1类的继承格式

在 Java 中通过 extends 关键字可以申明一个类是从另外一个类继承而来的，一般形式如下：

```java
class 父类 {
}

class 子类 extends 父类 {
}
```

#### 4.1.2继承的特性

-  子类拥有父类非 private 的属性、方法。
-  子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
-  子类可以用自己的方式实现父类的方法。
-  Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C  类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
-  提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
- 默认继承object

#### 4.1.3继承关键字 

继承可以使用 extends 和 implements 这两个关键字来实现继承，而且所有的类都是继承于 java.lang.Object，当一个类没有继承的两个关键字，则默认继承object（这个类在 **java.lang** 包中，所以不需要 **import**）祖先类。

https://www.runoob.com/java/java-inheritance.html

### 4.2Java多态

https://www.runoob.com/java/java-polymorphism.html

父类定义为抽象类，子类必须重写父类方法

### 4.3Java抽象类

**抽象方法：**

在方法前加abstract

特点：
1.抽象方法没有方法体

2.抽象方法必须定义在抽象类中或接口中，在类名前加上abstract就成了抽象类

3.抽象方法不能被private，final修饰，不能同时使用static

什么时候使用：

子类必须覆盖此方法

在定义的时候不要方法体了

**抽象类：**

1.必须要有抽象方法

2.子类必须重写抽象方法

3.抽象类是不能直接创建对象的

4.抽象类构造方法不能是私有的

5.抽象类不能被final修饰，一旦使用final修饰，其他类将不能继承该类

6.抽象类中可以有抽象方法，也可以有非抽象方法（给子类调用的）

7.子类不能覆盖抽象类的抽象方法，把子类也变成抽象类，子类可以把重写抽象方法的任务交给孙类

（抽象类就像一个领导人，把任务布置下来，交给下级部门实现，下级部门实现不了，再把它交给下下级别）

其实是一个不完整的类，需要作为一个父类，子类才能完成相应的功能

抽象类命名时，都喜欢再前面加上一个Abstract

**普通类与抽象类的区别：**

抽象类你有的方法，字段，构造器，抽象类都有

抽象类不能创建对象，抽象类可以包含抽象方法，也可以包含非抽象类

抽象类必须有子类才有意义

### 4.4Java接口

**描述**：再Java中，接口表示一种规范/约束/要求实现者必须遵循该规范用来约束使用者该怎么做

**需要**：接口、接口实现类，对象

**概念**：表示一种规范，按照规范来，具有了某一种能力

​			java接口表示一种规范，使用抽象方法定义一组功能，必须要实现者给提供方法实现

**命名**：前面加上I后面加上able



接口它其实是一个特殊的抽象类，内部全是抽象方法，如果没有在方法前加abstract，编译器会自动给加上

**接口注意点**：

1.接口没有构造器，接口不能创建对象

2.接口中可以定义变量，都是全局的静态常量，编译器自动在前面加上public static final

3.接口定义的方法都是公共的抽象的

4.接口当中可以定义内部类，内部类也是公共的抽象的

5.接口可以多继承，类不可以

6.接口继承的死后，不会去覆盖父接口的方法

**接口的实现**：

类命extends 父类(只能继承一个类) implements 其他的接口(接口可以实现多个)

在实现类中必须要去覆盖接口中定义的方法

实现的方法必须得是public

**接口和抽象类的区别：**

1.接口是没有构造器的，抽象类当中是有构造器的

2.抽象类可以包含抽象方法和非抽象方法，接口只能有抽象方法，不能有普通方法（带有方法体）

3.接口当中默认成员变量，public static final 变量;=>静态常量	抽象类中默认是包访问权限

4.方法，接口当中默认方法，public abstract 方法名;	抽象类 默认包访问权限

**面向接口编程：**

把实现类变量赋值给接口类型变量

多态的好处：屏蔽了不同类之间实现差异，从而达到通用编程

USB设备进行工作

## 5.修饰符

**访问修饰符：**

| 修饰符      | 当前类 | 同一包内 | 子孙类(同一包) | 子孙类(不同包)                                               | 其他包 |
| :---------- | :----- | :------- | :------------- | :----------------------------------------------------------- | :----- |
| `public`    | Y      | Y        | Y              | Y                                                            | Y      |
| `protected` | Y      | Y        | Y              | Y/N（[说明](https://www.runoob.com/java/java-modifier-types.html#protected-desc)） | N      |
| `default`   | Y      | Y        | Y              | N                                                            | N      |
| `private`   | Y      | N        | N              | N                                                            | N      |

**非访问修饰符：**

**final**：

字段：不能再去修改该字段

方法：子类不能再去覆盖该方法

类：该类将不能被继承

final 修饰字段时，是没有初始值的，要手动设置初始值

final 修饰变量，就代表一个常量  命名规则，所有字母都大写MAZ_VALUE

final 可以在局部代码块中使用

只能用，不能修改



如果final修饰的是基本数据类型代表值不能修改

如果final修饰的是引用数据类型代表地址不能改变

**static**：

- **静态变量：**

  static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。

- **静态方法：**

  static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。

## 6.设计模式

**设计模式：之前很多程序员经过无数尝试，总结出来一逃最佳实践**

### 6.1单例设计模式

**一个类在内存当中只有一个对象，别人不能再去创建对象**

实例：

做一个工具类：

饿汉模式

1.必须要在该类中创建一个对象

2.私有化自己的构造器，防止别人通过构造器创建新的对象

3.给外界提供一个方法，能够获取自己已经创建好的对象

## 7.包装类

### 7.1包装类

对基本数据类型进行包装，把基本数据类型包装成一个对象=>装箱操作

把基本数据类型变得更强大，以面向对象的思想使用这些类型

| 基本数据类型 | 包装类    |
| ------------ | --------- |
| byte         | Byte      |
| short        | Short     |
| int          | Integer   |
| long         | Long      |
| float        | Float     |
| double       | Double    |
| char         | character |
| boolean      | Boolean   |

### 7.2装箱

```java
// 装箱操作的两种方法
int a = 10;
Integer num1 = new Integer(a);// 参数可以是String，但只能包含数字
Integer num2 = Integer.valueOf(a);// 参数可以是String，但只能包含数字
System.out.println(num1.TYPE);// int
System.out.println(num2);// 10
```



### 7.3拆箱

基本数据类型 变量名 = 包装类变量.基本数据类型value;

```java
// 拆箱
Integer num2 = Integer.valueOf(10);
int num3 = num2.intValue();
```

### 7.4自动装箱

其他类型也是此写法

```java
// 自动装箱
Integer i = 10;// 编译器编译为Integer i = Integer.valueOf(10);这是语法糖
```

### 7.5自动拆箱

其他类型也是此写法

```java
Integer i = 10;
// 自动拆箱
int num4 = i;
```

### 7.6包装类转字符串

无论是什么类型的包装类，直接调用toString();就可以转成字符串型了;

### 7.7基本数据类型转字符串

变量加个空串

```java
int i = 0;
String str2 = i + "";
```

### 7.8把字符串转成基本数据类型

基本数据类型标识 变量名 = 包装类.parse基本数据类型标识(str);

```java
String str3 = "100";
int num2 = Integer.parseInt(str3);
```

### 7.9字符串转Boolean

传"true"为true，传其他值均为false

```java
Boolean b = new Boolean("a");
System.out.println(b);// false
Boolean b1 = new Boolean("true");
System.out.println(b1);// true
```

### 7.10获取变量数据类型：

getClass();

http://qiangssvip.com/index.php/archives/362/

### 7.11基本数据类型和包装类型的区别：

**1.默认值**

int			0

Integer 	null	(0和null的区别就像是考试考了0分和缺考)

**2.包装类提供了很多方法直接供我们使用**

**3.集合框架当中不能直接存放基本数据类型**

**什么时候使用基本数据类型，什么时候使用包装类型？**

- 在类当中，成员变量一般都使用
- 在方法当中，我们一般都使用基本数据类型

方法中，基本数据类型存储在栈当中，包装类型都存储在堆当中

==比较的是地址

equals比较的是值



### 7.12包装类缓存设计：

```java
// 包装类valueOf()缓存设计
Integer n1 = new Integer(123);
Integer n2 = new Integer(123);
System.out.println(n1 == n2);// false比较两个值的地址

Integer n3 = Integer.valueOf(123);
Integer n4 = Integer.valueOf(123);
System.out.println(n3 == n4);// true （最小值-128，最大值127）这个区间比较为true

Integer n5 = Integer.valueOf(223);
Integer n6 = Integer.valueOf(223);
System.out.println(n5 == n6);// false
```

## 8.内部类

**内部类：定义在类当中的一个类**

### 为什么要使用内部类？

1.增强封装，把内部类隐藏在外部类当中，不允许其他类访问

2.增加了代码的维护

3.内部类可以直接访问外部类当中的成员

**内部类可以分四种：**

- 实例内部类：直接定义在类当中的一个类，在类前没有任何一个修饰符
- 静态内部类：在内部类加上一个static
- 局部内部类：定义在方法的内部类
- 匿名内部类：属于局部类内部类的一种特殊情况

外部类的修饰符只能有两种：
public  或者  默认值

内部类可以使用很多修饰符

### 8.1实例内部类：

属于对象的内部类，不属于类的，不使用static修饰的内部类

想要使用内部类，必须使用外部类

在内部类当中可以访问外部类成员

在内部类当中不能有静态成员

```java
class Outter{// 外部类
	String name = "OutterStr";
	
	class Inner{// 内部类
		// 不能有静态成员
		String name = "InnerSTr";
		void test() {
			String name = "TestStr";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outter out = new Outter();
        // 创建内部类
        // 创建内部类当中，会有外部类引用
		Outter.Inner in = out.new Inner();
		in.test();

	}

}
```

![1567777554782](https://raw.githubusercontent.com/xinggevip/JavaStudy/master/SRC/imgs/1567777554782.png)

### 8.2静态内部类：

在内部类前面加上static

静态内部类是不需要创建外部对象

在静态内部类当中，没有外部类引用

静态内部类，是可以访问外部类的静态成员

访问静态内部类当中的静态成员Outter.Inner.color

静态内部类可以定义静态成员，也可以定义非静态成员

```java
class OutterTwo{
	static String name = "OutterStr";
	int age = 10;
	static class Inner{
		static String color = "red";
		void test() {
			System.out.println(name);
			System.out.println(new OutterTwo().age);// 内部类访问外部类
			System.out.println(color);
		}
	}
}

public class InnerStatic {

	public static void main(String[] args) {
		// 创建对象
		OutterTwo.Inner in = new OutterTwo.Inner();
		in.test();
		System.out.println(OutterTwo.Inner.color);

	}

}
```

### 8.3局部内部类：

定义在方法中的内部类

1.不能使用一些修饰符public、private

2.局部内部类只能在定义的方法中使用

3.局部内部类中是不能定义静态变量的

4.局部内部类中可以包含局部变量，使用的局部变量编译器默认使用final修饰    常量

```java
class Outter{
	static String Name = "hh";
	int age = 10;
	//private final String name = "myxq";
	void myxq () {
		String name = "myxq";// 编译器会编译成上面那句注释
		class Inner{
			void test () {
				System.out.println(name);
			}
		}
		Inner in = new Inner();
		in.test();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter ou = new Outter();
		ou.myxq();
		
	}

}
```

### 8.4匿名内部类：

匿名内部类没有构造器，一个文件对应一个类

匿名内部类只有使用一次的时候，来去使用匿名内部类

```java
package 面向对象.内部类.匿名内部类;

interface IUsbable{
	void swapData();
}

class MainBoard{
	void use(IUsbable device) {
		device.swapData();
	}
}

class Mouse implements IUsbable{

	public void swapData() {
		System.out.println("移动鼠标");
	}
	
}

class Key implements IUsbable{


	public void swapData() {
		System.out.println("输入数据");
	}
	
}

public class TestUsb {

	public static void main(String[] args) {

		MainBoard zhuban = new MainBoard();
		IUsbable m = new Mouse();
		IUsbable k = new Key();
		zhuban.use(m);
		zhuban.use(k);
		zhuban.use(new IUsbable() {
			// 匿名内部类
			public void swapData() {
				System.out.println("设备工作");
			}
		});
		

	}

}

```

## 9.枚举

表示一个时间固定状态

java 枚举：是一个特殊的类，多个常量对象的集合

```java
[修饰符] enum 枚举名称 {
	常量1，常量2，常量3...
}
```

枚举是一个特殊的类，不能直接创建对象

```java
package 面向对象.枚举;

import org.w3c.dom.NamedNodeMap;

// 定义星期类
// 定义学生类
//class WeekDay{
//	public static final WeekDay MONDAY = new WeekDay();
//	public static final WeekDay TUESDAY = new WeekDay();
//	public static final WeekDay WEDNESDAY = new WeekDay();
//	public static final WeekDay THURSDAY = new WeekDay();
//	public static final WeekDay FRIDAY = new WeekDay();
//	public static final WeekDay SATURDAY = new WeekDay();
//	public static final WeekDay SUNDAY = new WeekDay();
//}

enum WeekDay{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

enum Sex{
	NAN,NV;
}

class Student{
	private WeekDay restDay;

	public WeekDay getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay restDay) {
		this.restDay = restDay;
	}
	
}


public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRestDay(WeekDay.SUNDAY);
		if (s.getRestDay() == WeekDay.SATURDAY || s.getRestDay() == WeekDay.SUNDAY) {
			System.out.println("放假了");
		}else {
			System.out.println("没有放假");
		}
		
		System.out.println(Sex.NAN);// 默认调用.name()
		System.out.println(Sex.NAN.name());
		// ordinal()返回位置
		System.out.println(Sex.NAN.ordinal());
		System.out.println(Sex.NV.ordinal());
		
		// 配合switch
		switch (Sex.NAN) {
		case NAN:
			System.out.println("是NAN");
			break;
		case NV:
			System.out.println("是NV");
			break;

		default:
			break;
		}
		
		System.out.println("--------------");
		// 遍历枚举
		Sex[] allres = Sex.values();
		for (Sex sex : allres) {
			System.out.println(sex);
		}
		
		System.out.println(allres[0]);
		
		// 字符串转枚举   报错为解决  https://blog.csdn.net/u010667011/article/details/83545813   https://blog.csdn.net/tplina/article/details/87984558
//		Sex S = Sex.valueOf("BOYYYYY");
//		System.out.println(S);
		

	}

}

```

## 10.常用类

### 10.1String

#### 10.1.1常用方法

```java
package 面向对象.常用类.String;

public class ZhuanString {

	public static void main(String[] args) {
		// char[] 转 String
		char[] cs = {'a','b','c','d'};
		String str1 = new String(cs);
		System.out.println(str1); // abcd
		
		// String 转 char[]
		char[] cs2 = str1.toCharArray();
		System.out.println(cs2); // abcd
		
		// 字符串常用方法
		// 根据下标找字符
		char cs3 = str1.charAt(0);
		System.out.println(cs3);
		// 根据字符串找下标,首次出现的位置
		int num1 = str1.indexOf("cd");
		System.out.println(num1);
		// 根据字符找下标,最后一次出现的位置
		int num2 = str1.lastIndexOf("d");
		System.out.println(num2);
		// 转大写
		System.out.println(str1.toUpperCase());
		// 转小写
		String str3 = "ABCDEF";
		System.out.println(str3.toLowerCase());
		// 不区分到小写比较
		
		String s1 = "ab";
		String s2 = "AB";
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}

```

#### 101.2获取以hello开头的文件名的后缀名

```java
package 面向对象.常用类.String;

import java.lang.reflect.Array;
import java.util.Arrays;

import 面向对象.内部类.局部内部类.Test;

/**
 * fileName.split(";");  // 分割成数组
 * name.startsWith("hello");  // 判断是否以指定字符开头
 * name.lastIndexOf('.');  // 获取指定字符最后出现的位置
 * name.substring(index); // 获取指定位置往后所有的字符，两个参数为获取指定位置之间的字符
 * str1.trim();  // 去掉收尾空格
 * str1.replace(" ", "") // 把指定字符替换成指定字符  实现去掉所有空格
 * @author xingge
 *
 */

public class StringDemo {
	public static void test() {
		// 获取以hello开头的文件名的后缀名
		String fileName = "abc.java;hello.myxq;hello.text.java;hello.class";
		// 分割成数组
		String[] strArr = fileName.split(";");
		System.out.println(Arrays.toString(strArr));
		for (String name : strArr) {
//			System.out.println(name);
			// 判断是不是以hello开头
			if (name.startsWith("hello")) {
				System.out.println(name);
				// 获取最后一个字符','的位置
				int index = name.lastIndexOf('.');
				// 获取最后一个点往后的所有字符
				String newName = name.substring(index);
				System.out.println(newName);
			}
		}
		
	}

	public static void main(String[] args) {
		test();
		// 去掉空格
		// 去掉首位空格
		// 去掉中间的空格
		String str1 = " Hello word ";
		System.out.println(str1.trim());
//		System.out.println(str1.trim().replace(" ", ""));
		System.out.println(str1.replace(" ", ""));
		

	}

}

```

#### 10.1.3字符串拼接性能

```java
package 面向对象.常用类.String;

/**
 * normalString(); // 167
 * stringBuffer(); // 1       方法前多了一个synchronized  加锁         更加安全
 * stringBuilder(); // 0      没有synchronized            效率更高
 * 
 * 字符串拼接性能
 * 
 * @author xingge
 *
 */



public class StringBuilderBufferDemo {
	
	static void normalString() {
		long oldTime = System.currentTimeMillis();
		
		String str = "";
		for(int i = 0;i < 10000;i++){
			str += i;
		}
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
		
	}
	
	static void stringBuilder() {
		long oldTime = System.currentTimeMillis();
		
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
		
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
	}
	
	static void stringBuffer() {
		long oldTime = System.currentTimeMillis();
		
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
		
		
		long newTime = System.currentTimeMillis();
		long resTime = newTime - oldTime;
		System.out.println(resTime);
	}

	public static void main(String[] args) {
		
		normalString(); // 167
		stringBuffer(); // 1
		stringBuilder(); // 0
		
	}

}

```

#### 10.1.4StringBuilder

```java
package 面向对象.常用类.String;

public class StringBuilderDemo {
	static void test() {
		
		// 这两句话都是一样的，16为默认字符长度，添加字符自动给扩容
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder(16);
		
		// 普通字符串转StringBuilder
		StringBuilder str3 = new StringBuilder("Hello");
		
		// StringBuilder 转普通字符串
		String str4 = str3.toString();
		
		// 添加字符串,可以添加任意类型
		str3.append(" world");
		System.out.println(str3); // Hello world
		
		// 删除指定位置的字符串
		str3.deleteCharAt(0);
		System.out.println(str3); // ello world
		
		// 删除指定范围的字符串
		str3.delete(0, 2);
		System.out.println(str3); // lo world
		
		// 字符串反转
		str3.reverse();
		System.out.println(str3); // dlrow ol
		
		
	}

	public static void main(String[] args) {
		test();

	}

}

```

### 10.2System

#### 10.2.1拷贝数组

```java
package 面向对象.常用类.System类数组拷贝;

import java.util.Arrays;
/**
 * src - 原数组
 * srcPos - 原数组的开始下标
 * dest - 目标数组
 * destPos - 目标数据中的开始下标
 * length - 要复制的数组元素数量
 * @author xingge
 *
 */

public class ArrayCopy {

	public static void main(String[] args) {
		int[] src = {1, 2, 3, 4, 5, 6 };
		int[] dest = new int[10];
		System.arraycopy(src, 2, dest, 2, 4);
		System.out.println(Arrays.toString(src)); // [1, 2, 3, 4, 5, 6]
		System.out.println(Arrays.toString(dest)); // [0, 0, 3, 4, 5, 6, 0, 0, 0, 0]
	}

}

```

#### 10.2.2代码耗时、退出、回收

```java
package 面向对象.常用类.System类计算代码耗时;

public class SystemMethods {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("我被java虚拟机回收了");
	}

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		System.out.println("代码总耗时：" + time3);
		
		// 运行垃圾回收，java虚拟机自己有的垃圾回收机制，这句话可以立即执行垃圾回收一般不会主动调用该方法
		SystemMethods s = new SystemMethods();
		new SystemMethods();// 地址没有被引用就会变成垃圾
		System.gc();
		
		// 终止当前正在运行的java虚拟机
		System.exit(0);// 0 为正常退出，非0为异常退出
		System.out.println("---------");

	}

}


//代码总耗时：48
//我被java虚拟机回收了
```

### 10.3大精度

#### 10.3.1BigDecimal&&BigINteger

```java
package 面向对象.常用类.BigDecimal大精度类;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigDecimal {

	public static void main(String[] args) {
		// double folt 计算有误差
		System.out.println("0.09 + 0.01 = " + 0.09 + 0.01); // 0.09 + 0.01 = 0.090.01
		
		// BigDecimal 大十进制，参数传字符串才可以得到想要的结果  计算无误差
		BigDecimal num1 = new BigDecimal("0.09");
		BigDecimal num2 = new BigDecimal("0.01");
		System.out.println( num1.add(num2) ); // 0.10
		
		// BigInteger 大整形，可以计算超过Long的范围  可计算超大数据
		BigInteger num3 = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger num4  = BigInteger.valueOf(10);
		
		System.out.println(num3); // 9223372036854775807
		System.out.println(num3.add(num4)); // 9223372036854775817
		
	}

}
```

### 10.4日期

#### 10.4.4Date

```java
package 面向对象.常用类.Date;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		// 1.直接new一个Date
		Date d1 = new Date();
		System.out.println(d1);// Mon Sep 09 13:00:29 GMT+08:00 2019 获取当前的时间
		
		// 2.把毫秒转换成日期
		Long l1 = System.currentTimeMillis();
		Date d2 = new Date(l1);
		System.out.println(d2);// Mon Sep 09 13:00:29 GMT+08:00 2019
		
		// 3.中国日期风格
		String s1 = d2.toLocaleString(); // 2019-9-9 13:00:29
		System.out.println(s1);
		
		// 4.把日期转换成毫秒
		System.out.println(d2.getTime()); // 1568005229764

	}

}

```

#### 10.4.2日期格式化

```java
package 面向对象.常用类.Date;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParseException.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	static void test() throws ParseException {
		// 创建一个日期
		Date time = new Date();
		System.out.println(time); // Sun Sep 08 17:48:18 GMT+08:00 2019

		// 格式化日期
		DateFormat df1 = DateFormat.getInstance();
		String time1 = df1.format(time);
		System.out.println(time1); // 19-9-8 下午5:48

		// 格式化日期  等同于上面的写法
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String time2 = df2.format(time);
		System.out.println(time2); // 19-9-8 下午5:48

		// 格式化日期
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		String time3 = df3.format(time);
		System.out.println(time3); // 2019年9月8日 下午05时48分18秒
		
		// 只获取时间
		DateFormat df4 = DateFormat.getTimeInstance();
		String time4 = df4.format(time);
		System.out.println(time4); // 13:05:27
		
		// 把字符串转成日期
		DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		Date date2 = df5.parse(time1);
		System.out.println(date2); // Mon Sep 09 13:05:00 GMT+08:00 2019
		
		// 自定义格式
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy年MM月dd");
		String time6 = df6.format(time);
		System.out.println(time6); // 2019年09月09
		
		// 自定义格式
		SimpleDateFormat df7 = new SimpleDateFormat();
		String pattern = "YYYY";
		df7.applyPattern(pattern);
		String time7 = df7.format(time);
		System.out.println(time7); // 2019
		
	}

	public static void main(String[] args) throws ParseException {
		test();
		
	}

}

```

#### 10.4.3日期工具类设计

```java
package 面向对象.常用类.Date;

import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 封装日期类
 * @author xingge
 *
 */

class DateUtil{
	private DateUtil() {};
	private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	// 日期转字符串  两个参数
	public static String dateToString(Date dade,String pattern) {
		
		if(pattern == null || pattern.equals("")) {
			pattern = DEFAULT_PATTERN;
		}
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(pattern);
		String res = df.format(dade);
		
		return res;
	}
	
	// 日期转字符串  一个参数
	public static String dateToString(Date date) {
		return dateToString(date, "");
	}
	
	// 字符串转日期  两个参数
	public static Date StringToDate(String str,String pattern) throws ParseException {
		
		if(pattern == null || pattern.equals("")) {
			pattern = DEFAULT_PATTERN;
		}
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(pattern);
		Date date = df.parse(str);
			
		return date;
	}
	
	// 字符串转日期  一个参数
	public static Date StringToDate(String str) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern(DEFAULT_PATTERN);
		Date date = df.parse(str);
			
		return date;
	}
	
	
}

public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String reString = DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss");
		System.out.println(reString); // 2019-09-09 13:07:53
		
		String reString2 = DateUtil.dateToString(new Date(), "");
		System.out.println(reString2); // 2019-09-09 13:07:53
		
		String reString3 = DateUtil.dateToString(new Date());
		System.out.println(reString3); // 2019-09-09 13:07:53
		
		Date date = DateUtil.StringToDate("2019-09-08 22:00:17", "yyyy-MM-dd HH:mm:ss");
		System.out.println(date); // Sun Sep 08 22:00:17 GMT+08:00 2019
	}

}

```

### 10.5Math类

```java
package 面向对象.常用类.Math类;

/**
 * 有关数学的操作在手册搜Math
 * @author xingge
 *
 */

public class TestMath {

	public static void main(String[] args) {
		// 最大值
		int res = Math.max(10, 20);
		System.out.println(res); // 20
		
		// 随机数 Math.random()  范围是[0,1)
		// 0 - 100
		int sj = (int)(Math.random()*100 + 1);
		System.out.println(sj);
		
		// 开根
		double kg = Math.sqrt(81);
		System.out.println(kg); // 9

	}

}

```

### 10.6Random&&UUID

#### 10.6.1生成随机数和UUID

```java
package 面向对象.常用类.Random类;

import java.rmi.server.UID;
import java.util.Random;
import java.util.UUID;

public class TestRandom {
	static void test() {
		Random res = new Random();
		int num = res.nextInt();
		System.out.println(num); // -788547064
		
		System.out.println(res.nextDouble()); // 0.9793465472334298
		System.out.println(res.nextBoolean()); // false
		
		System.out.println("------------------");
		
		// 相同的种子，生成的随机数是一样的
		Random r = new Random(10);
		System.out.println(r.nextInt()); // -1157793070
		
		// 随机生成34 - 179之间的数
		//                      生成0-145之间的数,不包括145
		int num2 = new Random().nextInt(145) + 34;
		System.out.println(num2); // 167
		
		System.out.println("------------------");
		// 生成UUID
		// UUID：通用唯一标识符
		// 当前的时间，跟当前电脑的网卡，生成一段字符
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid); // 444cde57-1a04-4be6-afb7-700907b435d4
		
		
 		
	}

	public static void main(String[] args) {
		test();

	}

}

```

#### 10.6.2生成五位数验证码

```java
package 面向对象.常用类.Random类;

import java.util.Random;

public class RandomCode {
	static  void CreatCode() {
		// 生成5位数验证码
		
		// 创建验证码字符串
		String sum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sum = sum + sum.toLowerCase();
		sum = sum + "0123456789";
		
		// 生成验证码
		StringBuilder code = new StringBuilder(5);
		for(int i = 0;i <= 5; i++) {
			// 生成0-sum长度中其中一个数
			int index = new Random().nextInt(sum.length());
			// 取一个数
			char c = sum.charAt(index);
			// 把数添加进字符串
			code.append(c);
		}
		System.out.println(code); // kxBJEt
		
	}

	public static void main(String[] args) {
		CreatCode();

	}

}

```

## 11.集合

集合

就是存放数的容器



数组：长度固定，不能添加元素

java集合提供的集合类：长度可以改变，能存放任意对象，长度随着元素的增加而增加



数组和集合的区别？

1.数组能存放基本数据类型和引用类型

2.集合当中只能存放引用数据累心给，直接放，会自动转成对象

3.数组长度是固定的，不能增加，集合可以



什么时候用数组，什么时候用集合？

1.元素个数固定，推荐使用数组

2.元素个数不固定，推荐使用集合

快捷键：alt+shift+r  多游标修改

​				ctrl+shift+o  导包

![]([https://raw.githubusercontent.com/xinggevip/JavaStudy/master/SRC/imgs/集合.png))

### 11.1List

有序可重复

ArrayList:查找快，增删慢

LinkedArrayList:查找慢，增删块

Vector:和ArrayList功能一致，但比AyyayList更安全，加了锁

### 11.2Set

无序不可重复

HashSet:无序不重复

LinkedHashSet:有序不重复

TreeSet:自动排序，不重复，存放得类型必须是同一种类型，自定义的对象不能直接添加到TreeSet中

## 12.DAO设计模式

**DAO（Data Access Object)数据访问对象**

**概念：规范写代码的一种模式，结构更加统一，更加灵活，可扩展性好，分离了业务和数据访问**



**掌握DAO模式**

**使用Properties读取配置信息**

**使用实体类传递数据**



**将程序中的数据在瞬时状态和持久状态间转换的机制即为数据持久化**

**瞬时状态：程序关掉数据就销毁了**

**持久状态：程序关掉数据依然存在**



**JDBC**

- 读取
- 删除
- 修改
- 保存
- 查找

任务：

- 使用DAO模式实现主人登录
- 使用DAO模式实现宠物类型查询
- 实现主人领养宠物



## 13.泛型

什么是泛型？

广泛通用得类型

一开始不确定使用什么类型，使用得时候才知道使用什么类型

泛型前后类型保持一致，java7之后，后面可以不写类型

newArrayLIst<>(); 菱形语法，也叫钻石语法

### 13.1泛型类

在类上面定义的泛型

泛型类定义的泛型只能用在普通变量上

new 对象的时候声明泛型

```java
class Dog<T>{
	T name;

	public T getName() {
		return name;
	}
}
```

```java
// 泛型类
Dog<String> dog1 = new Dog<String>();
Dog<Integer> dog2 = new Dog<Integer>();
dog1.getName(); // 返回String类型
dog2.getName(); // 返回Integer类型
```



### 13.2泛型方法

调用方法的时候声明泛型

普通方法和静态方法都可以使用泛型

```java
class Student{
	
	<T> void test(T a){
		System.out.println(a.getClass());
	}
	
	static <T> void test2(T name) {
		System.out.println(name.getClass());
	}
    
    <T> T test3(T age) {
		return age;
	}
    //静态方法也可以
}

// 泛型方法
new Student().test("Tom"); // 输出String类型
new Student().test(10);  // 输出Integer类型
Student.test2("jal");    // 输出String类型
System.out.println(new Student().test3(12).getClass());  // 输出Integer 返回值也可以是泛型
```

### 13.3通配符

不知道使用什么类型接受的时候可以使用?通配符

通配符只能用于接受，不能用于其他操作

```java
// 通配符的使用
static ArrayList<?> test1(ArrayList<?> list) {
return list;
}


public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>();
test1(list); // ArrayList<String>
}
```

```java
// 指定上限
static void test1(List<? extends Number> list) {

}

// 指定下限
static void test2(List<? super Number> list) {

}

public static void main(String[] args) {

// 规定上限后只能传Number及Numbern的子类
List<Integer> list = new ArrayList<>();
test1(list);

//  规定下限后只能传Number及Numbern的父类
List<Object> list2 = new ArrayList<>();
test2(list2);

}
```

```java
// 泛型擦除
List<String> list1 = new ArrayList<String>();
list1.add("Tom");

List list2 = list1;	// 会自动把泛型擦除
list2.add(10);
System.out.println(list2); // [Tom, 10]
```

25