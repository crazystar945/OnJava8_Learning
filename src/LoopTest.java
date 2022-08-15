import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        switchTest();
    }

    //This example in order to test the usage of switch
    public static void switchTest()
    {
     String color;
     Scanner input=new Scanner(System.in);
     System.out.println("please inpute color：");
     color=input.next();
     switch (color) {
         case "Red":
             System.out.println("红色");
             break;
         case "blue":
             System.out.println("蓝色");
             break;
         case "Yellow":
             System.out.println("黄色");
             break;
         default:
             System.out.println("三原色外的其他颜色");

     }
    }
}
