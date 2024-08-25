package testleafplaygroundquestions;

public class ReverseStringSolution {
	
	
	public static String reverseString(String input) {
		
		// Write your code here
		
		String ReverseString="";
		for(int i=input.length()-1; i>=0; i--)
		{
			ReverseString+=input.charAt(i);
		}
		
		return ReverseString;
	}

	
	public static void main(String[] args) {
		String str = "TestLeaf";
		String ReverseStr = reverseString(str);
		if(ReverseStr=="") {System.out.println("Invalid Input");}
		else {System.out.println("The Reverse String is:"+ReverseStr);}
	}
}
