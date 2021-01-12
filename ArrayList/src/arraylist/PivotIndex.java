
package arraylist;


public class PivotIndex {
    public int pivotIndex (int [] a)
    {
        
        int sum = 0;
        int leftSum = 0;
        
         //check if array is empty
        if(a.length == 0){
            return -1;
        }
        
        //find total of array element
        
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        
        for(int i = 0; i < a.length; i++)
        {
            sum = sum - a[i];
            
            if(leftSum == sum){
                return i;
            }
            leftSum = leftSum + a[i];
        }
        
        return -1;
    }
    
    
}
