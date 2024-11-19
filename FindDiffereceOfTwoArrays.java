import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDiffereceOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int []nums2 = {3,4,5,6};
		
		Find find = new Find();
		System.out.println(find.findDifference(nums1, nums2)); 
	}
}

class Find{
	List<List<Integer>> findDifference(int[] nums1, int[] nums2){
		Set<Integer> nums1Set = new HashSet<Integer>(); 
		
		for (int integer : nums1) {
			nums1Set.add(integer);
		}
		
		Set<Integer> nums2Set = new HashSet<Integer>(); 
		
		for (int integer : nums2) {
			nums2Set.add(integer);
		}
		
		List<Integer> list1 = new ArrayList<Integer>(nums1Set);
		list1.removeAll(nums2Set);
		
		List<Integer> list2 = new ArrayList<Integer>(nums2Set);
		list2.removeAll(nums1Set);
		
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		resultList.add(list1);
		resultList.add(list2);
		
		return resultList;
		
	}
}

