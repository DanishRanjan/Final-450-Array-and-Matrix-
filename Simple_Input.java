import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[200000];
		for(int i=0;;i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
			if(sum<0) {
				break;
			}
			else
				System.out.println(arr[i]);
		}
	}
}
