import java.util.Scanner;

public class Fruit_Picker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int day = sc.nextInt();
        int arr[][] = new int[n][m];
        int sum = 0;
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < day;i++){
            int max = 0;
            for(int j = 0;j < n;j++){
                for(int k = 0;k < m;k++){
                    if(max < arr[j][k]){
                        max = arr[j][k];
                    }
                }
            }
            for(int j = 0;j < n;j++){
            	for(int k = 0;k < m;k++){
                	arr[j][k] -= 1;
                }
            }
            found:
            for(int j = 0;j < n;j++){
                for(int k = 0;k < m;k++){
                    if(arr[j][k] == max - 1){
                        arr[j][k] = 0;
                        sum += max;
                        break found;
                    }
                }
            }
        }
     	System.out.print(sum);
    }
}
