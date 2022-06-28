package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRunner {

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();//not return duplicate value
		
		Student std1 = new Student("ABC", 20,1,"phase1");
		students.add(std1);
//		cities.add("Agra");
//		cities.add("Banglore");
//		cities.add("Calcutta");//not return 2 time...duplicate not return
//		cities.add("Calcutta");
//		
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			
	    Student std = it.next();
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getRollNo());
		}
	}

}
