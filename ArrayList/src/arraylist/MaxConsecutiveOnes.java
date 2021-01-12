
package arraylist;

//Given a binary array, find the maximum number of consecutive 1s in this array.

//Input: [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.
// The maximum number of consecutive 1s is 3.
public class MaxConsecutiveOnes {
    
    public int maxConsecutiveOne(int a[]){
        
    int count = 0;
    int result = 0;
    
    for(int i = 0; i < a.length; i++)
    {
        if(a[i] == 1)
        {
            count ++;
        }
        else{
            if(count > result){
                result = count;
            }
            count = 0;
        }
    }
    
    if(count > result){
        result = count;
    }
    return result;
    
   }
    
        
    
}
