
import java.util.*;
public class palindrome{

    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int o = num;
    int rev=0;
    int rem=0;
        while(num!=0)
        {
        rem = num%10;
        rev = rev*10+rem;
        num = num/10;
        }
        if (o==rev)
        {
            System.out.println("Yes, it is palindrome");
        }
        else
        {
            System.out.println("No,it is not a palindrome");
        }
        
    }
}