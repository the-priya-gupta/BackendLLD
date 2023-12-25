package Inheritence;

public class D extends C{
    String name;

    public D(String name, String batch){
        super(batch);
        System.out.println("This is param constructor");
        this.name = name;

    }
    public D(String name){
        System.out.println("This is param constructor");
        this.name = name;

    }
    public D(){
        System.out.println("You are in D");
    }
}
