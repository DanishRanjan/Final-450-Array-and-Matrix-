import java.util.*;
public class perfectSquare {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double n = sc.nextDouble();
	double no = Math.sqrt(n);
	if(no - Math.floor(no)==0) {
		System.out.println("Yes, It's a perfect square");
	}else {
		System.out.println("No, It is not a perfect square");
	}
}
}
