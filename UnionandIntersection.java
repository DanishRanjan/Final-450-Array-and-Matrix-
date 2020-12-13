	import java.util.*;
	public class UnionandIntersection {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];
		for(int i=0;i<m;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			arr2[j] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		printUnion(arr1, arr2, m, n);
		//printIntersection(arr1, arr2, m, n);
		
	}
	
	public static void printUnion(int arr1[], int arr2[], int m, int n) {
		
		int i=0, j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				System.out.print(arr2[j]+" ");
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		while(i<m) {
			System.out.println(arr1[i]);
			i++;
		}
		while(j<n) {
			System.out.println(arr2[j]);
			j++;
		}
	}
	
	public static void printIntersection(int arr1[], int arr2[], int m, int n) {
		
		int i=0;
		int j=0;
		while(i<m && j<n) {
			while((i<m-1) && (arr1[i]==arr1[i+1])) {
				i++;
			}
			while((j<n-1) && (arr2[j]==arr2[j+1])) {
				j++;
			}
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		
	}
	
	
	}
