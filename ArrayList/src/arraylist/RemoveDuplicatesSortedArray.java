/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4]
 */
package arraylist;


public class RemoveDuplicatesSortedArray {
    public int revoveDuplicate(int a[])
    {
        int n = a.length;
        if(n == 0){
            return 0;
        }
        
        //take i as a slow pointer and j as a fast pointer because of sorted array
        int i = 0;
        //j start with 1
        for (int j = 1; j < n ; i++)
        {
            if(a[j] != a[i])
            {
                i++;
                a[i] = a[j];
            }
        }
        return i + 1;
    }
    
}
