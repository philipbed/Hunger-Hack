import java.util.ArrayList;

public class Resources {
	
	private String name;
	private String type;
	private String phone;
	private String website;
	private String location;
	public ArrayList<User> volunteers;
	
	public Resources(String name, String type, String phone, String website)
	{
		this.name = name;
		this.type = type;
		this.phone = phone;
		this.website = website;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getType() {
		
		return type;
	}
	
	public String getPhone() {
		
		return phone;
	}
	
	public String getWebsite() {
		
		return website;
	}
	
	public String getLocation() {
		
		return location;
	}
	
	public void getInformation() {
		
		System.out.println(getName());
		System.out.println(getType());
		System.out.println(getLocation());
		System.out.println(getPhone());
		System.out.println(getWebsite());
	}
	
	public void addVolunteer(ArrayList<User> userList, User volunteer) {

		userList.add(volunteer);
	}
}
