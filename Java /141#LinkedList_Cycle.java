public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast;
        if (head!=null && head.next != null) fast = head.next; //checking if list has only one element 
        else return false;
        
        while(slow!=fast)
        {
            if(fast ==null || fast.next==null)
                return false;
            
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
