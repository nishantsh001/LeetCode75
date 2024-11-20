/*
 * 
["RecentCounter","ping","ping","ping","ping"]
[[],[1],[100],[3001],[3002]]
*/

import java.util.ArrayList;
import java.util.List;

public class NumberOfRecentCalls {
	public static void main(String[] args) {
		RecentCounter recentCounter = new RecentCounter();
		System.out.println(recentCounter.ping(1));
		System.out.println(recentCounter.ping(100));
		System.out.println(recentCounter.ping(3001));
		System.out.println(recentCounter.ping(3002));
	}
}
class RecentCounter{
	List<Integer> list;
	int i;
	int j;
	public RecentCounter() {
		list = new ArrayList();
		i = 0;
		j = -1;
	}
	
	public int ping(int t) {
		list.add(t);
		j++;
		while (i<j&&list.get(j)-3000>list.get(i)) {
			i++;
		}
		return j - i + 1;
	}
}