class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
					
			Stack<Character> stack = new Stack<Character>();
	        
			for (char c : ch) 
			{ 
	            if(c == '[' || c == '(' || c == '{')
	            	{
	            	stack.push(c);
	            	//System.out.println("Stack = " + stack );
	            	}
	            else//(c == ']' || c == ')' || c == '}')
	            {
	                char temp; 
                    if (stack.isEmpty()) return false;
                         else temp = stack.pop();
	                //System.out.println("temp = " + temp + " c= " + c);
	                //System.out.println("Stack = " + stack );
	                
	                if (c == ']' && temp == '[')
	                	continue;
	                else if (c == ')' && temp == '(')
	                	continue;
	                else if (c == '}' && temp == '{')
	                	continue;
	                else return false;
	            }
	        }  
			    if (stack.isEmpty()) return true;
			    else return false;
	        
}//mthd
}//class
