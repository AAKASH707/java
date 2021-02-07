public class MartixMulti {

	public static void main(String arg[]) {
		
		
		int r1, c1, r2, c2, i, j, k,l=3;
		r1=Integer.parseInt(arg[0]);
		c1=Integer.parseInt(arg[1]);
		r2=c1;//condition for matrix multiplication
		c2=Integer.parseInt(arg[2]);
		int matrix1[][]=new int [5][5];
		int matrix2[][]=new int[5][5];
		int result[][]=new int[5][5];
		// first matrix in an array
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				matrix1[i][j]=Integer.parseInt(arg[l++]);
		// second matrix in an array
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				matrix2[i][j]=Integer.parseInt(arg[l++]);
		for(i=0;i<r1;i++)
			for(j=0;j<c2;j++) {
				result[i][j]=0;
				for(k=0;k<c2;k++)
					result[i][j]+=matrix1[i][k]*matrix2[k][j];					
			}
		System.out.println("First matrix is:");
		display(matrix1, r1, c1);	
		System.out.println("Second matrix is:");
		display(matrix2, r2, c2);
		System.out.println("The product matrix is:");
		display(result,r1,c2);		
	}
	//Display function
		static void display(int array[][], int r, int c) {
			int i, j;
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++)
					System.out.print(array[i][j]+" ");
				System.out.println("");
			}
		}
}
