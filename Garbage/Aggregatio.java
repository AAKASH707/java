package Aggregation;

public class Aggregation {

public static void main(String[] args) {
		
		Student st1 = new Student("Aakash", 1);
		School sc1 = new School(1, 10000, st1);
		sc1.st1.avg(10.0, 20.0);
		
	}

}

class School{
	int schoolId;
	int noOfStudents;
	Student st1;
	
	School(int schoolId, int noOfStudents, Student st1){
		this.schoolId = schoolId;
		this.noOfStudents = noOfStudents;
		this.st1 = st1;
	}
	
	public void details(Student st1) {
		
		System.out.println("The name of student is : " + st1.name);
		System.out.println("The roll no. of student is : "+ st1.rollNo);
		
	}
	
}

class Student{
	String name;
	int rollNo;
	double m1;
	double m2;
	
	Student(String name, int rollNo){
		this.name=name;
		this.rollNo= rollNo;
		
	}
	public void avg(double m1, double m2) {
		this.m1=m1;
		this.m2=m2;
		System.out.println("Avg : " + ((m1 +m2)/2));
}
}
