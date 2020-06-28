/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode lst) {
        Stack<ListNode> stack = new Stack<ListNode>();
        
        ListNode head = lst;
        ListNode temp;
        while (head!= null && head.next!=null)
        {
            temp = head;
            head = head.next;
            temp.next = null;
            stack.push(temp);
           // System.out.println("Stack = " + stack );
        }
        temp = head;
        while (!stack.isEmpty())
        {
            head.next = stack.pop();
            head = head.next;
            //System.out.println("Stack2 = " + stack );
        }
        return temp;
    }
}
