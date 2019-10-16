{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   Geeks obj=new Geeks();
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
    

    static int coutChars(String s1, String s2)
    {
     
        // System.out.println(s1.charAt(1));
        
        int j=0,count=0; 
        
        if(s1.length()>s2.length())
        {
            String temp=s2;
            s2=s1;
            s1=temp;
        }
        
 for(int i=0;i<1;i++)
      {
          for(j=i;j<s2.length();j++)
          {
              if(s1.charAt(i)==s2.charAt(j))
              {
                //   System.out.println("If loop"+s2.charAt(j));
                   i++;
                   if(i==s1.length())
                   {
                       break;
                   }
              }
              else
              {
                //   s2=s2.deleteCharAt(j);
                  count++;
                //   System.out.println(s2.charAt(j));
              }
          }
      }
      
      if(s2.length()!=j)
      {
         int temp=s2.length()-j-1;
         count=count + temp;
        //   System.out.println(temp);
      }
    
   return count;
    }
    

       
        // while(true)
        // { 
        //     if(s1.charAt(i)==s2.charAt(j))
        //     {
        //       System.out.println("If loop"+s2.charAt(j)); 
        //       i++;
        //       j++; 
        //     }
        //     else
        //     {
        //         System.out.println("If loop"+s2.charAt(j)); 
        //         j++;
        //         count++;  
        //     } 
            
        //     if(i==s1.length())
        //     {
        //         break;
        //     }
        // } 
        // while(j==s2.length())
        // {
        //     count++;
        // }
      
      
//Geeks for Geeks URL https://ide.geeksforgeeks.org/KtMBlA0vp8
}