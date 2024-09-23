class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        //Check if Duplicates are in beginning 
        if(head != null && head.next != null && head.val == head.next.val)
        {
            int dup = head.val;
            while (temp!=null && temp.val == dup)
            {
                if(temp.next != null) temp =temp.next;
                else return null;
            }
            //if (temp.val== dup && temp.next ==null) 
            //return null; 
            //else 
                head = temp;
        }
        temp = head;
        //else //Check for duplicates in middle 
        {   int dup=-1;
            ListNode prev = null;
            while (temp!=null && temp.next !=null)
            {
                if (temp.val == temp.next.val)
                {
                    dup = temp.val;
                    while(temp!=null && temp.val== dup)
                    {
                        temp =temp.next;
                    }
                    if(temp!=null) prev.next = temp;
                }
                if(temp!=null && temp.next!=null && temp.val != temp.next.val)
                {
                    prev = temp;
                }
                if(temp!= null && temp.next != null && dup ==-1) 
                {temp =temp.next; 
                 dup = -1;}
            }
           return head; 
        }
        
    }
}
