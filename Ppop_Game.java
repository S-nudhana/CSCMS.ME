import java.util.Scanner;

public class Ppop_Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0;i <= 300;i++){
            for(int j = 0;j < n;j++){
                if(i == arr[j]){
                    System.out.print((j + 1) + " ");
                }else{
                    continue;
                }
            }
        }
    }
}
