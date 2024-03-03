import java.util.*;

public class CSC102_Do_or_die_Swap_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double temp = 0.00;
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextDouble();
        }
        
        Arrays.sort(arr);
        
        for(int j = 0;j < n / 2;j += 2){
            temp = arr[j];
            arr[j] = arr[n - (j + 1)];
            arr[n - (j + 1)] = temp;
            
            temp = 0.00;
        }
        
        for(int i = 0;i < n;i++){
            System.out.printf("%.2f ",arr[i]);
        }
    }
}
