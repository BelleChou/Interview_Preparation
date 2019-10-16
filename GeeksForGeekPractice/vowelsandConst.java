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
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  String s=sc.nextLine();
    	  Geeks obj=new Geeks();
    	  obj.checkString(s);
    	   
    	 }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        int count=0;
        char alpha;
        s = s.replaceAll(" ","");
        
     
        for(int i=0;i<s.length();i++)
        {
            
        alpha=s.charAt(i);
        
        String[] strArray = new String[] {"a","e","i","o","u"};
         
       for (String element : strArray) 
       { 
       
            char vowel=element.charAt(0);
            if (vowel == alpha) 
            { 
             v++;
             
             count=0;
             break;
            }
            else{
                count=1;
            }
          
        }
        
        if(count==1)
        {
            c++;
            
        }
        
        }
 
        if(v>c)
        System.out.println("Yes");
        else if(c>v)
        System.out.println("No");
        else
        System.out.println("Same");
        
   
    }
}














//Position this line where user code will be p