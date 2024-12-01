public class ReverseVowelOfString {
 public static void main(String[] args) {
	
	 String string = "Icecream";
	 System.out.println(reveString(string));
	}
 
 	static String reveString(String string) {
 	   char[] ch = string.toCharArray();
       int start = 0;
       int end = string.length()-1;
       
      while(start<end){
       if(!isVowel(ch[start])){
           start++;
       }
       else if(!isVowel(ch[end])){
           end--;
       }
       else{
           char temp = ch[start];
           ch[start] = ch[end];
           ch[end] = temp;
           start++;
           end--;
       }
      }
      return String.valueOf(ch);
 	}
 	
 	static boolean isVowel(char c) {
 		return  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
 		        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
 	}
}
