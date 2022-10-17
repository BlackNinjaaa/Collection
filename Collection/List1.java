package Collection;
import java.util.*;

import Array.Computer;
import Array.Mobile;
import Array.Student_obj;

public class List1 {

	public static void main(String[] args) {
		
		List1 me=new List1();
		me.main();
		
		
	}
		
		public void main()
		
		{
			
			List ls=new ArrayList();
		
		ls.add(new Computer("HP","black",35000,"32GB ROM"));
		ls.add(new Computer("Mac","black",85000,"52GB ROM"));
		ls.add(new Computer("Lenovo","black",15000,"12GB ROM"));
		ls.add(new Computer("Acer","grey",67000,"64GB ROM"));
		
		
		ls.add(new Mobile("Samsung",10000,"32GB ROM"));
		ls.add(new Mobile("Realme",8000,"36GB ROM"));
		ls.add(new Mobile("Redme",15000,"52GB ROM"));
		ls.add(new Mobile("Redme",15000,"51GB ROM"));
		
		ls.add(new Student_obj("sri","19uca36",21,540));
		ls.add(new Student_obj("raj","19uca35",20,400));
		ls.add(new Student_obj("dharan","19uca34",22,370));
		ls.add(new Student_obj("surya","19uca38",21,550));
		
		
		List com=new ArrayList();
		List mob=new ArrayList();
		List stu=new ArrayList();
		 
		for(Object o:ls)
		{
			//System.out.println(o);
			if(o.getClass().equals(Computer.class))
			{
				com.add(o);
				
				//System.out.println();
			}else if(o.getClass().equals(Mobile.class))
			{
				mob.add(o);
				
				//System.out.println();
			}else if(o.getClass().equals(Student_obj.class))
			{
				stu.add(o);

			}
		}
		System.out.println(com);
		System.out.println(mob);
		System.out.println(stu);
//		
		
		
		
		

	}

}
