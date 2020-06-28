class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = l1;
        ListNode head2 = l2;
        ListNode sum ;
        String first = "";
		String second = "";
		// Pushing first stack 
        Stack<String> s = new Stack<>();
        while(head != null)
        {
            s.push(String.valueOf(head.val));
            head = head.next;
        }
        //popping first 
        while(!s.isEmpty())
		{
			first = first.concat(s.pop());
		}
		//pushing second           
        while(head2 != null)
        {
            s.push(String.valueOf(head2.val));
            head2 = head2.next;
        }
        //poping second
        while(!s.isEmpty())
		{
			second = second.concat(s.pop());
		}
        //convert to int and sum
        Integer tot = Integer.valueOf(first) + Integer.valueOf(second);
		//convert to string
        String out = String.valueOf(tot);
                   
        ListNode sumhead = new ListNode(Integer.parseInt(String.valueOf(out.charAt(out.length()-1))));
        sum = sumhead ;
        for (int i = out.length()-2; i>=0 ; i--)
        {
            sum.next=new ListNode(Integer.parseInt(String.valueOf(out.charAt(i)))) ;//System.out.print(out.charAt(i));
            sum = sum.next;
        }
                   
       return sumhead;
    }
}
