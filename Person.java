import java.util.ArrayList;

public abstract class Person {
   
   private String name;
   private String bio;
   private String location;
   private int age;
   private char gender;
   private String contactInfo;
   public ArrayList<Integer> situations;
   
   public Person(String name, String bio, String location, int age, char gender, String contactInfo) {
      
      this.name = name;
      this.bio = bio;
      this.location = location;
      this.age = age;
      this.gender = gender;
      this.contactInfo = contactInfo;
      this.situations = new ArrayList<Integer>();
     
   }
   
   public String getName() {
      
      return name;      
   }
   
   public String getBio() {
      
      return bio;
   }
   
   public String getLocation() {
      
      return location;
   }
   
   public int getAge() {
      
      return age;
   }
   
   public char getGender() {
      
      return gender;
   }
   
   public String getContactInfo() {
      
      return contactInfo;
   }
   
   public void setContactInfo(String val) {
      
      contactInfo = val;
   }
   
   public void setBio(String val) {
      
      bio = val;
   }
   
   public void setSituationsType(int val) {
	      
	      situations.add(val);
	   }
	   
	   public void getSituationsType() {
	      
	      for(Integer objt: situations) {
	         getSituationsType_as_string(objt);
	      }
	      
	   }
	   
	   public String getSituationsType_as_string(Integer val) {
	      
	      switch(val) {
	      
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
   
}
