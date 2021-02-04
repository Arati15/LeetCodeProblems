/*
 * Find middle of linkedlist
 */
package leetcodetesting.LinkedList_Problems;


public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
       /* ListNode curr = head;
        int count = 0;
        int mid;
        
        while(curr != null)
        {
            count ++;
            curr = curr.next;
        }
        
        if(count % 2 == 0)//even 1,2,3,4
        {
            mid = (count/2) + 1;
        }else{
            mid = (count/2) + 1;
        }
        
        ListNode temp = head;
        for(int i = 1; i < mid - 1; i++){
            temp = temp.next;
        }
        temp = temp.next.next;
        
        return temp;
        */
        
         ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
    }
    
}
