import java.util.Scanner;

public class Raining1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i < m;i++){
            int st = sc.nextInt();
            int sp = sc.nextInt();
            for(int j = st;j <= sp;j++){
                arr[j - 1] += 1;
            }
        }
        
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}