package testleafplaygroundquestions;

import java.util.Arrays;

public class AnagramSolution {

	public static void main(String[] args) {
		
	String str1="stop";
	String str2="post";
	
	AnagramSolution obj = new AnagramSolution();
	boolean answer = obj.anagramCheck(str1, str2);
	if(answer==true) System.out.println("'"+str1 +"' and '" +str2 + "' are anagrams");
	else System.out.println("'"+str1 +"' and '" +str2 + "' are not anagrams");
	}
	
	public boolean anagramCheck(String string1,String string2)
	{
		if(string1.length()!=string2.length()) {return false;} //check length of both strings are same
			
		char[] arrString1=string1.toCharArray(); //add string in a array
		char[] arrString2=string2.toCharArray();
			
		Arrays.sort(arrString1); //sort array
		Arrays.sort(arrString2);
			
		for (int i=0; i<arrString1.length; i++)
		{
		//	System.out.println(arrString1[i]+" "+arrString2[i]);
			if(arrString1[i]!=arrString2[i])  //check both array at each location
				return false;  
		}
		return true;
	}

}
