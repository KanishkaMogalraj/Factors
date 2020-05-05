
import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
      
       Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=0 && n<=10000)
        {
            int i=2;
            while(i<=n-1)
            {
               if(n%i==0)
               {
                   System.out.print(i+" ");
               }
            
                i++;
            }
        }
        
    }
}