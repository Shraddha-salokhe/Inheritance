package Collections;

import java.util.Objects;

public class Student {

	String name;
	int age;
	int RollNo;
	String Course;
	
	//create constructor ==
	public Student(String name, int age, int rollNo, String course) {
		super();
		this.name = name;
		this.age = age;
		this.RollNo = rollNo;
		this.Course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Course, RollNo, age, name);
	}

	
	
	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
	

}
