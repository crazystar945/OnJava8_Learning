//enum类型的常量值，尽量用upper
public class EnumTest {
    enum Frute{
        BANANA,APPLE;
    }
    Frute f;
    EnumTest(Frute f){
        this.f=f;
    }
    public void switchFruteColor(){
        switch (f){
            case BANANA:System.out.println("This is YELLOW!");break;
            case APPLE:System.out.println("This is RED");break;
        }
    }
    public static void main(String[] args) {
        EnumTest e=new EnumTest(Frute.APPLE);
        e.switchFruteColor();
    }
}
