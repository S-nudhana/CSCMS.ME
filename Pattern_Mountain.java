import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;
        int[] arr = new int[n];
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > h){
                h = arr[i];
            }
        }
        for(int i = h - 1;i >= 0;i--){
            for(int j = 0;j < n;j++){
                for(int k = 0;k < arr[j] - 1;k++){
                    if(i <= k){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
                for(int k = arr[j];k > 0;k--){
                    if(i < k){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
                }
            }
            System.out.println();
        }
    }
}