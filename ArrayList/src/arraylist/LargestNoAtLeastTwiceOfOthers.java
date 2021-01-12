/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

//ex. int a [] = []6,3,0,1]
public class LargestNoAtLeastTwiceOfOthers {
    
    public int dominantIndex(int a [])
    {
        int maxIndex = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[maxIndex])
            {
                maxIndex = i;
            }
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(maxIndex != i && a[maxIndex] < 2 * a[i])
            {
                return -1;
            }
        }
        
        
       
       return maxIndex; 
        
    }
    
    
}
