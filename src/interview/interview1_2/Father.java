package interview.interview1_2;

/**
 * @author jtl
 * @date 2019/10/8 16:35
 * 功能:
 *
 *  1.编译成字节码.class文件  javac -encoding UTF-8 Father.java
 *  2.反编译成，汇编代码  javap -v Father.class
 *
 * 类的初始化：字节码中<clinit>方法（classinit）
 * 1：优先加载静态变量，顺序由上到下
 * 类的实例化：字节码中<init>>方法（init）
 * 1：先执行super，无论是否写super，都会执行super，即父类的实例化
 * 2：优先加载非静态变量，和非静态代码块，最后加载相应参数的构造器
 * 3. 子类实例化时，调用的方法，一定是重写过的子类方法
 */
public class Father {
    private int i = test();
    private static int j = test2();

    static {
        System.out.print(" 1 ");
    }

    public Father() {
        System.out.print(" 2 ");
    }

    {
        System.out.print(" 3 ");
    }

    public int test() {
        System.out.print(" 4 ");
        return 1;
    }

    public static int test2() {
        System.out.print(" 5 ");
        return 1;
    }
}
