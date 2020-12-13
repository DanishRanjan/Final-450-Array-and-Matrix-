import java.util.Scanner;

public class MaxMinInArray {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	for(int j=0;j<n;j++) {
		if(arr[j]>max) {
			max = arr[j];
		}
	}
	System.out.print(max+" ");
	
	for(int k=0;k<n;k++) {
			if(arr[k] < min) {
				min = arr[k];
			}
		}
	System.out.println(min+" ");
	
	
	}
	}

