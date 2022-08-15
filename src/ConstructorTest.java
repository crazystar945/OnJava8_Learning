
import static java.lang.Thread.sleep;

//当使用this，代表引用当前对象
//通过this调用构造器just for once
//static method cannot use this operator
public class ConstructorTest {

    public static void main(String[] args) throws InterruptedException {
        //Tree t=new Tree("Test",1
        Book novel=new Book(true);
        novel.checkIn();
        System.gc();
        sleep(1000);
    }
}

class Tree{
    private int hight;
    int tmp=0;
    Tree thisTest(){
        tmp++;
        return  this;
    }
    void print(){
        System.out.println("tmp="+tmp);
    }
    Tree(){
        System.out.println("I will create a void tree");
    }
    Tree(int initHight)
    {
        hight=initHight;
        System.out.println("It will set the initial hight of the tree:"+hight);
    }
    Tree(String s,int initHight) {
        //if u'd like use this operator to constrator
        //this statement must be first line
        this(initHight);
        System.out.println("start Tree(int initHight)");
        System.out.println("This operator test finish");
    }
}

class Book{
    boolean checkOut=false;
    Book(boolean check){
        checkOut=check;
    }

    void checkIn()
    {
        checkOut=false;
    }
    @Override
    protected void finalize() throws Throwable{
        if(checkOut){
            System.out.println("Error: checked out!");
        }
    }

    //t被两次定义
    Book(){
        t=new Tree(10);
    }
    Tree t=new Tree(20);
}
