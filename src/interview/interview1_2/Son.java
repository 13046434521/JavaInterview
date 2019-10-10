package interview.interview1_2;

/**
 * @author jtl
 * @date 2019/10/8 16:38
 * 功能:
 */
public class Son extends Father {
    private int i = test();
    private static int j = test2();

    static {
        System.out.print(" 6 ");
    }

    public Son() {
        System.out.print(" 7 ");
    }

    {
        System.out.print(" 8 ");
    }

    public int test() {
        System.out.print(" 9 ");
        return 1;
    }

    public static int test2() {
        System.out.print(" 10 ");
        return 1;
    }
}
