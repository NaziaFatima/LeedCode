package LinkedList;
import java.util.*;
public class FirstUniqueChar {
	
	static HashMap<Character, Integer> map = new HashMap<>();
	
	public static int firstUniqChar(String s) 
	{
		if (s.length() == 0) return -1;
		char[] c_array = s.toCharArray();
        for (int i=0; i < c_array.length; i++)
        {
        	if (!map.containsKey(c_array[i]))
        	{
        		map.put(c_array[i],i);
        		//System.out.println("c_array[i]:" + c_array[i] + "; i = " + i  );;
        	}
        	else 
        		map.put(c_array[i],-1);
        }
        Iterator entries = map.entrySet().iterator();
        Integer value =0 ;
        int prev_val = s.length();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            //Integer key = (Integer)entry.getKey();
             value = (Integer)entry.getValue();
            if(value > -1 && value <prev_val) 
            {
            	prev_val = value;
            }
        }
        if (prev_val == s.length()) return -1;
        return prev_val;
    }
	public static void main(String[] args) {
		
		String arr1 = "";
		
		int out = firstUniqChar(arr1);
		
		System.out.println("Out = "+ out); 
	}

}
