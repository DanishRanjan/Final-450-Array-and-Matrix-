import java.util.*;

public class MedianOfSortedArrayOfDifferentSize {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for(int i=0;i<m;i++) {
			arr1[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(findMedianSortedArrays(arr1, arr2));

	}

	public static double findMedianSortedArrays(int[] input1, int[] input2) {
		if (input1.length > input2.length) {
			return findMedianSortedArrays(input2, input1);
		}
		int x = input1.length;
		int y = input2.length;
		int low = 0;
		int high = x;
		while (low <= high) {
			int partitionX = (low + high) / 2;
			int partitionY = ((x + y + 1) / 2) - partitionX;

			// If partitionX is 0, it means there is nothing on the left side, use (-OO) for
			// maxLeftX;
			// If partitionX is the length of input then there is nothing on the right side,
			// then use (+OO) for minRightX;

			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

			if (maxLeftX <= minRightY && maxLeftY < minRightX) {
				if ((x + y) % 2 == 0) {
					return ((double) Math.max(maxLeftX, maxLeftY) + Math.max(minRightX, minRightY)) / 2;
				} else {
					return ((double) Math.max(maxLeftX, maxLeftY));
				}
			}

			else if (maxLeftX > minRightY) {
				high = partitionX - 1;
			} else {
				low = partitionX + 1;
			}

		}
		// Only we can come here is if input arrays were not sorted , throw it in that
		// scenario
		throw new IllegalArgumentException();

	}
}
