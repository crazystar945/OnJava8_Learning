import java.util.Arrays;
import java.util.Scanner;

/*
* Object数组为可变参数，可以存放任意类型数据
* Object...为可以传入任意数量的参数，放入Object类型的动态数组中，其他类型也可使用...
* 一个.java中，可以有多个class，每个class中也可以有任意main
* 但是主class中的main参数列表类型必须是String数组
* getClass()方法是生成基于对象的类，我们可以借此来看到对象的类型
* */
//This example order to test usage of array
public class ArrayTest {
    static void printArray(Object...args){
        for(Object o:args)
            System.out.println(o+" ");
    }
    public static void main(String[] args) {
        //other.main(new String[]{"First","Second"});
       // Scanner input=new Scanner(System.in);
        Object[] array={"string",12,true,3.14,new Other("第一")};
        for(Object o:array){
            String s= String.valueOf(o.getClass());

        }
       // printArray("1",23,45,"fdsf",false);
    }
}

class Other{
    Other(String s){
    }
    Other(){}
    public static void main(int[] args) {
        for(Object s:args)
        {
            System.out.println("Arg:"+s);
        }
    }
}