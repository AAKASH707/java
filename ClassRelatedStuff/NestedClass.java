public class NestedClass {

	public static void main(String[] args) {
		School S1 = new School();
		School.Student in = S1.new Student("Aak",1,"B");
		
	}

}
class School{
	String Name;
	int Estb;
	
	School(){}
	
	class Student{
		String name;
		int Roll_no;
		String Batch;
		final int Year = 2021;
		
		Student(String name, int Roll_no, String Batch){
			this.name=name;
			this.Roll_no=Roll_no;
			this.Batch=Batch;
			
			System.out.println("Student name: "+name);
			System.out.println("Student Roll_no: "+Roll_no);
			System.out.println("Student Batch: "+Batch);
			System.out.println("Year: "+Year);
		}
		
	}
}
