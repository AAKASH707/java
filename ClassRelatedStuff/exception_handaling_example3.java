//nested try catch
public class Exception_eample_3 {

	public static void main(String[] args) {
		try {
			
			try {
				System.out.println("Arthematic exception handeling");
				int a=10/0; //
			}
			
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		
				int Student_Marks[] = new int[5]; 
				Student_Marks[6]=10;  //inserting input that is out of limit
		}	
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
		    }
			
			catch(Exception e) {
				System.out.println("done");
			}

		finally {
			System.out.println("All exception handeled");
		}

}
}
