import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Execution2 {
	
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
		
		System.out.print("Enter name: ");
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
		
		System.out.print("Enter bio: ");
		String bio = input.nextLine();
		System.out.print('\n');
		
		System.out.print("Enter location: ");
		String location = input.nextLine();
		System.out.print('\n');
		
		System.out.print("Enter age: ");
		String age = input.nextLine();
		System.out.print('\n');
		
		System.out.print("Enter gender: ");
		String gender = input.nextLine();
		System.out.print('\n');
		
		System.out.print("Enter contact info (enter 'no' if not interested): ");
		String contactInfo = input.nextLine();
		System.out.print('\n');
		
		User userName = new User(name, bio, location, Integer.valueOf(age), Character.valueOf(gender.charAt(0)) , contactInfo);
		
		for(String obj: situations) {
		   
		   userName.setSituationsType(Integer.valueOf(obj));
		}
		
		System.out.print("Enter the resource you're looking for: ");
		String resource = input.nextLine();
		System.out.print('\n');
		
		System.out.println("Enter s for shelter and f for food pantry.");
		String donation_type = input.nextLine();
		System.out.print("\n");
		
		if(donation_type.contentEquals("S") || donation_type.contentEquals("s")) {
			System.out.println("We will now give you a list of shelters you can volunteer at.");
			int count = 1;
			
			for(Resources objt: resourceList) {
				
				System.out.println(count + ". " + objt.getName());
				System.out.println("   " + objt.getLocation());
				System.out.print("\n");
				count++;
			}
			System.out.print("Enter the number of the organization you wish to receive your donation: ");
			int resourceChosen = input.nextInt();
			
			//resourceList.get(resourceChosen - 1).addDonationMoney(donAmount);
			
			System.out.println("Thank you for volunteering to work at " + resourceList.get(resourceChosen - 1).getName());
		
		}
		else if(donation_type.contentEquals("F") || donation_type.contentEquals("f")) {
			System.out.println("We will now give you a list of food pantries you can volunteer at.");
			int count = 1;
			
			for(Resources objt: resourceList) {
				
				System.out.println(count + ". " + objt.getName());
				System.out.println("   " + objt.getLocation());
				System.out.print("\n");
				count++;
		}
			System.out.print("Enter the number of the organization you wish to receive your donation: ");
			int resourceChosen = input.nextInt();
			
			//resourceList.get(resourceChosen - 1).addDonationMoney(donAmount);
			
			System.out.println("Thank you for volunteering to work at " + resourceList.get(resourceChosen - 1).getName());
		}
		//userName.getResources(resourceList, resource);
		
//		for (Resources obj: resourceList){
//		if (resource.equals("Shelter"))
//			resourceList.get(1);
//		else if (resource.equals("Counseling"))
//			resourceList.get(1);
//		else if(resource.equals("Food Pantry"))
//			resourceList.get(1);
//		else
//			System.out.println("No valid type");
//		}
				
	}

}
