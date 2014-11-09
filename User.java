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
	   
	   for(Peer )
	   
	}

}
