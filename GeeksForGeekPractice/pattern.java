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
    	   String s=sc.next();
    	   Geeks obj=new Geeks();
    	   obj.follPatt(s);
    	   
    	 }
    }
}
//Position this line where user code will be pasted.

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void follPatt(String s)
    {
       
      System.out.println(iterative(0,s));
    }
    
    static int iterative(int i,String s)
    {
        
        int temp,j,counter=0,jCounter=0,iCounter=0,res=0;
         int n=s.length();
        temp=i;
        for(i=temp;i<s.length();i++)
        {
            if(s.charAt(i)=='y')
            {
                break;
            }
            else
            {
               
                counter++;

            }
        }
        iCounter=counter;
         counter=counter+i;
        //  System.out.println("I values after 1 loop "+i +" Coum value"+counter);
         
          
        for(j=i;j<counter;j++)
        {
            if(s.charAt(j)=='x')
            {
                // System.out.println("wrong");
                break;
            }
            else
            {
                //  System.out.println("Matched " + j);
                 jCounter++;
             
            }
        }
        if(iCounter==jCounter)
        {
            //  System.out.println("Both equal" + iCounter);
             
            n=n-j;
             
             if(j==s.length())
             {
                    // System.out.println("Completed Exe" + iCounter);
                    res=1;
                    return res;
             }
             else if(n==1)
             {
                // System.out.println("outof" + j);
                res=0;
             }
             else 
             {
                    // System.out.println("No done" + j);
                    res=iterative(j,s);
             }
             
        }
        else
        {
            res=0;
        }
        // System.out.println("Comple" + res);
          return res;
    }
}
