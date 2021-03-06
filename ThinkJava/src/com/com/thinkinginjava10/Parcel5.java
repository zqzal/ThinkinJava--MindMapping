package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */
/*
可以在一个方法里面或者在任意的作用域内定义内部类。
这么做的有两个理由：
1.如前所示，你实现了某类型的接口，于是可以创建并返回对其的引用。
2.你要解决一个复杂的问题，想创建一个类来辅助你的解决方案，但是又不希望这个类是公共可用的。
在后面的例子中，先前的代码将被修改，以用来实现
1.一个定义在方法中的类
2.一个定义在作用域内的类，此作用域在方法的内部。
3.一个实现了接口的匿名类
4.一个匿名类，它扩展了有非默认构造器的类
5.一个匿名类，它执行字段初始化
6.一个匿名类，它通过实例初始化实现构造（匿名类不可能有构造器）
 */
public class Parcel5 {

    /**
     * 在方法的作用域内（而不是其他类的作用域内）创建一个完整的类。这被称作局部内部类
     * @param s
     * @return
     */
    public Destination destination(String s){

        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel(){
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("T");
    }
}
