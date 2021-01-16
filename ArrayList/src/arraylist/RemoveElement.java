/*
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 */
package arraylist;


public class RemoveElement {
    
    public int removeElement(int a[], int val)
    {
        int n = a.length;
        int i = 0;
        while(n > i)
        {
            if(a[i] == val)
            {
                a[i] = a[n - 1];
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
}
