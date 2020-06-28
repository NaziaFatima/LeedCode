public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> myset = new HashSet<>();
        
        while(head!=null)
        {
            if (myset.contains(head)) 
                return head.next;
            else 
                myset.add(head);
        }
        return null;
}
}
