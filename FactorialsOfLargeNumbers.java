
import java.util.*;
import java.math.*;

class FactorialOfLargeNumbers {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int number = sc.nextInt();
		    BigInteger factorial = BigInteger.ONE;
		    if(number==1){
		        System.out.println(factorial);
		    }
		    else{
		        for(int i=number;i>=2;i--){
		            factorial = factorial.multiply(BigInteger.valueOf(i));
		        }
		        System.out.println(factorial);
		    }
		}
	}
}