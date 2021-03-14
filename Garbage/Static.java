public class StaticDemo {

	public static void main(String[] args) {
	multi(10,20);
	//creating object as using non-static stuff
	
	StaticDemo ref= new StaticDemo();
	ref.div(4,2);
	ref.div(8,0);

	}
//using static variable 
	
	static void multi(int a, int b) {
	
		System.out.println("Multiplication is :"+(a*b));
	}
	
//now not using static 
	void div(int a, int b) {
		
		if(b!=0) {
			System.out.println("Div is: "+(a/b));
		}
		
		else{
			System.out.println("Enter correct input");
		}
	}

}
