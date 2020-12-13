import java.util.*;
public class ArrayisaSubsetofAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int m = sc.nextInt();
			int[] arr1 = new int[m];
			int n = sc.nextInt();
			int[] arr2 = new int[n];
			for(int i=0;i<m;i++) {
				arr1[i] = sc.nextInt();
			}
			for(int j=0;j<n;j++) {
				arr2[j] = sc.nextInt();
			}
			int count = 0;
			
			Set<Integer> ans = new HashSet<>();
			for(int i=0;i<m;i++) {
				if(!ans.contains(arr1[i])) {
					ans.add(arr1[i]);
				}
			}
			
			for(int j=0;j<n;j++) {
				if(ans.contains(arr2[j])) {
					count++;
				}
			}
			
			if(count == n) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
}
