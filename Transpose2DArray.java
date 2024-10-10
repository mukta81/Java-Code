package com.selfstudy.arrays;

public class Transpose2DArray {
	public static void main(String[] args) {		
		//1 2 3
	   //4 5 6

		
	//	1 4
	//	2 5
	//	3 6
		
		int[][] array2D = {{1,2,3,5},{4,5,6,9}};
		int[][] arrayNew2D = new int[array2D[0].length][array2D.length];

		for(int k=0; k<array2D.length; k++)   //0,1
		{
			for(int i=0; i<array2D[k].length; i++)   //0,1,2
			{
				arrayNew2D[i][k] = array2D[k][i];

			}
		}
		
		
		System.out.println("Transposed Matrix:");
		for(int i=0; i<arrayNew2D.length; i++)
		{
			for(int j=0; j<arrayNew2D[i].length; j++)
			{
				System.out.print(arrayNew2D[i][j]+" ");
			}
			System.out.println();
		}

	}
}
