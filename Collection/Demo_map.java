package Collection;
import java.util.*;

/*  DISCRIPTION :
 * first of all am create an object for map and list are filled to linkedhashmap 
 * then put the key and values to the likedhashmap and I add only key template to the new list
 * addAll key to the linked list using m.Keyset
 * and written a condition to print the above 30 RS items in a list
*/

public class Demo_map {

public static void main(String args[])
{
	Demo_map me=new Demo_map();
	//me.list_above_50RS();
	me.Strating_letter_i ();
 
}

static void list_above_50RS()

{
  Map m=new LinkedHashMap<String,Integer>();
  
  m.put("Idly", 8);
  m.put("Vada", 8);
  m.put("Thosa", 20);
  m.put("Kal_Thosa", 20);
  m.put("Parota-2",30);
  m.put("Chapathi-2", 30);
  m.put("Nei-thosa", 40);
  m.put("Amleat",15);
  m.put("Halfboil", 15);
  m.put("Mutta-Thosa", 25);
  
  
  
  List n=new LinkedList();
 
  n.addAll(m.keySet());
  //System.out.println(n);
  
  for(Object o:n)
  {  //System.out.println(o);
  // condition
  if(30>=(int)m.get(o))
  {
	System.out.println(o+"    \tRS"+" "+m.get(o));  
  }
  
  }
  
 }

static void Strating_letter_i ()
{
	 Map m=new LinkedHashMap<String,Integer>();
	  
	  m.put("Idly", 8);
	  m.put("Vada", 8);
	  m.put("Thosa", 20);
	  m.put("Kal_Thosa", 20);
	  m.put("Parota-2",30);
	  m.put("Chapathi-2", 30);
	  m.put("Nei-Thosa", 40);
	  m.put("Amleat",15);
	  m.put("Ice-cream", 40);
	  m.put("Idiyappam",40);
	 
	  Set n =new LinkedHashSet();
	  
	  n.addAll(m.keySet());
	  
	  for(Object p:n)
	  {
		String s=p.toString();
	  
	    if(s.startsWith("I")||s.startsWith("i"))
	    { 
	    	System.out.println(s+"    \tRS"+" "+m.get(p));
	    }
	  }
	  
	  System.out.println();
	  
	    for(Object N:n)
	    {
	    	String s1=N.toString();
	    	
	    if(s1.contains("Thosa"))
	    {
	    	System.out.println(s1+"    \tRS"+" "+m.get(N));
	    }
	    
	  
	  }
	  
	  
	  }
}



