import java.util.ArrayList;

public class Resources {
	
	private String name;
	private String type;
	private String phone;
	private String website;
	private String location;
	private float donationMoney;
	private boolean needHelp;
	public ArrayList<User> volunteers;
	public ArrayList<Donation> foodDonations = new ArrayList<Donation>();
	public ArrayList<Donation> clothesDonations = new ArrayList<Donation>();
	
	public Resources(String name, String type, String location, String phone, String website)
	{
		this.name = name;
		this.type = type;
		this.location = location;
		this.phone = phone;
		this.website = website;
		this.donationMoney = 0;
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
	
	public float getDonationMoney() {
		
		return donationMoney;
	}
	
	public void addDonationMoney(float val) {
		
		donationMoney += val;
	}
	
	public boolean helpNeeded() {
		
		return needHelp;
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
	
	public void addFoodDonation(ArrayList<Donation> foodDonations, Donation good) {
		
		foodDonations.add(good);
	}
	
	public void addClothingDonation(ArrayList<Donation> clothesDonations, Donation good) {
		
		clothesDonations.add(good);
	}
	
	public void askForHelp() {
		
		needHelp = true;
	}
	
}
