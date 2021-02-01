// same as the previous java prog.
//about this command

class MyClass
{
	int i;
	double j;
	MyClass(){}
	
	MyClass(int i, double j){
		this.i=i;
		this.j=j;
	}
	
	MyClass(int i){
		this.i=i;
		this.j=i;
	}
	
}
public class StaicClass {

	public static void main(String[] args) {
		MyClass mc1 =new MyClass(22,23.5);
		MyClass mc2 =new MyClass(74);
		System.out.println(mc1.i+"  "+mc1.j);
		System.out.println("Another Obj");
		System.out.println(mc2.i+"  "+mc2.j);

	}

}

