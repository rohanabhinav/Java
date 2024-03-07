package collections;
import java.util.*;

class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Coconut");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Collections.sort(fruits);
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		Student s1 = new Student(110, "Charan", 24);
		Student s2 = new Student(132, "Rakesh", 25);
		Student s3 = new Student(103, "Pranav", 22);
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		Iterator<Student> studentIterator = studentList.iterator();
		int count = 0;
		while(studentIterator.hasNext()) {
			Student student = (Student)studentIterator.next();
			System.out.println(++count + ". Name:"+student.name+" Roll-No.:"+student.rollno+" Age:"+student.age);
		}
	}
}
