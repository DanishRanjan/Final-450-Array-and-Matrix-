import java.util.*;
public class Shopping_Game {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int t  = sc.nextInt();
	int m = sc.nextInt();
	int n = sc.nextInt();
	int sumAyu = 0;
	int sumHar = 0;
	int change = 1;
	while(t>0) {
	sumAyu = sumAyu+change;
	change++;
	if(sumAyu>m) {
		System.out.println("Harshit Won");
		break;
	}
	
	sumHar = sumHar+change;
	change++;
	if(sumHar>n) {
		System.out.println("Aayush Won");
		break;
	}
	t--;
	
	}	
}
}
