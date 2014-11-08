import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Execution {
	
	public static void main(String[] args)
	{
		ArrayList<Resources> resourceList = new ArrayList<Resources>();
		ArrayList<Peer> peersList = new ArrayList<Peer>();
		
		String filename = "";
		String fieldarray[];
		int count = 0;
		
		System.out.println("Please enter the filename: ");
		
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
		      		      
		      reader.nextLine();
		      
		      peersList.add(new Peer(fieldarray[0], fieldarray[1] )
		    
		   }
		   
		   
		}
		
		
	}
}