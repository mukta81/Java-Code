package challenges;

public class FindCharCount {
	
	
	//find how many times 'e' in the string provided
	public static void main(String[] args) {
		String input ="TestLeaf";
		int count =0;
		char charToCompare = 'e';
		
		char[] ch = input.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]==charToCompare)
			{
			//	System.out.println(" Yes ");
				count+=1;
			}

		}
		System.out.println(count);
		String str = "Hello";
		String substringStr = str.substring(1, 4);
		System.out.println("substring (1,4) to "+ str + " is :" + substringStr);
		
		
		String strFruit = "apple,orange,banana";
		String[] splitArray = strFruit.split(","); 
		for(int i=0; i<splitArray.length; i++)
		{
			System.out.println(splitArray[i]);
		}
		
		
		String strToReplace = "Chennai00345";
     //   String result = strToReplace.replaceAll("\\D+", "");
		// OR
        String result = strToReplace.replaceAll("[^0-9]", "");
        System.out.println(result); // Output: 00345
		
	}

}
