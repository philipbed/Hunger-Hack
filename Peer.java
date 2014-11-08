import java.util.ArrayList;


public class Peer extends Person {
   
   
   public Peer(String name, String location, int age, char gender) {
      
      super(name, location, age, gender);
   }
   
   public void tellStory() {
      
      System.out.println(getName());
      System.out.println(getAge());
      System.out.println(getLocation());
   }

}
