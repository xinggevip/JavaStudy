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

**包装类：**

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

**装箱:**

```java
// 装箱操作的两种方法
int a = 10;
Integer num1 = new Integer(a);// 参数可以是String，但只能包含数字
Integer num2 = Integer.valueOf(a);// 参数可以是String，但只能包含数字
System.out.println(num1.TYPE);// int
System.out.println(num2);// 10
```



**拆箱：**

基本数据类型 变量名 = 包装类变量.基本数据类型value;

```java
// 拆箱
Integer num2 = Integer.valueOf(10);
int num3 = num2.intValue();
```

**自动装箱：**

其他类型也是此写法

```java
// 自动装箱
Integer i = 10;// 编译器编译为Integer i = Integer.valueOf(10);这是语法糖
```

**自动拆箱：**

其他类型也是此写法

```java
Integer i = 10;
// 自动拆箱
int num4 = i;
```

**包装类转字符串：**

无论是什么类型的包装类，直接调用toString();就可以转成字符串型了;

**基本数据类型转字符串：**

变量加个空串

```java
int i = 0;
String str2 = i + "";
```

**把字符串转成基本数据类型：**

基本数据类型标识 变量名 = 包装类.parse基本数据类型标识(str);

```java
String str3 = "100";
int num2 = Integer.parseInt(str3);
```

**字符串转Boolean：**

传"true"为true，传其他值均为false

```java
Boolean b = new Boolean("a");
System.out.println(b);// false
Boolean b1 = new Boolean("true");
System.out.println(b1);// true
```

**获取变量数据类型：**

getClass();

http://qiangssvip.com/index.php/archives/362/

**基本数据类型和包装类型的区别：**

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



**包装类缓存设计：**

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

**为什么要使用内部类？**

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

**实例内部类：**

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

**静态内部类：**

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

**局部内部类：**

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

**匿名内部类：**

匿名内部类没有构造器，一个文件对应一个类

匿名内部类只有使用一次的时候，来去使用匿名内部类

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
		Outter.Inner in = out.new Inner();
		in.test();

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

