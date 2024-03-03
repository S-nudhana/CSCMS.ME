import java.util.Scanner;

public class Partial_Sum1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        for(int i = 0;i < m;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int sum = 0;
            for(int j = n1;j <= n2;j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}