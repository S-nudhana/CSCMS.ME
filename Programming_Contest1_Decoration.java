import java.util.Scanner;
import java.util.Arrays;

public class Programming_Contest1_Decoration {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0;i < m;i++){
            int a = sc.nextInt();
            for(int j = 0;j < n;j++){
                if(arr[j] >= a){
                    System.out.println(arr[j]);
                    arr[j] = 0;
                    break;
                }else if(j == n - 1){
                    System.out.println("-1");
                }else{
                    continue;
                }
            }
        }
    }
}
