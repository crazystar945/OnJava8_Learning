//本文件用于测试操作符
public class OperatorTest {
    public static void main(String[] args) {
        int  num1=10_0000;
        int num2=0x2f;//十六进制以0x开头
        int num3=024;//八进制以0开头
        long num4=9000L;//long以L结尾
        char c1='a',c2='b';
        byte b1=20;//00010100
        byte b2=4;//00000100
        //byte b3=129; this statement is false , because the max of byte is -128~+127
        System.out.println("现在开始输出二进制："+Integer.toBinaryString(num1));
        System.out.println("现在开始输出八进制："+Integer.toOctalString(num1));
        System.out.println("现在开始输出十六进制："+Integer.toHexString(num1));
        System.out.println("ToSting:"+Integer.toString(num1));
        float num5=123.456e3f;//float表示指数后缀务必增加f否则会被转化为double进行处理
        System.out.println("c1*c2="+(char)(c1*c2));
        System.out.println("This is the binary number:"+(b1&b2));//按位与
        System.out.println("This is the binary number:"+((int)b1&(int)b2));//按位与
        System.out.println
                ("Max value of byte:"
                        +Byte.MAX_VALUE
                        +"\tMin:"+Byte.MIN_VALUE
                        +"\nInteger Overflow bug(int_max*4):"
                        +Integer.MAX_VALUE*4);


    }
}
