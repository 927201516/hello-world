package cn.itcast.day01.demo01;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello,World!!!");

        Scanner sc =null;

         //alt+enter导入包自动修复代码
         //ctrl+d重复一行，ctrl+y删除一行，ctrl+alt+l格式化

        //static加在变量前后无论实例化对象多少均使用一个空间，类加载时产生，类结束时销毁。
        //静态成员可以用对象名访问，也可用类名访问。
        //静态方法中不能直接访问同一类的非静态成员，只能直接调用同一个类中静态成员。
        //如果一定要调用，只能通过对象实例化后，对象，成员方法的方式访问非静态成员。
        //静态方法中不能使用thi
        //{}形成的构造代码块是会在构造方法中最开始运行。在{}前加static会使其最先执行。仅希望执行一次的代码可以放在静态代码块中
    }

}
