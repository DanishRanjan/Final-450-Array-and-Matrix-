import java.util.*;
public class print_fibonacci {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int t1 = 0;
int t2 = 1;
while(t1<=num) {
	System.out.println(t1);
	int sum =t1+t2;
	t1 = t2;
	t2 = sum;
}
}
}
