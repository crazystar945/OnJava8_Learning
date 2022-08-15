public class ObjectiveTest {
    public static void main(String[] args) {
        Obj o2=new Obj();
        Obj o1 =new Obj();
        Integer num1=-128;
        Integer num2=-128;
        Integer num3=num1;
        String s1,s2;
        s1="hello";
        s2="hello";
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(num3));
        System.out.println(num1==num2);
        o1.i=o2.i=5;
        System.out.println(o1.equals(o2));
        o1.i=5;
        o2.i=5;
        System.out.println(o1.equals(o2));
        System.out.println(s1.equals(s2));

    }
}
class Obj{
    int i;
}