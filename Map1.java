import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		  
		//Map s =new HashMap<String,Integer>();  //<String,Integer>  this called as gentric
          
		//Map s=new LinkedHashMap<String,Integer>();
		
		Map s=new TreeMap<String,Integer>();
		
		s.put("ninjaa", 2);
		s.put("fighter", 2);
		s.put("leader", 1);
		s.put("soliders", 200);
		
//		System.out.println(s.containsKey("leader"));
//		
		System.out.println(s);
//		
//	System.out.println(s.remove("soliders"));
		
		//Set m =s.keySet();
		
		//System.out.println(m);
	}

	
	
	// Map <Interger,Mobile> m =new HashMap // practice
}
