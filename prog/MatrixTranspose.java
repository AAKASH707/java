//Basic prog for matrix transpose

public class MatrixTranspose {
	public static void main(String[] args) {
		int r, c, i, j, m=2;
		r=Integer.parseInt(args[0]);
		c=Integer.parseInt(args[1]);
		int matrix[][]=new int [5][5];
		int transposeMatrix[][]=new int[5][5];
		
		System.out.println("Row: "+ r);
		System.out.println("Colummn: "+ c);
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				matrix[i][j]=Integer.parseInt(args[m++]);
		
		for(i=0;i<c;i++)
			for(j=0;j<r;j++)
				transposeMatrix[i][j]=matrix[j][i];
		System.out.println("The given matrix is:");
		display(matrix,r,c);	
		System.out.println("The transpose of given matrix is:");
		display(transposeMatrix,c,r);	
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

