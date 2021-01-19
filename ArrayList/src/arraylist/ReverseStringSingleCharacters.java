/*
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */ 
package arraylist;


public class ReverseStringSingleCharacters {
    public void reverseString(char [] s){
        int n = s.length;
        int start = 0;
        int last = n - 1;
        
        while(start < last)
        {
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start ++;
            last --;
        }
    }
    
}
