package Array;

public class Student_obj {

	String Name;
	String Register_no;
	int Age;
	int Mark;
	public Student_obj(String name, String register_no, int age, int mark) {
		super();
		Name = name;
		Register_no = register_no;
		Age = age;
		Mark = mark;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRegister_no() {
		return Register_no;
	}
	public void setRegister_no(String register_no) {
		Register_no = register_no;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMark() {
		return Mark;
	}
	public void setMark(int mark) {
		Mark = mark;
	}
	@Override
	public String toString() {
		return "Student_obj [Name=" + Name + ", Register_no=" + Register_no + ", Age=" + Age + ", Mark=" + Mark + "]";
	}
	
	
}
