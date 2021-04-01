public class Exception_Example {

	public static void main(String[] args) 
	{   
    //  no try catch nlock inserted means exception not handled 
		int car_model_no[] = new int[3];
		car_model_no[0]=1012;
		car_model_no[1]=1013;
		car_model_no[2]=1014;
		car_model_no[3]=1015;
		car_model_no[4]=1016;
		
		System.out.println("car model"+car_model_no[4]); //input taking index out that is out of index decleration
	}
}
