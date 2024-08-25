package testleafplaygroundquestions;

public class PrimeOrNotSolution {	
	public static void main(String[] args) {
		// Write your code here		
		  int isthisPrime = 11;
	      boolean finalAnswer = isPrime(isthisPrime);
	      System.out.println(finalAnswer);
	}
	public static boolean isPrime(int num) {
			// Write your code here	
		if (num>=1) 
		   {
			for(int i=2; i<num; i++)
				{
					int j=num%i;
					if(j==0) {return false;}
					else {continue;}
				}
	
			}
			
			else 
			{
				return false;
			}


			return true;
		} //end of method isPrime

} // end of class Solution