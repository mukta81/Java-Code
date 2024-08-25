package challenges;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		String input = "amazon";
		//output: a-2, m-1, z-1, o-1, n-1  (occurrence of each)
		
		char[] charArray=input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<charArray.length; i++)
		{
			if(map.containsKey(charArray[i]))
			{
				int value = map.get(charArray[i]);
				map.put(charArray[i], value+1);
			}else
			{
			map.put(charArray[i], 1);
			}
		}
	System.out.println(map);
	}

}
