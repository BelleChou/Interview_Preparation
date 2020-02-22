
public class CaseChanger {
 public static void main (String args[]) {
	  
	 
	 char ch='Z';
	 
	 if(ch >= 65 && ch <= 90)
	 {
		 System.out.print(ch+"->"+Character.toLowerCase(ch));
	 }
	 else if(ch >= 97 && ch <= 122)
	 {
		 System.out.print(ch+"->"+Character.toUpperCase(ch));
	 }
		 
 }
}
