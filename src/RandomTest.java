import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //1.math.random [0,1)
        //Rule：num1+(int)(Math.random()*pow(10,n))
        //num1:下限    n：随机数位数
        int x=10;
        System.out.println("This is math Random :"+(int)(Math.random()*10));
        //2.Class Random
        //seed默认为当前时间种子，若指定seed，那么生成的随机数唯一
        //nextInt partment is top num
        Random r=new Random(30);
        System.out.println("Class Random:"+(r.nextInt(100)));
    }
}
