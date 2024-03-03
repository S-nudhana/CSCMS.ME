import java.util.Scanner;
import java.util.Arrays;

public class CSC102_Quiz2_2019_Sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count1 = n - 1;
        int count2 = 0;
          
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0;i < n / 2 + 1;i++){
            while(count1 > (n / 2) - 1){
                System.out.print(arr[count1] + " ");
                break;
            }
            while(count2 < n / 2){
                System.out.print(arr[count2] + " ");
                break;
            }
            count1 -= 1;
            count2 += 1;
        }
    }
}
