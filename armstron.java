import java.util.Scanner;

public class armstron {

	public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int num = sc.nextInt();
      int count = 0;
      
      if(num==0) {
    	  System.out.println("Invalid Input");
      }
      while(num!=0)
      {
    	num = num/10;
    	count++;
      }
      int tc = count;
      System.out.println(tc);
//      int armstrong = 0;
//      while(num!=0)
//      {
//    	  int rem = num%10;
//    	  armstrong+= (int) Math.pow(rem, tc);
//    	  num = num/10;
//    	  
//      }
//     if(armstrong == num)
//     {
//    	 System.out.println("Yes");
//     }
//     else
//     {
//    	 System.out.println("NO");
//     }

	}

}
