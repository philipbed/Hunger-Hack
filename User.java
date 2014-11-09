import java.util.ArrayList;

public class User extends Person {
	
	public User(String name, String bio, String location, int age, char gender, String contactInfo) {
	   
		super(name, bio, location, age, gender, contactInfo);
	}
	
	public void /*ArrayList<Peer>*/ getPeers(ArrayList<Peer> listOfPeers) {
	   
	   ArrayList<Peer> listToReturn = new ArrayList<Peer>();
	   
	   for(Integer objt: this.situations) {
	      
	      for(int i = 0; i < listOfPeers.size(); i++) {
	         
	         if(listOfPeers.get(i).situations.contains(objt) && !listToReturn.contains(listOfPeers.get(i)))
	            listToReturn.add(listOfPeers.get(i));
	         else
	            continue;
	      }
	      	      
	   }
	   
	   for(Peer person: listToReturn) {
		   System.out.println("People who have been through the same things\n");
		   person.tellStory();
	   }
	   
	}
	
	public void donate(Donation good, ArrayList<Donation> donationList) {
		
		donationList.add(good);
	
	}
	
	public void getResources(ArrayList<Resources> listOfResources, String lookUp) {
		
		ArrayList<Resources> listToReturn = new ArrayList<Resources>();
		
		
		for (Resources resource: listOfResources){
			
			if (resource.getType().contentEquals(lookUp))
				listToReturn.add(resource);
			else
				continue;
			
		}
		for (Resources obj: listToReturn){
			
			obj.getInformation();
			
		}
		
	}

}
