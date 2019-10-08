package interview.interview1_2;

/**
 * @author jtl
 * @date 2019/10/8 16:35
 * 功能:
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
