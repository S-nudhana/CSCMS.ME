import java.util.Scanner;

public class Pattern_Rectangle5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1;i <= n;i++){
            if(i == 1 || i == n){
                for(int j = 1;j <= n;j++){
                    System.out.print("*");
                }
            }else if(i <= n / 2){
                for(int k = 1;k <= n;k++){
                    if(k == 1 || k == n || k == n - i + 1 || k == i){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }else{
                for(int l = 1;l <= n;l++){
                    if(l == 1 || l == n || l == i || l == n - i + 1){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }
            System.out.println("");
        }
    }
}