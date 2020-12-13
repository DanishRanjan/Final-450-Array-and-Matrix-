import java.util.*;

public class CommonELementinAllRowsOfMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] array = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		CommonELement(array, row, col);
	}

	public static void CommonELement(int[][] arr, int row, int col) {
		Map<Integer, Integer> ans = new HashMap<>();
		for (int j = 0; j < col; j++) {
			ans.put(arr[0][j], 1);
		}

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (ans.get(arr[i][j]) != null && ans.get(arr[i][j]) == i) {
					ans.put(arr[i][j], i + 1);
					if (i == row - 1) {
						System.out.print(arr[i][j] + " ");
					}
				}
			}
		}
	}
}

//4
//5
//1 2 1 4 8
//3 7 8 5 1
//8 7 7 3 1
//8 1 2 7 9
