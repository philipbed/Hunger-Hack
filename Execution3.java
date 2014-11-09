import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Execution3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Resources> resourceList = new ArrayList<Resources>();
		
		String filename = "";
		String fieldarray[] = new String[5];
		
		System.out.print("Please enter the filename: ");
		
		try {
			Scanner scan = new Scanner(System.in);
			filename = scan.nextLine();
			File file = new File(filename);
			Scanner reader = new Scanner(file);
			
			if(!file.exists())
				throw new FileNotFoundException();
			
			while(reader.hasNextLine()) {
				
				for(int i = 0; i < 5; i++) {
					
					fieldarray[i] = reader.nextLine();
					
				}
				
				resourceList.add(new Resources(fieldarray[0],
						fieldarray[1],
						fieldarray[2],
						fieldarray[3],
						fieldarray[4]));
				
				if(reader.hasNextLine())
					reader.nextLine();
			}
		}
		catch (FileNotFoundException e) {
			throw new FileNotFoundException(filename + " doesn't exist");
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Notice: If you prefer, you may chose to remain anonymous.");
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		System.out.println();
		
		System.out.print("Pick a number(s) according to your situation. ex:(1 2 3)\n");
		System.out.print("1 for Substance Abuse\n");
		System.out.print("2 for Money Management\n");
		System.out.print("3 for Unemployment\n");
		System.out.print("4 for Domestic Violence\n");
		System.out.print("5 for Health Issues\n");
		String[] situations = new String[5];
		situations = input.nextLine().split(" ");
		
		System.out.print('\n');
		
		System.out.println("Enter bio: ");
		String bio = input.nextLine();
		System.out.print('\n');
		
		System.out.println("Enter location: ");
		String location = input.nextLine();
		System.out.print('\n');
		
		System.out.println("Enter age: ");
		String age = input.nextLine();
		System.out.print('\n');
		
		System.out.println("Enter gender: ");
		String gender = input.nextLine();
		System.out.print('\n');
		
		System.out.println("Enter contact info (enter 'no' if not interested): ");
		String contactInfo = input.nextLine();
		System.out.print('\n');
		
		User currentUser = new User(name, bio, location, Integer.valueOf(age), Character.valueOf(gender.charAt(0)) , contactInfo);
		
		for(String obj: situations) {
		   
		   currentUser.setSituationsType(Integer.valueOf(obj));
		}
		
		System.out.println("Would you like to donate to one of these "
				+ "helping organizations?");
		System.out.println("Even the smallest donation will help benefit "
				+ "someone");
		System.out.println("Enter y for yes and n for no");
		String donate_ans = input.nextLine();
		System.out.print("\n");
		
		if(donate_ans.contentEquals("Y") || donate_ans.contentEquals("y")) {
			
			System.out.println("Thank you for choosing to make a contribution.");
			System.out.println("Would you like to donate money, food, or clothes?");
			System.out.println("Enter m for money, f for food, and c for clothes");
			String donation_type = input.nextLine();
			System.out.print("\n");
			
			if(donation_type.contentEquals("M") || donation_type.contentEquals("m")) {
				
				System.out.println("A donation of any size is always welcome.");
				System.out.print("Enter the monetary donation you would like to make: $");
				float donAmount = input.nextFloat();
				
				System.out.println("We will now give you a list of organizations you can donate to.");
				int count = 1;
				
				for(Resources objt: resourceList) {
					
					System.out.println(count + ". " + objt.getName());
					System.out.println("   " + objt.getLocation());
					System.out.print("\n");
					count++;
				}
				
				System.out.print("Enter the number of the organization you wish to receive your donation: ");
				int resourceChosen = input.nextInt();
				
				resourceList.get(resourceChosen - 1).addDonationMoney(donAmount);
				
				System.out.println("Thank you for donating to " + resourceList.get(resourceChosen - 1).getName());
			}
			else if(donation_type.contentEquals("F") || donation_type.contentEquals("f")) {
				
				System.out.println("A donation of any size is always welcome.");
				System.out.println("Enter your donation you would like to give like this");
				System.out.println("Ex. Spaghetti, 3");
				
				String foodDonation[]  = new String[2]; 
				foodDonation = input.nextLine().split(", ");
				
				System.out.println("You are donating:");
				System.out.println("Name of Item: " + foodDonation[0]);
				System.out.println("Quantity: " + foodDonation[1]);
				System.out.print("\n");
				
				Donation foodItem = new Donation(foodDonation[0], foodDonation[1]);
				
				System.out.println("We will now give you a list of homeless shelters and food pantries you can donate to.");
				int count = 1;
				ArrayList<Resources> listToPrint = new ArrayList<Resources>();
				
				for(Resources objt: resourceList) {
					
					if(objt.getType().contentEquals("Homeless Shelter") || objt.getType().contentEquals("Food Pantry")) 
						listToPrint.add(objt); 
					else
						continue;
				}
				
				for(Resources objt: listToPrint) {
					
					System.out.println(count + ". " + objt.getName());
					System.out.println("   " + objt.getLocation());
					System.out.print("\n");
					count++;				
				}
				
				System.out.print("Enter the number of the orgainzation you wish to receive your donation: ");
				int resourceChosen = input.nextInt();
				
				resourceChosen = resourceList.indexOf(listToPrint.get(resourceChosen - 1));
				
				resourceList.get(resourceChosen + 1).addFoodDonation(resourceList.get(resourceChosen + 1).foodDonations, foodItem);
				
				System.out.println("Thank you for donating to " + resourceList.get(resourceChosen).getName());
				
			}
			else if(donation_type.contentEquals("C") || donation_type.contentEquals("c")) {
				
				System.out.println("A donation of any size is always welcome.");
				System.out.println("Enter the donation you would like to give like this");
				System.out.println("Ex. T-Shirts, 3");
				
				String clothingDonation[]  = new String[2]; 
				clothingDonation = input.nextLine().split(", ");
				System.out.print("\n");
				
				System.out.println("You are donating:");
				System.out.println("Name of Item: " + clothingDonation[0]);
				System.out.println("Quantity: " + clothingDonation[1]);
				System.out.print("\n");
				
				Donation clothingItem = new Donation(clothingDonation[0], clothingDonation[1]);
				
				System.out.println("We will now give you a list of homeless shelters to donate to:");
				int count = 1;
				ArrayList<Resources> listToPrint = new ArrayList<Resources>();
				
				for(Resources objt: resourceList) {
					
					if(objt.getType().contentEquals("Homeless Shelter")) 
						listToPrint.add(objt);
					else
						continue;
				}
				
				for(Resources objt: listToPrint) {
					
					System.out.println(count + ". " + objt.getName());
					System.out.println("   " + objt.getLocation());
					System.out.print("\n");
					count++;				
				}
				
				System.out.print("Enter the number of the orgainzation you wish to receive your donation: ");
				int resourceChosen = input.nextInt();
				
				resourceChosen = resourceList.indexOf(listToPrint.get(resourceChosen - 1));
				
				resourceList.get(resourceChosen + 1).addFoodDonation(resourceList.get(resourceChosen + 1).foodDonations, clothingItem);
				
				//System.out.println(resourceChosen);
				/*
				for(Resources objt: resourceList) {
					
					if(objt.getName().contentEquals(listToPrint.get(resourceChosen - 1).getName())) {
						objt.addClothingDonation(objt.clothesDonations, clothingItem);
						System.out.println("Thank you for donating to " + resourceList.get(resourceChosen - 1).getName());
					}
					else
						continue;
				}
				*/
				
				System.out.println("Thank you for donating to " + resourceList.get(resourceChosen).getName());
			}
			else {
				
				
			}
		}
		else if(donate_ans.contentEquals("N") || donate_ans.contentEquals("n")) {
			
		}
		else {
			
			
		}
				
				
				
		
		
	}
}
