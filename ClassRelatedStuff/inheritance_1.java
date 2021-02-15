class Parent{
	int i;
	int j;
	
	Parent(){}
	
	Parent(int i, int j){
			this.i=30;
			this.j=40;
			System.out.println("This is from Parent class");
			System.out.println("I: "+i);
			System.out.println("J: "+j);
		}
		
}

class Child extends Parent{
	int k;
	int l;
	
	Child(){}
	
	Child(int k, int l){
		super(k,l);        //Super keyword used for calling the parent class
		System.out.println("From Child Class ");
		System.out.println("K: "+k);
		System.out.println("L: "+l);
	}
	
}
public class Inheritence {

	public static void main(String[] args) {
		
		Child c1  = new Child(60,70);
	}

}
