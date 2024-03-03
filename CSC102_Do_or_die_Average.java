import java.util.Scanner;

public class CSC102_Do_or_die_Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        double sum = 0;
        
        System.out.println("Average of each row:");
        
        for(int i = 0;i < n;i++){
            sum = 0;
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.printf("%.2f",(sum / m));
            System.out.print(" ");
        }
        
        System.out.println("\n" + "Average of each column:");
        
        for(int i = 0;i < m;i++){
            sum = 0;
            for(int j = 0;j < n;j++){
                sum += arr[j][i];
            }
            System.out.printf("%.2f",(sum / n));
            System.out.print(" ");
        }
    }
}
