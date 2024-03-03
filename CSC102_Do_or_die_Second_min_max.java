import java.util.Scanner;
import java.util.Arrays;

public class CSC102_Do_or_die_Second_min_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    
        float[] arr = new float[n];
        for(int i = 0;i < n;i++){
          arr[i] = sc.nextFloat();
        }
        Arrays.sort(arr);
        float smin = arr[1];
        float smax = arr[n - 2];
    
        System.out.printf("%.2f",smin);
        System.out.print(" ");
        System.out.printf("%.2f",smax);
    }
}
