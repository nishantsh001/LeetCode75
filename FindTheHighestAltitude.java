/*
  Input: gain = [-5,1,5,0,-7]
	Output: 1
	Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */

import java.util.Scanner;

public class FindTheHighestAltitude {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Size of an array ");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		
		System.out.println("values ");
		for(int i = 0; i<arr.length;i++) {
			int input = scanner.nextInt();
			arr[i] = input;
		}
		System.out.println(largestAltitude(arr));
	}
	static int largestAltitude(int[] num) {
		int currentAltitude = 0;
		int highestPoint = 0;
		for (int i = 0; i < num.length; i++) {
			currentAltitude = num[i]+currentAltitude;
			if(currentAltitude>highestPoint)
				highestPoint=currentAltitude;
		}
		return highestPoint;
	}
}
