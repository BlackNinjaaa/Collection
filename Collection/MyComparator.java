package Collection;
import java.util.Comparator;

import Array.Mobile;

public class MyComparator implements Comparator <Mobile> {

	@Override
	public int compare(Mobile arg0, Mobile arg1) {
//		
//           Mobile s1=(Mobile) arg0;
//           Mobile s2=(Mobile) arg1;
////           
           if(arg0.getPrice()>arg1.getPrice())
           {
        	   return -2323;
           }
           else if(arg0.getPrice()<arg1.getPrice())
        	   return 232;
           
             else
        	   return 0;
		
	//	return arg0.getModel_name().compareTo(arg1.getModel_name());
        	   
	}
	
	


	}


