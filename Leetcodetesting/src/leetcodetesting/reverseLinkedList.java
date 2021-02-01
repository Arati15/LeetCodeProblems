
package leetcodetesting;


public class reverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head;
        
        while(curr != null){
            
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }
        
        return prev;
        
    }
    
}
