import com.sun.org.apache.xml.internal.utils.res.IntArrayWrapper;

import java.math.BigInteger;
import java.security.cert.TrustAnchor;
import java.util.*;

//供测试使用
public class Test {

    public static void main(String[] args) {
        Door bedRoom_door=new Door();
        String handle1="This is handle";
        System.out.println("I am coming!");
        bedRoom_door.on(handle1);
        System.out.println("Terrible ! I need do some private thing");
        bedRoom_door.off(handle1);

        Door Toilt_door=new Door();
        System.out.println("The door will open!");
        Toilt_door.on(handle1);
        }
}

class Door{
    int num;
    String metria;
    public void on(String handle){
        System.out.println("Door is opening");
    }
    public void off(String handle){
        System.out.println("Door is closing");
    }
    public void push(String handle){
        System.out.println("The door has pushed");
    }
}

