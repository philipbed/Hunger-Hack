import java.util.Scanner;
import java.util.ArrayList;

public class Donation {
	private String name;
	private String amount;
	
	public Donation(String name, String amount) {
		this.name = name;
		this.amount = amount;
		
	}
	public String getName() {
		
		return name;
	}
/*	
	public String getType() {
		
		return type;
	}
*/	
	public String getAmount() {
		
		return amount;
	}
	
	public void setName(String field) {
		
		name = field;
	}
/*	
	public void setType(String field) {
		
		type = field;
	}
*/	
	public void setAmount(String field) {
		
		amount = field;
	}
	
	//parsing in donations
	
	public Donation addDonation(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input what you want to donate ex. (item, quantity)");
		String csv[] = new String[2];
		csv = input.nextLine().split(", ");
		Donation d1 = new Donation(csv[0], csv[1]);
		return d1;
		
	}
	
}
