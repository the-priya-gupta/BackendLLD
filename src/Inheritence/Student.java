package Inheritence;

public class Student extends User {

   int psp;

   void doSomething(){
      System.out.print("This is psp"+psp);
      System.out.print("This is UseriD"+user_id);
      System.out.print("This is User name"+user_name);
     // System.out.print("This is User age"+age);
      System.out.print("This is User date of birth"+dob);
   }
}
