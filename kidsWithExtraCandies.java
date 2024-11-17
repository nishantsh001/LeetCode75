/*Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] */

import java.util.ArrayList;
import java.util.List;

public class kidsWithExtraCandies {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		Solution solution = new Solution();
	    List<Boolean> booleans =  solution.kidsWithCandies(candies, extraCandies);
		System.out.println(booleans);
	}}

class Solution{
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		List<Boolean> list = new ArrayList<Boolean>();
		
		int max = 0;
		
		for (int i : candies) {
			if(max < i)
				max = i;
		}
		
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] + extraCandies >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}
}
