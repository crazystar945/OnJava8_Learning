//验证异或运算
//异或；相同状态为真，不同为假x
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please input two statement:");
            boolean s1,s2,result;
            Scanner input= new Scanner(System.in);
            s1=input.nextBoolean();
            s2= input.nextBoolean();

            result=s1^s2;
            System.out.println(s1+"^"+s2+"="+result);
        }
    }
}
