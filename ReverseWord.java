
/*Input: s = "the sky is blue"
Output: "blue is sky the"
*/

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Type: ");
		String string = scanner.nextLine();
		
		System.out.println(reverse(string));
		
	}
	
	 static String reverse(String string) {
		 String[] str = string.trim().split(" ");
		 StringBuilder stringBuilder = new StringBuilder();
		 
		 for (int i = str.length-1; i >= 0; i--) {
			if(str[i].length()>0) {
				stringBuilder.append(str[i]);
				stringBuilder.append(" ");
			}
		}
		 return stringBuilder.substring(0, stringBuilder.length()-1).toString();
	 }
}
