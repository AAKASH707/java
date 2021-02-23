public class InheritanceEg {

	public static void main(String[] args) {
		Employee e1 = new Employee("emp", 48,3000,1000,1000,1000);
        e1.calculateSalary();
        System.out.println("");
       
        Manager m1 = new Manager("mang1", 32,3000,1000,1000,1000);
        m1.calculateSalary();
        m1.calculateSalary(3000);
        System.out.println("");

        ProjectManager p1 = new ProjectManager("pm1", 0,3000,1000,1000,1000);
        p1.calculateSalary();
        p1.calculateSalary(2000,1000);
        System.out.println("");
        
       
	}

}

class Employee{
	String name;
	int emp_id;
	int basic_salary,SA,HRA,DA;
	Employee(){}
	Employee(String name,int emp_id,int basic_salary,int SA,int HRA, int DA){
		this.name = name;
        this.emp_id = emp_id;
        this.SA = SA;
        this.HRA = HRA;
        this.DA = DA;
        this.basic_salary = basic_salary;
	}
	void calculateSalary() {
		int salary=basic_salary+HRA+DA+SA;
		 System.out.println("The Salary is : " + salary);
	}
	
}


class Manager extends Employee{
	int Mang_allounc;
	Manager(){}
	Manager(String name,int emp_id,int basic_salary,int SA,int HRA, int DA){
		super(name,emp_id,basic_salary,SA,HRA,DA);
	}
	void calculateSalary() {
		int salary=basic_salary+HRA+DA+(2*SA);
		 System.out.println("The Salary Manager is : " + salary);
	}
	
	void calculateSalary(int Mang_allounc) {
		int salary=basic_salary+HRA+DA+(2*SA)+Mang_allounc;
		 System.out.println("The Salary Manager after allounce is: " + salary);
	}

}


class ProjectManager extends Manager{
	
	int Mang_allounc,Prog_allounce;
	ProjectManager(String name,int emp_id,int basic_salary,int SA,int HRA, int DA){
		super(name,emp_id,basic_salary,SA,HRA,DA);
	}
	void calculateSalary() {
		int salary=basic_salary+(2*HRA)+DA+(2*SA);
		 System.out.println("The Salary Project Manager is : " + salary);
	}
	void calculateSalary(int Mang_allounc,int Prog_allounce) {
		int salary=basic_salary+(2*SA)+(2*HRA)+DA+Mang_allounc+ Prog_allounce;
		 System.out.println("The Salary Project Manager after allounce  is : " + salary);
	}
	
}

//OUTPUT
/*
The Salary is : 6000

The Salary Manager is : 7000
The Salary Manager after allounce is: 10000

The Salary Project Manager is : 8000
The Salary Project Manager after allounce  is : 11000
*/
