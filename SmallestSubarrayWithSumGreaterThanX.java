import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int sizeOfArray = sc.nextInt();
		    int[] arr = new int[sizeOfArray];
		    int x = sc.nextInt();
		    for(int i=0;i<sizeOfArray;i++){
		        arr[i] = sc.nextInt();
		    }
		    int sum = 0;
		    int minimumCountIndex = Integer.MAX_VALUE;
		    int startingIndex = 0;
		    int endingIndex = 0;
		    while(startingIndex<=endingIndex && endingIndex<sizeOfArray ){
		        while(sum<=x && endingIndex<sizeOfArray){
		            sum = sum+arr[endingIndex];
		            endingIndex++;
		        }
		        while(sum>x){
		            minimumCountIndex = Math.min(minimumCountIndex, endingIndex-startingIndex);
		            sum = sum-arr[startingIndex];
		            startingIndex++;
		        }
		    }
		    System.out.println(minimumCountIndex);
		}

	}

}
