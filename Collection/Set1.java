package Collection;

import java.util.*;

import Array.Mobile;

public class Set1 {

	public static void main(String[] args) {
		//without of using remove dupilcates 
            // sh.contains(whatever)
		    // if(its contain then it remove it )
		
		Set sh = new TreeSet(new MyComparator());
		//try {
			
			
//			sh.add("apple");
//			sh.add("lion");
//			sh.add("elephant");
//			sh.add("tiger");
//			
			sh.add(new Mobile("Samsung",10000,"32GB ROM"));
			sh.add(new Mobile("Realme",8000,"36GB ROM"));
			sh.add(new Mobile("Redme",15000,"52GB ROM"));
			sh.add(new Mobile("Redme",15000,"51GB ROM"));
//		} catch (Exception e) {
//			System.out.println("compare only similar object");
//		}
		
		//System.out.println(sh);
		
		for(Object o:sh)
			System.out.println(o);		
		
	}

}
