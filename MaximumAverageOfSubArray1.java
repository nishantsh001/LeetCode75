
public class MaximumAverageOfSubArray1 {
	public static void main(String[] args) {
		int[] num = {1,12,-5,-6,50,3};
		int k = 4;
		MaximumSubArray maximumSubArray = new MaximumSubArray();
		System.out.println(maximumSubArray.maxArray(num, k));
	}
}

class MaximumSubArray{
	public double maxArray(int[] nums, int k) {
		double ans = 0;
		double sum = 0;
		
		for(int i = 0; i < k; i++)
			sum +=nums[i];
		ans = sum/k;
		
		for(int right = k; right<nums.length; right++) {
			sum += nums[right]-nums[right-k];
			ans = Math.max(ans, sum/k);
		}
		return ans;
	}
}
