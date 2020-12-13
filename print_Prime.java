import java.util.*;
public class print_Prime {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for(int i=2;i<=num;i++)
	{
		int temp = 0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				temp = temp+1;
			}
		}
		if(temp==0) {
			System.out.println(i);
		}
	}
}
}
