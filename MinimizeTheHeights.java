import java.util.*;
public class MinimizeTheHeights {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(getMinDiff(arr, n, k));
}

public static int getMinDiff(int[] arr, int n, int k) {
    Arrays.sort(arr);
    int mindiff = arr[arr.length-1]-arr[0];
	int avg = (arr[0] + arr[arr.length-1])/2;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<avg) {
			arr[i] = arr[i]+k;
		}
		else {
			arr[i] = arr[i]-k;
		}
	}
	Arrays.sort(arr);
	
	int mindiffNew= arr[arr.length-1]-arr[0];
	if(mindiff < mindiffNew) {
		return mindiff;
	}else {
		return mindiffNew;
	}
  }

}


