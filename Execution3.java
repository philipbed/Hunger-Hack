import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Execution3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input How many donations you would like to do: ");
		String num = input.nextLine();
		int numRuns = Integer.parseInt(num);
	
		ArrayList<Donation> donationList = new ArrayList<Donation>();
		for(int i = 0; i < numRuns; i++){
			Donation donation = new Donation(" ", " ");
			donationList.add(donation.addDonation());
		}
			
			
		for(int x = 0; x < donationList.size(); x++)
		{
			System.out.println(donationList.get(x));
		}
		
		
		
	}
}
