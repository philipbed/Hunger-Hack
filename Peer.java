import java.util.ArrayList;


public class Peer extends Person {
   
   private ArrayList<Integer> problems;
   
   public Peer(String name, String location, int age, char gender) {
      
      super(name, location, age, gender);
      this.problems = null;
   }
   
   public void setProblemType(int val) {
      
      problems.add(val);
   }
   
   public int getProblemType() {
      
      
   }
   
   public String getProblemType_as_string() {
      
      switch(problemType) {
      
      case 1:
         return "Substance Abuse";
      case 2:
         return "Money Management";
      case 3:
         return "Unemployment";
      case 4:
         return "Domestic Violence";
      case 5:
         return "Health Issues";
         
      }
      return null;
      
   }
   
   public void tellStory() {
      
      System.out.println(getName());
      System.out.println(getAge());
      System.out.println(getLocation());
   }

}
