package challenges;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String str = "Testleaf";
		char[] charArray = str.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--)
		{
			System.out.print(charArray[i]);
		}
	}

}
