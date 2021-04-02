/* Inner class for more info refer JavaTpoint */
class out_1{
	private int value=100;

	class Inner_1{
		void output() {
			System.out.println("Value from inner class -->");
			System.out.println("Value retun: "+value); //acessing private value from other class to this 
		}
	}
}

public class Inner_class_eg {
	public static void main(String[] args) {
	out_1 o =new out_1(); //creating object of outer class 
	out_1.Inner_1 I = o.new Inner_1(); //object for inner class of outer class type
	I.output();
	}
	
}
