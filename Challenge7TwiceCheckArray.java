package challenges;

public class Challenge7TwiceCheckArray {

	public static void main(String[] args) {
		int value=0;
	//	int[] array = {1, 2, 3, 1, 3};
	//	int[] array = {1, 2, 3, 1};
	//	int[] array = {1,2,3,4};
		int[] array = {1,1,1,3,3,4,3,2,4,2};

		for(int i =0; i<array.length; i++)
		{
			//System.out.println(i+" check "+array[i]);
			for(int j=i+1; j<=array.length-1; j++)
			{
				if(array[i]==array[j])
				{
					//System.out.println(array[i]+" is repeated: TRUE ");
					value=1;
				} //end of if
				
				
			} //end of for j
		} // end of for i
		
		
		if(value==1) {System.out.println("TRUE ");}
		else {System.out.println("FALSE ");}

	} //end of main

} //end of class
