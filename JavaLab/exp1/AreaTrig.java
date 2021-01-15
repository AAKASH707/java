//class name maybe dii for your systemm
public class PrimeNumber {

	public static void main(String[] args) {
		int i=3, j;
		while(i<=1000)
		{
			int count=0;
			for(j=2; j<=i; j++)
			{
				if(i%j==0)
					count+=1;
			}
			if(count==1)
				System.out.println(i+"  ");
			i++;
		}
	}
}
