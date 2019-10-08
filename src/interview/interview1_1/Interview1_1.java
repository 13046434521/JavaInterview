package interview.interview1_1;

/**
 * @author jtl
 * @date 2019/10/8 16:14
 * 功能: Java面试题：自增变量
 */
public class Interview1_1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + i++ * ++i;

        System.out.println("i:" + i + "\nj:" + j + "\nk:" + k);
        //答案：i:4 j:1 k:10
        //如果改成：int k=i + i++ * ++i; 结果是多少
    }
}
