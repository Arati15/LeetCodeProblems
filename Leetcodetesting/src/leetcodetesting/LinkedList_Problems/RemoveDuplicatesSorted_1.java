/*
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * Input: head = [1,1,2]
 * Output: [1,2] 
 */
package leetcodetesting.LinkedList_Problems;


public class RemoveDuplicatesSorted_1 {
    
    public Node deleteDuplicates(Node head) {
        Node curr = head;
        
        
        
        while(curr != null && curr.next != null)
        {
            
            if(curr.val != curr.next.val)
            {
                curr = curr.next;
            }
            else{
                     curr.next = curr.next.next;   
            }
            
            
        }
        
        return head;
        
        
    }
    
    
}
