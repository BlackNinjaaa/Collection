package Collection;
import java.util.*;

import Array.Mobile;
import Array.Student_obj;

public class Map1 {

	public static void main(String[] args) {
		Map1 me=new Map1();
		me.first_pro();

	}
	
	void first_pro()
	{
		TreeMap B=new TreeMap(new MyComparator1());
		B.put(new Student_obj("Sri","19uca36",21,500),new Mobile("Samsung",15000,"32GB RAM "));
		B.put(new Student_obj("siva","19uca35",20,450),new Mobile("Poco",30000,"52GB RAM "));
		B.put(new Student_obj("Surya","19uca38",21,480),new Mobile("iphone",100000,"1TB RAM "));
	
		for(Object o:B.entrySet())
			System.out.println(o);
	
	
	}

}
