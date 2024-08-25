package testleafplaygroundquestions;

public class Factorial {
	
	
	
	public static void main(String[] args) {
		int num=3;
		Factorial resultObj = new Factorial();
		int result = resultObj.factorial(num);	
		
		if (result==-1)        System.out.println("Factorial can be calcualated only for positive numbers");
		else if (result==0)    System.out.println("Factorial of 0 is 1 by convention");
		else            	   System.out.println("Factorial of "+ num + " is " + result);
	}
	
	public int factorial(int num)
	{
		if(num<0) {return -1;}
		else if(num==0) {return 0;}
		else {
			int i;
			int varA=1;
			for (i=num; i>0; i--) 
			{
				varA = varA*i; 
			}
			return varA;
		}
	}	

}
