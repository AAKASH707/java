class MyClass
{
	int i;
	double j;
	MyClass(){}
	
	MyClass(int x, double y){
		this.i=i;                       //like
		this.j=j;
	}
	
}
public class StaicClass {

	public static void main(String[] args) {
		MyClass mc1 =new MyClass(22,23.5);
		MyClass mc2 =new MyClass(74,25.3);
		System.out.println(mc1.i+"  "+mc1.j);
		System.out.println("Another Obj");
		System.out.println(mc2.i+"  "+mc2.j);

	}

}
// creating class, using "this" opearator which help in callinfg class variable in class  
//beaware of class name
