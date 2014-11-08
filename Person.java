
public abstract class Person {
   
   private String name;
   private String bio;
   private String location;
   private int age;
   private char gender;
   private String contactInfo;
   
   public Person(String name, String location, int age, char gender) {
      
      this.name = name;
      this.bio = null;
      this.location = location;
      this.age = age;
      this.gender = gender;
      this.contactInfo = null;
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
   
   
}
