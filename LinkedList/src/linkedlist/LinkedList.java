
package linkedlist;


public class LinkedList {
    Node head; //Head of list
    //This inner class made static so that main can access it
    static class Node
    {
       int data;
       Node next; 
       //constructor
       Node(int d)
       {
           data = d;
           next = null;
       }
    }
    //Method to insert a new node
    public static LinkedList insert(LinkedList list ,int data)
    {
        //create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        
        //if the LinkedList is empty
        //then make the new node as head
        if(list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            //Else traverse till the last node
            //and insert the new node there
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            //insert new_Node at the last Node
            last.next = new_node;
            
        }
        //return the list by Head
        return list;
    }
    
    //Method to print the LinkedList
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList : ");
        //Traverse through the LinkedList
        while(currNode != null)
        {
            //print the data at current node
            System.out.print(currNode.data + " ");
            //Go to next node
            currNode = currNode.next;
        }
            
    }
    public void deleteNode(Node node) {
    node.data = node.next.data;
    node.next = node.next.next;
}

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list , 1);
        list = insert(list , 2);
        list = insert(list , 3);
        list = insert(list , 4);
        list = insert(list , 5);
        list = insert(list , 6);
        list = insert(list , 7);
        
        printList(list);
       // deleteNode(list ,3)
        
                
    }
    
}
