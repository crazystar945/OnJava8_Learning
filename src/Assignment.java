/*
* 当对象用"="相等了 ，那么两个对象便指向了同一个堆空间
* */
class tank{
    int level;
        }
public class Assignment {
    public static void main(String[] args) {
        tank t1=new tank();
        tank t2=new tank();
        t1.level=12;
        t2.level=20;



    }
}
