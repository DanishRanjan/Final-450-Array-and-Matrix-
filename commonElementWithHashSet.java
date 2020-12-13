import java.util.*;

public class commonElementWithHashSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[n3];

		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int j = 0; j < n2; j++) {
			arr2[j] = sc.nextInt();
		}
		for (int k = 0; k < n3; k++) {	
			arr3[k] = sc.nextInt();
		}

		Solution sol = new Solution();
		ArrayList<Integer> res = sol.commonElements(arr1, arr2, arr3, n1, n2, n3);
		if (res.size() == 0) {

		} else {
			for (int i = 0; i < res.size(); i++) {
				System.out.print(res.get(i) + " ");
			}
		}

	}

	public static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3, int n1, int n2, int n3) {

		Set<Integer> ans = new HashSet<>();
		int i=0,j=0,k=0;
		while(i<n1 && j<n2 && k<n3) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				ans.add(arr1[i]);
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j]){
				i++;
			}
			else if(arr2[j]<arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		for(int item:ans) {
			finalList.add(item);
		}
		Collections.sort(finalList);
		return finalList;
	}

}
