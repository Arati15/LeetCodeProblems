/*
 * Array implementaiton
 */
package arraylist;


public class ArrayList {

    int count = 0;
    public static void main(String[] args) {
        ArrayList o = new ArrayList();   
        int a[] = new int[5];
        for(int j = 0; j < a.length; j++)
        {
            o.insert(a,j);
            
            //a[j] = j;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
        
    }
    
    public void insert (int a[], int val)
    {
        a[count++] = val;
    }
    
}
