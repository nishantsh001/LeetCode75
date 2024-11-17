
public class ReverseStringWithoutChangingPosition {
	public static void main(String[] args) {
		String string = "Hello World";
		Reverse(string);
	}
	
	static void Reverse(String word) {
		String reverse=" ";
		String [] strings = word.split(" ");
		
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];	
			System.out.println(string);
			
			String revword = "";
			
			for (int j = string.length()-1; j >=0; j--) {
				revword+=string.charAt(j);
			}
			reverse+=revword+"";
		}
		System.out.println(reverse);
	}
}
