/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
package arraylist;


public class MoveAllZerosAtEnd {
    public void moveZerosEnd(int a []){
        int n = a.length;
        //count non zero elements
        int count = 0;
        int temp;
        
        for (int i = 0; i < n; i++)
        {
            if(a[i] != 0)
            {
                temp = a[count];
                a[count] = a[i];
                a[i] = temp;
                
                count = count + 1;
            }
        }
    }
}
