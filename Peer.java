import java.util.ArrayList;

public class Peer extends Person {
   
   public Peer(String name, String bio, String location, int age, char gender, String contactInfo) {
      
      super(name, bio, location, age, gender, contactInfo);
   }
   
   public void tellStory() {
      
      System.out.println(getName());
      System.out.print(getGender() + ", " + getAge());
      System.out.println("\n" + getLocation());
      System.out.println(getContactInfo());
      System.out.println(getBio() + "\n");
          
   }

}
