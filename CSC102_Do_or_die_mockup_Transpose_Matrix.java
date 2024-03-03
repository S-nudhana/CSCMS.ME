import java.util.Scanner;

public class CSC102_Do_or_die_mockup_Transpose_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                arr[j][i] = sc.nextInt();
            }
        }
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
