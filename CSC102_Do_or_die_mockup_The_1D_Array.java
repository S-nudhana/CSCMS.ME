import java.util.Scanner;
import java.util.Arrays;

public class CSC102_Do_or_die_mockup_The_1D_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
      
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        float avg = (float)sum / (float)n;
        Arrays.sort(arr);
        
        System.out.print("Summation: ");
        System.out.printf("%.2f", sum + 0.0);
        System.out.println("");
        System.out.print("Average: ");
        System.out.printf("%.2f", avg + 0.0);
        System.out.println("");
        System.out.print("Max: ");
        System.out.printf("%.2f", arr[n - 1] + 0.0);
        System.out.println("");
        System.out.print("Min: ");
        System.out.printf("%.2f",arr[0] + 0.0);
    }
}
