import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Execution2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Resources> resourceList = new ArrayList<Resources>();
		
		String filename = "";
		String fieldarray[] = new String[8];
		
		System.out.println("Please enter the filename: ");
		
		try {
			Scanner scan = new Scanner(System.in);
			filename = scan.nextLine();
			File file = new File(filename);
			Scanner reader = new Scanner(file);
			
			if(!file.exists())
				throw new FileNotFoundException();
			
			while(reader.hasNextLine()) {
				
				for(int i = 0; i < 6; i++) {
					
					fieldarray[i] = reader.nextLine();
					
				}
				
				resourceList.add(new Resources(fieldarray[0],
									fieldarray[2],
									fieldarray[3],
									fieldarray[4]));
				
				
				
				//for(String obj: sits){
					if(fieldarray[1].contentEquals("Shelter"))
						resourceList.get(0);
						//Empty right now
					else if(fieldarray[1].contentEquals("Counseling"))
						resourceList.get(0);
						//Empty right now
					else
						resourceList.get(0);
						//Empty right now
				//}
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
		
		for (Resources obj: resourceList){
		if (resource.equals("Shelter"))
			resourceList.get(1);
		else if (resource.equals("Counseling"))
			resourceList.;
		}
				
	}

}
