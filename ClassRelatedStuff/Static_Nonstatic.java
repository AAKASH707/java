//here we learn about static blockexcecutes as default constructor
//used to intalize static member, in execution of program frist static block executes and then rest others.

public class StaticBlock {

	public static void main(String[] args) {
		CheckStatic cs = new CheckStatic();
	    System.out.println("Hellu from Main!:)");
	    System.out.println("Static members "+cs.a+" "+cs.b+".");
	    
	}
}
class CheckStatic{  
	  static int a, b;
	  CheckStatic() { 
	    System.out.println("Basic Constuctor");
	  }
	 
	 static{
	  a=10;
	  b=20;
	  System.out.println("Inside Static !");
	  System.out.println("As noted stic block execute frist #");
	 }
	}
  
  /* OUTPUT */
/* Inside Static !
   As noted stic block execute frist #
   Basic Constuctor
   Hellu from Main!:)
   Static members 10 20.
*/   
