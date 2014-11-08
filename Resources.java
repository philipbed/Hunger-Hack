
public class Resources {
	
	private String name;
	private String type;
	private String phone;
	private String website;
	
	public Resources(String name, String type, String phone, String website)
	{
		this.name = name;
		this.type = type;
		this.phone = phone;
		this.website = website;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getWebsite()
	{
		return website;
	}
}
