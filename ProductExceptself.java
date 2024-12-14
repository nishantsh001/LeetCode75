/*
 Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/
public class ProductExceptself {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		product(arr);
	}
	static void product(int[] arr) {
		int prefix = 1;
		int suffix = 1;
		int result[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = prefix;
			prefix = prefix*arr[i];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("-----------------------");
		
		for (int i = arr.length-1; i >= 0; i--) {
			result[i]*= suffix;
			suffix *= arr[i];
		}
		
		for (int i = result.length-1; i >= 0; i--) {
			System.out.println(result[i]);
		}
	}
}
