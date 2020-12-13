import java.util.*;
public class KadaneAlgo {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-->0) {
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println(arrMaxConsecutiveSum(arr, n));
	//arrMaStartingandEndingIndex(arr, n);
	}
}

public static int arrMaxConsecutiveSum(int[] inputArray, int n) {
	int max_sum = inputArray[0];
	int current_sum = max_sum;
	for(int i=1;i<n;i++)
	{
		current_sum = Math.max(inputArray[i]+current_sum, inputArray[i]);
		max_sum = Math.max(current_sum, max_sum);
	}
	return max_sum;
}

public static void arrMaStartingandEndingIndex (int[] inputArray, int n)
{
	int max=inputArray[0], start=0, end=0, fstart=0,fend=0,current_max=inputArray[0];
	for(int i=1;i<n;i++)
		{
			if(inputArray[i]> inputArray[i]+current_max)
			{
				current_max = inputArray[i];
				start = i;
				end=i;
			}
			else 
			{
				current_max = current_max+inputArray[i];
				end=i;
			}
			
			if(current_max> max)
			{
				max = current_max;
				fstart = start;
				fend = end;
			}
		}
	System.out.println(fstart+" "+fend);

}


}
