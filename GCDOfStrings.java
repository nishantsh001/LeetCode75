import java.util.Scanner;

public class GCDOfStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("first string ");
		String string1 = scanner.next();
		
		System.out.println("Second number ");
		String string2 = scanner.next();
		
		System.out.println(gcdOfStrings(string1,string2));
	}
	
	public static String gcdOfStrings(String str1, String str2) {
		if(!(str1+str2).equals(str1+str2)) 
			return "";
		int gcd = getGcd(str1.length(), str2.length());
		return str1.substring(0,gcd);
	}
	
	static int getGcd(int a, int b) {
		if(b==0)
			return b;
		return getGcd(b, b%a);
	}
	
}
