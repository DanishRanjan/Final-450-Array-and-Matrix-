import java.util.*;
public class Count_digit {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int find = sc.nextInt();
    int p = 0;
    int count = 0;
	while(num!=0)
	{
		p = num%10;
		if(p==find) {
			count++;
		}
		num = num/10;
	}
	System.out.println(count);
}
}
