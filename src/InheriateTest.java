//本实例用于测试继承语法
//当对象被用于字符串连接输出时，系统会自动调用override后的toString()方法
//继承后的子类的构造函数必须和原有的一致，或者必须匹配原对象的其中一项
//父类的所有方法可以被看作为基类，在派生类后复写基类，
// 并且在复写后的基类中调用父类中的基类，应该使用super关键字，来防止无限递归调用
//基类会在派生类能使用前初始化
//委托java中未定义，但是可以用idea生成
//如果不想让class被继承，那么就给其修饰词为final
public class InheriateTest {
    public static void main(String[] args) {
        Province p=new Province("Inner mongolia");
        System.out.println("Name:"+p.getName());
        p.changeName("Mongolia");
        System.out.println("Name:"+p.getName());
    }
}
class Country{
    private String name;
    Country(){
        System.out.println("Create a country!");
    }
    Country(String name){
        this.name=name;
        System.out.println("This country name is "+name);
    }
    public void setName(String name2){
        name=name2;
    }
    public void changeName(String name2)
    {
        this.name=name2;
        System.out.println("The name has been changed to "+name);
    }
    @Override
    public String toString(){
        return name;
    }
}
class Province extends Country{
    String name;
//    @Override
//    public void changeName(String name)
//    {
//        this.name=name;
//    }
    Province(String pName){
        name=pName;
        System.out.println("Create a Province!");
    }
    public String getName()
    {
        return name;
    }
}