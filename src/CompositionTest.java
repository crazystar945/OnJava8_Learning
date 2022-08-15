//While we need to converse the object to print,
//We need to force using the toString method
//The key word @Override order to tell compiler the method has been override

class Animal{
    String name;
    Animal(String name){
        this.name=name;
        System.out.println("Create new animal!\nMeg:"+name);
    }
    Animal()
    {
        name="None name";
        System.out.println("Create new animal!\nMeg:"+name);
    }

    @Override
    public String toString(){
        return name;
    }
}

class Zoo{
    private String name;
    private String site;
    private Animal freshOne=new Animal(name);
    Zoo(String name){
        this.name=name;

    }
    @Override
    public String toString(){

        return
                "name:"+name+" "+
                "site:"+site+" "+
                "Animal:"+freshOne;
    }
}
//main
public class CompositionTest {
    public static void main(String[] args) {

        //This statement will print the message of the class
        System.out.println(new Zoo("fox"));
    }
}
