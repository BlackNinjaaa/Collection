package Collection;

import java.util.Comparator;

import Array.Student_obj;

public class MyComparator1 implements Comparator <Student_obj>{

	@Override
	public int compare(Student_obj s1, Student_obj s2) {
		
		return s1.getName().compareTo(s2.getName());
	}

}
