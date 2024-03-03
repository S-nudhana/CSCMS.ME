import java.util.Scanner;

public class Programming_Contest1_Sprinkler {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        int maxR = 0;
        int maxC = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = 0;j < m;j++){
                sum += arr[i][j];
            }
            if(sum > maxR){
                maxR = sum;
                a = i;
            }
        }
        
        for(int i = 0;i < m;i++){
            int sum = 0;
            for(int j = 0;j < n;j++){
                sum += arr[j][i];
            }
            if(sum > maxC){
                maxC = sum;
                b = i;
            }
        }
        int res = maxR + maxC;
        if(arr[a][b] == 1){
            res -= 1;
        }
        System.out.print(res);
    }
}
