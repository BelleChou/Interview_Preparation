import java.util.Scanner; 

public class ColorCode {
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		char c = reader.next().charAt(0);
		switch(c) {
		case 'R':System.out.print("Red");
		break;
		case 'B':System.out.print("Blue");
		break;
		case 'G':System.out.print("Green");
		break;
		case 'O':System.out.print("Orange");
		break;
		case 'Y':System.out.print("Yellow");
		break;
		default:System.out.print("Invalid Code");
		}
	}

}


