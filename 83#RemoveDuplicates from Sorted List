class Solution {
    public ListNode deleteDuplicates(ListNode temp) {
        ListNode head = temp;
        while(head!=null)
        {
            if (head.next != null && head.val == head.next.val)
            {
                ListNode dup = head.next;
                head.next= dup.next;
            }
            else
            head = head.next;
        }
        return temp;
    }
}
