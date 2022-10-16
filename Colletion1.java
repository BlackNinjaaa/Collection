import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Colletion1 {

	public static void main(String[] args) {
		
	
		List things=new ArrayList();
		
		things.add("Travels");
		things.add(12);
		things.add(45.000);
		things.add(false);
		things.add(null); // 1. add the elements to the list
		
		
		//System.out.println(things);
		
		ArrayList newthings=new ArrayList();
		
		newthings.add("strap");
		newthings.add(false);
		
		//newthings.addAll(things);
		
		newthings.addAll(things); // 2. this line add upon excistings list
			
          //System.out.println(newthings);
          
        //things.clear(); //3. clear all elements in the list
          //System.out.println(things);
	
	    things.add(3, "surya"); // 4.using this add method from the list methods they perform to add which index to store element
	    
	  //  System.out.println(things); 
	   // System.out.println(newthings.contains(false)); // 5.contains method use to search the particular element is there are not
	
		//System.out.println(things.containsAll(things)); // contain all method is use to search the all element from other list to our list 
	
	
	
	
	}

}
