package Inheritence;

public class C extends  B{

    String batch;
    public C(String batch){
        this();
        System.out.println("This is param constructor");
    }
    public C(){
        System.out.println("You are in C");
    }
}
