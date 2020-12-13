import java.util.*;

public class SearchTwoDMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		System.out.println(searchMatrixbyAman(arr, target));
		System.out.println(searchMatrixbyNick(arr, target));

	}

	public static boolean searchMatrixbyAman(int[][] matrix, int target) {
		if (matrix.length == 0) {
			return false;
		}
		int i = 0;
		int j = matrix[0].length - 1;
		while (j >= 0 && i < matrix.length) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}

	public static boolean searchMatrixbyNick(int[][] matrix, int target) {
		if (matrix.length == 0) {
			return false;
		}
		int row = matrix.length;
		int columns = matrix[0].length;
		int left = 0;
		int right = row * columns - 1;
		while (left <= right) {
			int midpoint = left + (right - left) / 2;
			int midpoint_element = matrix[midpoint / columns][midpoint % columns];

			if (midpoint_element == target) {
				return true;
			} else if (midpoint_element < target) {
				left = midpoint + 1;
			} else if (midpoint_element > target) {
				right = midpoint - 1;
			}
		}
		return false;

	}
}
