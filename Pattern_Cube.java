import java.util.Scanner;

public class Pattern_Cube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n * 2) - 1;
        
        for(int i = 1;i <= a;i++){
            if(i < n && i != 1){
                for(int j = 1;j <= a;j++){
                    if(j == a || j == n - i + 1 || j == a - i + 1){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }else if(i == 1){
                for(int l = 1;l <= a;l++){
                    if(l >= n || l == a){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }else if(i == a){
                for(int m = 1;m <= n;m++){
                    System.out.print("*");
                }
            }else if(i == n){
                for(int z = 1;z <= a;z++){
                    if(z <= n || z == a){
                        System.out.print("*");
                    }else{
                        System.out.print("-");
                    }
                }
            }else{
                for(int k = 1;k <= a;k++){
                    if(k == 1 || k == n || k == a + (n - i)){
                        System.out.print("*");
                        if(k == a + (n - i)){
                            break;
                        }
                    }else{
                        System.out.print("-");
                    }
                }
            }  
            System.out.println("");
        }
    }
}
