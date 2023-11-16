/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
   public  ListNode AddTwoNumbers(ListNode l1, ListNode l2,int carry=0)
        {
            int l1Val = l1 != null ? l1.val:0;
            int l2Val = l2 != null ? l2.val : 0;
            ListNode l1Next = l1 != null ? l1.next : null;
            ListNode l2Next = l2 != null ? l2.next : null;

            var result = l1Val + l2Val + carry;
            if (result > 9)
            {
                result %= 10;
                carry = 1;
            }
            else carry = 0;
            if (l1Next == null && l2Next == null)
            {
                if (carry==1)
                {
                    return new ListNode(result,new ListNode(carry));
                }
                return new ListNode(result);
            }
            else
            {
                
                var list = AddTwoNumbers(l1Next, l2Next, carry);
                return new ListNode(result, list);
            }
            
        }
}