//本实例用于标签测试
//break lable，进入标签位置后不再进入循环
//continue lable,进入标签位置后，满足循环条件继续进入循环
//lable的':'后不能添加任何statement
public class LableTest {
    public static void main(String[] args) {
        int c=1;
        enter:
        for (; true; ) {
            System.out.println("c="+c);
            c++;
            if(c%3==0) {
                System.out.println("Enter c=" + c);
                continue enter;
            }
            if(c==20) {
                {
                    System.out.println("c="+c);
                    break enter;
                }
            }
        }

        System.out.println("End!");
    }
}