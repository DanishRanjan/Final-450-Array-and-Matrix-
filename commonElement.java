import java.util.*;
public class commonElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int[] arr1 = new int[x];
		int[] arr2 = new int[y];
		int[] arr3 = new int[z];
		
		for(int i=0;i<x;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j=0;j<y;j++) {
			arr2[j] = sc.nextInt();		
		}
		for(int k=0;k<z;k++) {
			arr3[k] = sc.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		int i=0;
		int j=0;
		int k=0;
		while(i<x && j<y && k<z) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				ans.add(arr1[i]);
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		 
		for(int no:ans) {
			System.out.print(no+" ");
		}
		
	}
}

//3
//6
//4
//2 4 8
//2 3 4 8 10 16
//2 8 14 40
