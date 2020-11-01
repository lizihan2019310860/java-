# java-
实验3

## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 实验过程
1.创建project，并在其下创建package，在package下创建class（teacher、course、Text、people、student）并将其功能写入。
2.将Text作为主类，在其中将其余四个类的信息作println输出。
3.在teacher类中创建ID,teachername,sex,coursename四个变量，用this方法进行赋值，toString（）方法进行相关对象的信息输出。
4.在course类中创建ID,name,classposion,schooltime,coursename五个变量，用this方法进行赋值，toString（）方法进行相关对象的信息输出。
5.在people类创建ID,peoplename,sex三个变量，用this方法进行赋值，toString（）方法进行相关对象的信息输出。
6.在student类中创建ID,studentname,sex,course四个变量，用this方法进行赋值，toString（）方法进行相关对象的信息输出。
7.检查方法是否有误。
8.尝试运行run。
9.修改。

## 核心方法
1.阅读实验需求，思考创建的类，变量及其方法。
2.分类编写teacher  course people student text五个类。
3.修改。

## 实验结果
成功模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）。

## 实验感想
首先反思自我，没有理解继承用法和super方法。深刻了解了对象的toString方法在JDK API中对Object对象的toString方法:toString:public String toString() 返回该对象的字符串表示。通常,toString 方法会返回一个"以文本方式表示"此对象的字符串。经过本次实验，我对信息的输出这方面有更深的理解。
