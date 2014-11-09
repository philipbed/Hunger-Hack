import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Execution {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<Resources> resourceList = new ArrayList<Resources>();
		ArrayList<Peer> peersList = new ArrayList<Peer>();
		
		String filename = "";
		String fieldarray[] = new String[8];
				
		System.out.print("Please enter the filename: ");
		
		try {
		   Scanner scan = new Scanner(System.in);
		   filename = scan.nextLine();
		   File file = new File(filename);
		   Scanner reader = new Scanner(file);
		   
		   if(!file.exists())
		      throw new FileNotFoundException();
		   
		   while(reader.hasNextLine()) {
		      		      
		      for(int i = 0; i < 7; i++) {
		         fieldarray[i] = reader.nextLine();
		      }
		      		      		      
		      peersList.add(new Peer(fieldarray[0], 
		            fieldarray[2],
		            fieldarray[3],
		            Integer.valueOf(fieldarray[4]), 
		            Character.valueOf(fieldarray[5].charAt(0)), 
		            fieldarray[6]));
		      
		      String sits[] = fieldarray[1].split(", ");
		      
		      for(String obj: sits) {

		         if(obj.contentEquals("Substance Abuse"))
		        	
		            peersList.get(peersList.size() - 1).setSituationsType(1);
		         else if(obj.contentEquals("Money Management"))
		        	 
		            peersList.get(peersList.size() - 1).setSituationsType(2);
		         else if(obj.contentEquals("Unemployment"))
		        	
		            peersList.get(peersList.size() - 1).setSituationsType(3);
		         else if(obj.contentEquals("Domestic Violence"))

		            peersList.get(peersList.size() - 1).setSituationsType(4);
		         else if(obj.contentEquals("Health Issues"))
		            peersList.get(peersList.size() - 1).setSituationsType(5);
		         else
		            System.out.println("Invalid");
	   
		         }
		         
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
		
		userName.getPeers(peersList);
		String lookUp = new String();
		userName.getResources(resourceList, lookUp);
		
		
		
//		System.out.println(userName.getName());
//		System.out.println(userName.getBio());
//		System.out.println(userName.getLocation());
//		System.out.println(userName.getAge());
//		System.out.println(userName.getGender());
//		System.out.println(userName.getContactInfo());
		
		
	}
}