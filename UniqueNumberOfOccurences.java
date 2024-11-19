import java.util.Arrays;

public class UniqueNumberOfOccurences {
	public static void main(String[] args) {
		int [] arr = {2,2,1,3,3};
		Occurences occurences = new Occurences();
		System.out.println(occurences.numberOfOccurences(arr));
	}
}

class Occurences{
	public boolean numberOfOccurences(int [] arr) {
		
		int[] uo = new int[2001];
		
		for (int i : arr) {
			uo[i+1000]++;
		}
		
		Arrays.sort(uo);
		
		for (int i = 0; i < 2000; i++) {
			if(uo[i]==uo[i+1] && uo[i]!=0) {
				return false;
			}
			
		}
		return true;
	}
}
