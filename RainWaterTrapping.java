import java.util.*; 
public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int buildingSize = sc.nextInt();
			int[] arr = new int[buildingSize];
			for(int i=0;i<buildingSize;i++) {
				arr[i]= sc.nextInt();
			}
			int ans = 0;
			int maxfromLeft = 0;
			int maxfromRight = 0;
			int low = 0;
			int high = buildingSize-1;
			while(low<=high) {
				if(arr[low]<arr[high]) {
					if(arr[low]>maxfromLeft) {
						maxfromLeft = arr[low];
					}
					else {
						ans = ans+(maxfromLeft-arr[low]);
					}
					low++;
				}
				else {
					if(arr[high]>maxfromRight) {
						maxfromRight = arr[high];
					}
					else {
						ans = ans+(maxfromRight-arr[high]);
					}
					high--;
				}
			}
			System.out.println(ans);
		}
	}

}


//1
//6
//3 0 0 2 0 4