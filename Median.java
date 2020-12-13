import java.util.*;
public class Median {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
}
System.out.println(find_median(arr));
}
public static int find_median(int[] v)
{
    Arrays.sort(v);
    if(v.length%2==1){
        return v[(v.length/2)];
    }
    else{
        return (v[(v.length - 1) / 2] + v[v.length / 2]) / 2; 
        
    }
}
}
